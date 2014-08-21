package com.library;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverLib1 {

	protected WebDriver driver;
	
	public void initDriver(String browser) {
		
		if(browser.equals("firefox"))
		{
			
		driver=new FirefoxDriver();
		}
		else if(browser.equals("iexplore"))
		{
			System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	public void quitDriver() {
		driver.quit();
	}
}
