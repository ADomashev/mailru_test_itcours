package steps;

import org.openqa.selenium.WebDriver;

import driver.DriverSingleton;
import pages.BoxMailPage;
import pages.EmailWritePage;
import pages.MainPage;
import pages.SentEmailPage;

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
		mainPage.openPage();
		mainPage.login(login, pass);
		// TODO waits
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mainPage.getNameEmail();
	}

	// String toWhom, String themeEmail, String textEmail
	public void writeMail() {

		BoxMailPage boxMailPage = new BoxMailPage(driver);
		boxMailPage.pressButtonWriteMail();
		EmailWritePage emailWritePage = new EmailWritePage(driver);
		emailWritePage.writeLetter();
	}

	public String findLetter(String destinationEmail) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		BoxMailPage boxMailPage = new BoxMailPage(driver);
		boxMailPage.openPage();
		boxMailPage.selectSentLetters();
		SentEmailPage sentEmailPage = new SentEmailPage(driver);
		sentEmailPage.openPage();
		return sentEmailPage.findLetter(destinationEmail);
	}

}
