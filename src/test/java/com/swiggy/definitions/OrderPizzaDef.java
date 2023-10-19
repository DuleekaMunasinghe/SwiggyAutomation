package com.swiggy.definitions;

import java.io.IOException;

import org.testng.Assert;

import com.swiggy.actions.LandingPageActions;
import com.swiggy.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrderPizzaDef extends HelperClass {
	
	@Given("Navigate to the landing page of Swiggy {string}")
	public void navigate_to_the_landing_page_of_swiggy(String url) {
		//Navigate to site
		HelperClass.openPage(url);
		//Verify the navigation
		Assert.assertTrue(getDriver().getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you")); 
	}
	
	@When("Enter location as {string}")
	public void enter_location_as(String string) throws IOException {
		//Enter location
		LandingPageActions.enterLocation(string);
	}
	
	@Then("Select first location from suggested location in suggestion-box")
	public void select_first_location_from_suggested_location_in_suggestion_box() throws IOException {
		//Select location
		LandingPageActions.selectLocation();
	}
	
//	@When("Redirect to the ItemPage")
//	public void redirect_to_the_item_page() {
		//Add logic here

//	}
//	@When("Hover over search icon")
//	public void hover_over_search_icon() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Enter Item as {string}")
//	public void enter_item_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Select first suggested Item in pizza cateogory")
//	public void select_first_suggested_item_in_pizza_cateogory() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Search resturant and select first restaurant")
//	public void search_resturant_and_select_first_restaurant() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Redirect to orderPage")
//	public void redirect_to_order_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Add first item to cart")
//	public void add_first_item_to_cart() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@When("Click on checkout button")
//	public void click_on_checkout_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//	@Then("Order a pizza suscessfully")
//	public void order_a_pizza_suscessfully() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}


}
