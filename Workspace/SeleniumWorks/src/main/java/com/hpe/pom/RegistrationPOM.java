package com.hpe.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPOM {
	private WebDriver driver; 
	private WebElement element; 
	
	public RegistrationPOM(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void sendEmail(String email) {
		element = driver.findElement(By.id("inputEmail")); 
		element.clear(); 
		element.sendKeys(email);
	}
	
	public void sendPassword(String password) {
		element = driver.findElement(By.id("inputPassword")); 
		element.clear(); 
		element.sendKeys(password); 
	}
	
	public void sendConfirmPassword(String confirmPassword) {
		element = driver.findElement(By.id("confirmPassword")); 
		element.clear(); 
		element.sendKeys(confirmPassword);
	}
	
	
	public void sendFirstName(String firstName) {
		element = driver.findElement(By.id("firstName")); 
		element.clear(); 
		element.sendKeys(firstName);
	}
	
	
	
	
	
	
	
	
	
}
