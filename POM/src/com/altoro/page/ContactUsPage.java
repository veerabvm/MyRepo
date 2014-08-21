package com.altoro.page;

import org.openqa.selenium.WebDriver;

import com.altoro.testdata.LoadData;

public class ContactUsPage {
	
	WebDriver driver;
	public String ContactUsHeading=LoadData.getObject("ContactUsHeading");
	
	public ContactUsPage(WebDriver driver)
	{
		this.driver=driver;
			
	}

}
