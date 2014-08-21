package com.altoro.page;

import org.openqa.selenium.WebDriver;

import com.altoro.testdata.LoadData;
import com.driver.library.ActionLib;

public class HomePage extends ActionLib {

	public String SignIn = LoadData.getObject("SignInLink");
	public String ContactUs = LoadData.getObject("ContactUsLink");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void loadHomePage() {
		openUrl(LoadData.getTestData("URL"));
	}

	public LoginPage loadSignInPage() {
		clickOnElement(SignIn);
		return new LoginPage(driver);
	}

	public ContactUsPage loadContactUsPage() {
		clickOnElement(ContactUs);
		return new ContactUsPage(driver);
	}

}
