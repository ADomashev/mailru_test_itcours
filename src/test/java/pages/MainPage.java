package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage{
	
	private WebElement loginField;
	
	private WebElement passField;
	
	private WebElement submitButton;
	
	private WebElement nameEmail;
	
	public MainPage(WebDriver driver) {
		super(driver);
		driver.get("https://mail.ru/");
	}
	
//	tathtp@mail.ru
	
	
	public String getNameEmail() {
		nameEmail = driver.findElement(By.xpath("//*[@id=\"PH_user-email\"]"));
		return nameEmail.getText();
	}
	
	public void login(String login, String pass) {
		loginField = driver.findElement(By.xpath("//div[@id='mailbox:loginContainer']//child::input"));
		loginField.sendKeys(login);
		passField = driver.findElement(By.xpath("//child::div[@class='mailbox__input__container']//child::input"));
		passField.sendKeys(pass);
		submitButton = driver.findElement(By.xpath("//label[@id='mailbox:submit']//child::*"));
		submitButton.click();
		
	
		
		submitButton.click();
	}
	
	
	
	
	
	

	@Override
	public void openPage() {
		
	}
	
}
