package com.swiggy.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.swiggy.utils.HelperClass;

public class CheckOutPageLocators extends HelperClass {
	
	public static WebElement HeadingMsg (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[contains(@class,'2EQ3T')]"));
	}

}
