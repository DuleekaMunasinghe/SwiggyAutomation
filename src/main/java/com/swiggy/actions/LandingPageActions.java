package com.swiggy.actions;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;

import com.swiggy.locators.LandingPageLocators;
import com.swiggy.utils.HelperClass;

public class LandingPageActions extends HelperClass {

	//Enter location in the search box
	public static void enterLocation(String city) throws IOException {
		//Wait until location box visible
		waitForVisibilityOfElement(By.id("location"),Duration.ofSeconds(10));
		//Enter location
		LandingPageLocators.locationBox(getDriver()).sendKeys(city);
	}

	//Select first location from suggested location in suggestion-box
	public static void selectLocation() throws IOException {
		waitForVisibilityOfElement(By.xpath("//span[contains(@class ,'_2W-T9')]"),Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOf(LandingPageLocators.locationSuggestion(getDriver())));
		LandingPageLocators.locationSuggestion(getDriver()).click();
	}

	public void continuebtn() {
		LandingPageLocators.findFood(getDriver()).click();
	}

}
