package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginToEmail extends BaseTest {

	private static final String expectedNameEmail = "tathtp@mail.ru";
	private static final String LOGIN = "tathtp";
	private static final String PASS = "Klopik123";
	private static final String EXP_EMAIL_ADDRESS = "alekseidomashevsky@gmail.com";

	@Test
	public void testLoginEmail() {
		Assert.assertEquals(steps.loginMail(LOGIN, PASS), expectedNameEmail);
	}

	@Test
	public void testSendMail() {
		steps.writeMail();
		Assert.assertEquals(steps.findLetter("alekseidomashevsky@gmail.com"), EXP_EMAIL_ADDRESS);
	}
}
