package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailWritePage extends BasePage {

	private static final String URL = "https://e.mail.ru/compose/";

	private WebElement elemToWhom;
	private WebElement elemThemeEmail;
	private WebElement elemBodyEmail;
	private WebElement elemEmailBodyFrame;
	private WebElement elemButtonSend;

	public EmailWritePage(WebDriver driver) {
		super(driver);

	}

	// TODO Methods
	public void writeLetter() {
		String frameBefore = driver.getWindowHandle();
		elemToWhom = driver.findElement(By.xpath(prProvider.getProperty("elemToWhom")));
		elemToWhom.sendKeys("alekseidomashevsky@gmail.com");

		elemThemeEmail = driver.findElement(By.xpath(prProvider.getProperty("elemThemeEmail")));
		elemThemeEmail.sendKeys("HomeWork Selenium");

		elemEmailBodyFrame = driver.findElement(By.xpath(prProvider.getProperty("elemEmailBodyFrame")));

		driver.switchTo().frame(elemEmailBodyFrame);

		elemBodyEmail = driver.findElement(By.xpath(prProvider.getProperty("elemBodyEmail")));
		elemBodyEmail.sendKeys("It's my home work");

		driver.switchTo().window(frameBefore);
		elemButtonSend = driver.findElement(By.xpath(prProvider.getProperty("elemButtonSend")));
		elemButtonSend.click();
	}

	@Override
	public void openPage() {
		driver.navigate().to(URL);

	}

}
