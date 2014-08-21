package com.altoro.page;

import org.openqa.selenium.WebDriver;

import com.altoro.testdata.LoadData;
import com.driver.library.ActionLib;

public class LoginPage extends ActionLib{
	
	WebDriver driver;
	public String Username=LoadData.getObject("Username");
	public String Password=LoadData.getObject("Password");
	public String Submit=LoadData.getObject("Submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
			
	}
	
		
	public void login(String un, String pw) {
		type(Username, un);
		type(Password, pw);
		clickOnElement(Submit);
	}
	
	
	
	

}
