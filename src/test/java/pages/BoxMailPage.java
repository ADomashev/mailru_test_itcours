package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoxMailPage extends BasePage {

	private static final String URL = "https://e.mail.ru/";

	private WebElement writeMailButton;

	private WebElement sentLetters;

	public BoxMailPage(WebDriver driver) {
		super(driver);
	}

	public void pressButtonWriteMail() {
		List<WebElement> listElem = driver.findElements(By.xpath(prProvider.getProperty("writeMailButton")));
		writeMailButton = listElem.get(0);
		writeMailButton.click();
	}

	public void selectSentLetters() {
		sentLetters = driver.findElement(By.xpath(prProvider.getProperty("sentLetters")));
		sentLetters.click();
	}

	@Override
	public void openPage() {
		driver.navigate().to(URL);

	}

}
