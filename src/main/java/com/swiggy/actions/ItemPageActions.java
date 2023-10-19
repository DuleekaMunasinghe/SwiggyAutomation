package com.swiggy.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.ItemPageLocators;
import com.swiggy.utils.HelperClass;

public class ItemPageActions extends HelperClass{
	
	private Actions actions;
	private WebDriverWait wait;
	
	public void hoverOverSerch () {
		wait.until(ExpectedConditions.visibilityOf(ItemPageLocators.serchIcon(getDriver())));
		ItemPageLocators.serchIcon(getDriver()).click();
	}
	
	public void enterItem(String item) {
		wait.until(ExpectedConditions.visibilityOf(ItemPageLocators.placeHolder(getDriver())));
		ItemPageLocators.placeHolder(getDriver()).sendKeys(item);
		
	}
	public void searchItem() {
		wait.until(ExpectedConditions.visibilityOf(ItemPageLocators.suggestItems(getDriver())));
		actions. sendKeys(Keys.ENTER).build().perform();
	}
	public void selectFirstItem() {
		wait.until(ExpectedConditions.visibilityOf(ItemPageLocators.firstItem(getDriver())));
		ItemPageLocators.firstItem(getDriver()).click();
	}


}
