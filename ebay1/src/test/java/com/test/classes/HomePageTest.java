package com.test.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;








import org.testng.Assert;
import org.testng.annotations.*;

import com.library.DriverLib;
import com.page.classes.HomePage;

public class HomePageTest extends DriverLib {
	
	Properties prop=new Properties();
	
	@BeforeMethod
	public void setUp() throws Exception {
		prop.load(new FileInputStream("TestParameters.properties"));
		initDriver("firefox");
	}
	
//	@Test
	public void searchTest() throws IOException {
		
		HomePage hp=new HomePage(driver,prop.getProperty("url"));
		hp.search(prop.getProperty("searchtext"));
		Assert.assertFalse(hp.getResultText().contains(prop.getProperty("searchtext")));
	
	}
	
	@Test
	public void searchTest123() throws IOException {
	
		HomePage hp=new HomePage(driver,prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), "Amazon");
	
	}
	
	@AfterMethod
	public void stop() {
		quitDriver();
	}

}
