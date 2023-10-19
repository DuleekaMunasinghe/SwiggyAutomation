package com.swiggy.utils;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.LandingPageLocators;

public class HelperClass {

	public static HelperClass helperClass;

	public static WebDriver driver;
	public static WebDriverWait wait;
	public final static int TIMEOUTIMP = 10;
	public int TIMEOUTEXP = 10;

	public static void openPage(String url) {
		driver.get(url);
	}


	public static WebDriver getDriver() {
		return driver;              
	}

    //Initiate driver
	public static void setUpDriver() {

		System.setProperty("webdriver.chrome.driver", "/usr/local/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--diable--notifications");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUTIMP));

	}

	//Wait until element visible
	public static void waitForVisibilityOfElement(By locator, Duration time) throws IOException {
		wait = new WebDriverWait(getDriver(),time); 
		wait.until(ExpectedConditions.visibilityOf(LandingPageLocators.locationBox(getDriver())));

	}

	
	public static void tearDown() {

		if(driver!=null) {
			driver.close();
			driver.quit();
		}

		helperClass = null;
	} 

}
