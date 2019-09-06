package com.hpe.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPOM1 {
	WebDriver driver ; 
	
	public RegistrationPOM1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inputEmail")
	private WebElement inputEmail;
	
	@FindBy(id="inputPassword")
	private WebElement password;
	
	@FindBy(id="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="firstName")
	private WebElement firstName;
	
	@FindBy(id="lastName")
	private WebElement lastName; 
	
	
	public void sendEmail(String inputEmail) {
		this.inputEmail.clear();
		this.inputEmail.sendKeys(inputEmail);
	}
	
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password);
	}
	
	
	public void sendConfirmPassword(String confirmPassword) {
		this.confirmPassword.clear(); 
		this.confirmPassword.sendKeys(confirmPassword);
	}
	
	public void sendFirstName(String firstName) {
		this.firstName.clear(); 
		this.firstName.sendKeys(firstName);
	}
	
	public void sendLastName(String lastName) {
		this.lastName.clear(); 
		this.lastName.sendKeys(lastName);
	}
	
	
	
}
