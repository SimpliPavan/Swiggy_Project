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

public class CheckOutPage {
	Actions actions;
	WebDriverWait wait;
	@FindBy(xpath = "//div[contains(@class, 'global-nav')]/div/div/span")
	private WebElement verifytextMsg;
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
	}
	public String verifyMsg() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'global-nav')]/div/div/span")));
		String verifytext = verifytextMsg.getText(); 
		return verifytext;
	}
}