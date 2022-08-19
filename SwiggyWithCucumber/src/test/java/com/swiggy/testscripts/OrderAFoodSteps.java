package com.swiggy.testscripts;

import org.testng.Assert;

import com.swiggy.pages.CheckOutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderAFoodSteps extends Driver {
	
	@Given("A user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_swiggy() {
	    Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}
	@When("Enter Location in the search box {string}")
	public void enter_location_in_the_search_box(String string) {
		landingPage.enterLocationTab(string);
	}
	@When("Click go")
	public void click_go() throws InterruptedException {
	    go.clickFirstLocation();
	}
	@When("Click on the first restaurant on the next page")
	public void click_on_the_first_restaurant_on_the_next_page() {
		   allRestaurant.clickFirstRestaurant();
	}

	@When("Click Add on the first item of the restaurant page")
	public void click_add_on_the_first_item_of_the_restaurant_page() {
		 allRestaurant.clickAddFirstItem();
	}

	@When("Click Checkout button")
	public void click_checkout_button() {
	    go.clickCheckoutBtn();    
	}
	
	@Then("Verify you are on Checkout page by verifying the text {string}")
	public void verify_you_are_on_checkout_page_by_verifying_the_text(String string) {
		CheckOutPage checkText = new CheckOutPage(driver);
	    String ExpectedText = string;
	    String ActualText = checkText.verifyMsg();
	    
	    System.out.println(ExpectedText);
		System.out.println(ActualText);
	    Assert.assertEquals(ExpectedText, ActualText);
	}
}
