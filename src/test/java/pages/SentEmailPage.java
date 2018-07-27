package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class SentEmailPage extends BasePage {

	private static final String URL = "https://e.mail.ru/messages/sent/";

	private List<WebElement> listSentLetters;

	public SentEmailPage(WebDriver driver) {
		super(driver);
	}

	public String findLetter(String destinationEmail) {

		WebElement elementBeforeList = driver.findElement(By.xpath(prProvider.getProperty("elementBeforeList")));
		listSentLetters = elementBeforeList.findElements(By.xpath(prProvider.getProperty("listSentLetters")));
		for (WebElement letter : listSentLetters) {
			String emailDestAdr = letter.getAttribute("title");
			if (emailDestAdr.equals(destinationEmail)) {
				letter.click();
				return emailDestAdr;
			}
		}
		return "";
	}

	@Override
	public void openPage() {
		driver.navigate().to(URL);

	}

}
