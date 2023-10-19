package com.swiggy.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.PlaceOrderLocators;
import com.swiggy.utils.HelperClass;

public class PlaceOrderActions extends HelperClass{

	private Actions actions;
	private WebDriverWait wait;


	public void addItem() {
		wait.until(ExpectedConditions.visibilityOf(PlaceOrderLocators.addBtn(getDriver())));
		PlaceOrderLocators.addBtn(getDriver()).click();
	}


	public void continueorder() {

		wait.until(ExpectedConditions.visibilityOf(PlaceOrderLocators.continueBtn(getDriver())));
		actions.moveToElement(PlaceOrderLocators.continueBtn(getDriver())).doubleClick().perform();
		actions.moveToElement(PlaceOrderLocators.continueBtn(getDriver())).doubleClick().perform();
		actions.moveToElement(PlaceOrderLocators.continueBtn(getDriver())).doubleClick().perform();

	}

	public void moveToCart() {
		wait.until(ExpectedConditions.visibilityOf(PlaceOrderLocators.addItemBtn(getDriver())));
		PlaceOrderLocators.addItemBtn(getDriver()).click();
	}

	public void checkoutAction() {
		wait.until(ExpectedConditions.visibilityOf(PlaceOrderLocators.checkOutBtn(getDriver())));
		PlaceOrderLocators.checkOutBtn(getDriver()).click();
	}

}
