package pages;

import org.openqa.selenium.WebDriver;

import util.PropertyProvider;

public abstract class BasePage {

	protected WebDriver driver;
	protected PropertyProvider prProvider;

	public abstract void openPage();

	public BasePage(WebDriver driver) {
		prProvider = new PropertyProvider(
				"C:\\MyFiles\\ProgrammingCourses\\IDE\\WorkSpace\\mailru-test\\src\\test\\resources\\locators.properties");
		this.driver = driver;
	}

}
