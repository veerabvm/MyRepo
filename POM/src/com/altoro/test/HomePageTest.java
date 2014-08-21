package com.altoro.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.altoro.page.HomePage;
import com.driver.library.DriverLib;

public class HomePageTest extends DriverLib{
	
	
	@Test(groups="UAT")
	public void SignInLinkVerificationTest() {
		
		HomePage hp=new HomePage(driver);
		hp.loadHomePage();
		hp.loadSignInPage();
		assertEquals(driver.getTitle(), "Altoro Mutual: Online Banking Login");
	}
	
	@Test
	public void ContactUsLinkVerificationTest() {
		HomePage hp=new HomePage(driver);
		hp.loadHomePage();
		hp.loadContactUsPage();
		assertTrue(driver.getCurrentUrl().contains("inside_contact.htm"));
	}

}
