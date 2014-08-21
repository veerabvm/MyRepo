package com.altoro.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.altoro.page.HomePage;
import com.altoro.page.LoginPage;
import com.altoro.testdata.LoadData;
import com.driver.library.DriverLib;

public class LoginPageTest extends DriverLib{
	
	
	@Test
	public void validLoginTest() {
		HomePage hp=new HomePage(driver);
		hp.loadHomePage();
		LoginPage lp=hp.loadSignInPage();
		lp.login(LoadData.getTestData("Username"), LoadData.getTestData("Password"));
		assertTrue(driver.getCurrentUrl().contains("main.aspx"));
	}
	
	@Test
	public void loginWithEmptyUsername() {
		HomePage hp=new HomePage(driver);
		hp.loadHomePage();
		LoginPage lp=hp.loadSignInPage();
		lp.login("", LoadData.getTestData("Password"));
		assertEquals(driver.switchTo().alert().getText(), LoadData.getTestData("ErrorMsgForInvalidUsername"));
	}

}
