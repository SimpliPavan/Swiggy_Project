package com.swiggy.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllRestaurants {
	Actions actions;
	WebDriverWait wait;
	@FindBy(xpath = "//div[contains(@id, 'all_restaurants')]/div/div[2]/div[1]/div/div[1]/div[1]/a/div[1]")
	private WebElement firstRestaurant;
	@FindBy(xpath = "(//div[contains(@data-testid, 'normal-dish-item')])[1]/div[1]/div[2]/div[2]/div")
	private WebElement clickAddFirstItem;
	public AllRestaurants(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void clickFirstRestaurant() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id, 'all_restaurants')]/div/div[2]/div[1]/div/div[1]/div[1]/a/div/div[1]")));
		firstRestaurant.click();
	}
	public void clickAddFirstItem() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@data-testid, 'normal-dish-item')])[1]/div[1]/div[2]/div[2]/div/div[1]")));
		clickAddFirstItem.click();
	}
}