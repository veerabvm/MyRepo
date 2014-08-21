package com.page.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.library.Action;

public class HomePage extends Action{
	
	Properties prop=new Properties();

	public HomePage(WebDriver driver, String url)throws IOException {
		this.driver=driver;	
		goToUrl(url);
		prop.load(new FileInputStream("Locators.properties"));
	}
	
	public void search(String text) {
		
		type(prop.getProperty("SearchField"),text);
		click(prop.getProperty("SearchBtn"));
	}
	
	public String getResultText()
	{
		return getElementText(prop.getProperty("ResultText"));
	}
}
