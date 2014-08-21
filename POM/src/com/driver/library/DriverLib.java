package com.driver.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.altoro.testdata.LoadData;

public class DriverLib {
	
	protected WebDriver driver;
	
	public void loadDriver(String browser) {
		
		if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.bin", "C:\\Users\\319468\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			driver=new FirefoxDriver();
		}
			
		else if(browser.equals("iexplore"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("Invalid Browser, Please choose the relevant browser");
			System.exit(0);
		}
		
			
	}
	
	@BeforeClass
	public void preConfig() {
		LoadData.loadPropertyFiles();
	}

	@BeforeMethod
	public void setUp() {
		loadDriver(LoadData.getTestData("browser"));
		
	}
	
	@AfterMethod
	public void terminate() {
		driver.quit();
	}
	

}
