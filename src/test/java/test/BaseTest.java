package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import steps.Step;

public class BaseTest {

	protected Step steps;

	@BeforeTest
	public void initSteps() {
		steps = new Step();
		steps.initBrowser();
	}

	@AfterTest
	public void closeDriver() {
		steps.closeDriver();
	}
}
