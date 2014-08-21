package com.driver.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActionLib {

	protected WebDriver driver;

	public By getLocator(String prop) {

		String[] locator = prop.split(";");
		String locatorType = locator[0];

		if (locatorType.contains("id"))
			return By.id(locator[1]);
		else if (locatorType.contains("name"))
			return By.name(locator[1]);
		else if (locatorType.contains("link"))
			return By.linkText(locator[1]);
		else if (locatorType.contains("xpath"))
			return By.xpath(locator[1]);
		else if (locatorType.contains("css"))
			return By.cssSelector(locator[1]);
		else if (locatorType.contains("class"))
			return By.className(locator[1]);
		else if (locatorType.contains("tag"))
			return By.tagName(locator[1]);
		else {
			System.out.println("Invalid Locator Type");
			System.exit(0);
			return null;
		}

	}
	
	protected void openUrl(String URL)
	{
		driver.get(URL);
	}

	protected void clickOnElement(String elementLocator) {
		By locator = getLocator(elementLocator);
		WebElement element = driver.findElement(locator);
		if (element.isDisplayed()) {

			element.click();
		}

	}

	protected void type(String elementLocator, String text) {
		By locator = getLocator(elementLocator);
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);

	}

	protected String getText(String elementLocator) {

		By locator = getLocator(elementLocator);
		WebElement element = driver.findElement(locator);
		return element.getText();
	}
}