package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoxMailPage extends BasePage {
	private WebElement writeMailButton;
	
	
	public BoxMailPage(WebDriver driver) {
		super(driver);
	}
	
	public void pressButtonWriteMail() {
		List<WebElement> listElem = driver.findElements(By.xpath(prProvider.getProperty("writeMailButton")));
		writeMailButton = listElem.get(0);
		writeMailButton.click();
	}

	@Override
	public void openPage() {
		driver.navigate().to("https://e.mail.ru/");
		
	}
	
}
