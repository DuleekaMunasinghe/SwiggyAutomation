package com.swiggy.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.swiggy.utils.HelperClass;

public class ItemPageLocators extends HelperClass {
	
	
	public static WebElement serchIcon (WebDriver driver)
	{
		return driver.findElement(By.linkText("Search"));
	}
	
	public static WebElement placeHolder (WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[contains(@placeholder ,'Search for restaurants or dishes')]"));
	}
	
	public static WebElement suggestItems (WebDriver driver)
	{
		return driver.findElement(By.xpath("//div[contains(@class,'_3sbqM')]"));
	}
	
	public static WebElement firstItem (WebDriver driver)
	{
		return driver.findElement(By.xpath("(//div[contains(@class,'_1HEuF _3pTZL')])[1]"));
	}
	
}
