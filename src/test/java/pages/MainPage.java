package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

	public static final String URL = "https://mail.ru/";

	private WebElement loginField;

	private WebElement passField;

	private WebElement submitButton;

	private WebElement nameEmail;

	public MainPage(WebDriver driver) {
		super(driver);
	}

	public String getNameEmail() {
		nameEmail = driver.findElement(By.xpath(prProvider.getProperty("nameEmail")));
		return nameEmail.getText();
	}

	public void login(String login, String pass) {
		loginField = driver.findElement(By.xpath(prProvider.getProperty("loginField")));
		loginField.sendKeys(login);
		passField = driver.findElement(By.xpath(prProvider.getProperty("passField")));
		passField.sendKeys(pass);
		submitButton = driver.findElement(By.xpath(prProvider.getProperty("submitButton")));
		submitButton.click();
		submitButton.click();
	}

	@Override
	public void openPage() {
		driver.navigate().to(URL);

	}

}
