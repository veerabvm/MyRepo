package com.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Action {
	
	protected WebDriver driver;
	
	public By getBySelector(String locator)
	{
		String[] loc=locator.split(";");
		String locatorType=loc[0];
		
		if(locatorType.contains("id"))
				return By.id(loc[1]);
		else if(locatorType.contains("name"))
			return By.id(loc[1]);
		else if (locatorType.contains("linkText"))
			return By.linkText(loc[1]);
		else if (locatorType.contains("xpath"))
			return By.xpath(loc[1]);
			else if (locatorType.contains("css"))
				return By.cssSelector(loc[1]);
			else if (locatorType.contains("class"))
				return By.className(loc[1]);
			else if (locatorType.contains("tag"))
				return By.tagName(loc[1]);
			else
				System.out.println("invalid locator type");
			return null;
	}
	
	public void click(String locator)
	{
		driver.findElement(getBySelector(locator)).click();
	}
	
	public void type(String locator, String text)
	{
		driver.findElement(getBySelector(locator)).sendKeys(text);
	}
	
	protected String getElementText(String locator) {
		return driver.findElement(getBySelector(locator)).getText();
	}
	
	public void goToUrl(String url)
	{
		driver.get(url);
	}

}
