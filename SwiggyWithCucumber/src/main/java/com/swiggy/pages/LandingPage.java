package com.swiggy.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	Actions actions;
	@FindBy(id = "location")
	private WebElement enterLocation;
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterLocationTab(String location) {
		enterLocation.clear();
		enterLocation.sendKeys(location);	
	}
}