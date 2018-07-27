package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginToEmail extends BaseTest {

	private static final String expectedNameEmail = "tathtp@mail.ru";
	private static final String LOGIN = "tathtp";
	private static final String PASS = "Klopik123";
	private static final String EXP_EMAIL_ADDRESS = "alekseidomashevsky@gmail.com";
	private static final String RECEPIENT_ADDRESS = "alekseidomashevsky@gmail.com";
	private static final String THEME_LETTER = "HomeWork Selenium";
	private static final String TEXT_LETTER = "It's my home work";

	@Test
	public void testLoginEmail() {
		Assert.assertEquals(steps.loginMail(LOGIN, PASS), expectedNameEmail);
	}

	@Test
	public void testSendMail() {
		steps.writeLetter(RECEPIENT_ADDRESS,THEME_LETTER,TEXT_LETTER);
		Assert.assertEquals(steps.findLetter(RECEPIENT_ADDRESS), EXP_EMAIL_ADDRESS);
	}
}
