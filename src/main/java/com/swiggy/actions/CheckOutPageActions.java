package com.swiggy.actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.CheckOutPageLocators;
import com.swiggy.utils.HelperClass;

public class CheckOutPageActions extends HelperClass {
	
	private WebDriverWait wait;
	
	public String getMsg() {
		
		wait.until(ExpectedConditions.visibilityOf(CheckOutPageLocators.HeadingMsg(getDriver())));
		String text = CheckOutPageLocators.HeadingMsg(getDriver()).getText();
		return text;
	}

}
