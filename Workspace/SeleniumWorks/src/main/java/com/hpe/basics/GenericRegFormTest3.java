package com.hpe.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hpe.generics.GenericMethods;
import com.hpe.utility.Basics;
import com.hpe.utility.DriverFactory;
import com.hpe.utility.DriverNames;
import com.hpe.waits.WaitTypes;

public class GenericRegFormTest3 {
	public static void main(String[] args) {
		String url = "http://naveenks.com/selenium/RegForm.html";
		WebDriver driver = DriverFactory.getDriver(DriverNames.CHROME);
		GenericMethods genericMethods = null; 
		WaitTypes waitTypes ; 
		
		genericMethods = new GenericMethods(driver); 
		waitTypes = new WaitTypes(driver); 
		
		driver.get(url);
		
		// list of locators 
		String email ="inputEmail"; 
		String password ="inputPassword"; 
		String confirmPassword="confirmPassword"; 
		String firstName = "firstName"; 
		// lastname, phone, DOB 
		String regBtn ="/html/body/div[1]/form/div[15]/div/input[1]"; 
		
		waitTypes.waitForElementVisibility(By.id(email), 5).sendKeys("naveen@probits.in");
		waitTypes.waitForElementVisibility(By.id(password), 5).sendKeys("secret@123");
		waitTypes.waitForElementVisibility(By.id(confirmPassword), 5).sendKeys("secret@123");
		waitTypes.waitForElementVisibility(By.id(firstName), 5).sendKeys("Naveen");
		
		Basics.sleep(3000);
		driver.close(); 
	}
}









