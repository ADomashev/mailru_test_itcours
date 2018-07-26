package steps;

import org.openqa.selenium.WebDriver;

import driver.DriverSingleton;
import pages.MainPage;

public class Step {
	
	private WebDriver driver;
	
	
	public void initBrowser() {

		driver = DriverSingleton.DRIVER_INSTANCE.getDriver();
	}

	public void closeDriver() {
		
		DriverSingleton.DRIVER_INSTANCE.closeDriver();
	}
	
	public String loginMail(String login, String pass) {
		MainPage mainPage = new MainPage(driver);
		mainPage.login(login, pass);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mainPage.getNameEmail();
	}
}
