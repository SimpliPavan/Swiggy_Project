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

public class ClickGo {
	Actions actions;
	WebDriverWait wait;
	@FindBy(xpath = "(//span[contains(@class, 'W-T')])[1]")
	private WebElement clickFirstLocation;
	@FindBy(xpath = "//div[contains(@id, 'menu-content')]/div[2]/div/div[3]/button")
	private WebElement clickCheckOut;
	public ClickGo(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
	}
	public void clickFirstLocation() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(@class, 'W-T')])[1]")));
		clickFirstLocation.click();
	}
	public void clickCheckoutBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id, 'menu-content')]/div[2]/div/div[3]/button")));
		clickCheckOut.click();
	}
}
