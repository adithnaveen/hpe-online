package com.hpe.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
	WebDriver driver; 
	
	public WaitTypes(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	// 1. waitFor Visibility 
	
	public WebElement waitForElementVisibility(By locator, int timeout) {

		try {
		WebDriverWait wait = new WebDriverWait(driver, timeout); 
		WebElement element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(locator)
				); 
		System.out.println("Element visible... ");
		return element; 
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return null; 
	}
	
	
	// 2. if the element is clickable 
	
	public WebElement waitForClickableReady(By locator, int timeout) {

		try {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(
				ExpectedConditions.elementToBeClickable(locator)
				); 
		System.out.println("Element Avaiable for click... ");
		}catch(Exception e) {
			e.printStackTrace(); 
		}
		
		return null; 
	}
	
}
