package com.swiggy.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.swiggy.utils.HelperClass;

public class PlaceOrderLocators extends HelperClass {
	
    public static WebElement addBtn(WebDriver driver)
    {
        return driver.findElement(By.xpath("(//div[contains(@class,'_1RPOp')])[1]"));
    }
    
    public static WebElement continueBtn(WebDriver driver)
    {
        return driver.findElement(By.xpath("//span[contains(@class,'_1W_TH')]"));
    }
    
    public static WebElement addItemBtn (WebDriver driver)
    {
        return driver.findElement(By.xpath("//span[contains(@class,'_38xdN')]"));
    }
    
    
    public static WebElement checkOutBtn (WebDriver driver)
    {
        return driver.findElement(By.xpath("//button[contains(@class,'_1gPB7')]"));
    }
    
}
