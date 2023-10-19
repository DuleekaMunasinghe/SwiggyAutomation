package com.swiggy.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.swiggy.utils.HelperClass;

public class LandingPageLocators extends HelperClass {


	public static WebElement locationBox(WebDriver driver)
	{
		return driver.findElement(By.id("location"));
	}


	public static WebElement findFood(WebDriver driver)
	{
		return driver.findElement(By.xpath("//a[contains(@class,'_3iFC5')]"));
	}


	public static WebElement locationSuggestion (WebDriver driver)
	{
		return driver.findElement(By.xpath("//span[contains(@class ,'_2W-T9')]"));
	}



}
