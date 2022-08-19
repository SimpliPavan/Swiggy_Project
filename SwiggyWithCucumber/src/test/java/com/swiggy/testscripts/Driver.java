package com.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.swiggy.pages.AllRestaurants;
import com.swiggy.pages.CheckOutPage;
import com.swiggy.pages.ClickGo;
import com.swiggy.pages.LandingPage;

public class Driver extends Tools {
	
	protected static LandingPage landingPage;
	protected static ClickGo go;
	protected static AllRestaurants allRestaurant;
	protected static CheckOutPage checkText;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		landingPage = new LandingPage(driver);
		go = new ClickGo(driver);
		allRestaurant = new AllRestaurants(driver);
		checkText = new CheckOutPage(driver);
	}
}