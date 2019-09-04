package com.hpe.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hpe.generics.GenericMethods;
import com.hpe.utility.Basics;
import com.hpe.utility.DriverFactory;
import com.hpe.utility.DriverNames;

public class GenericRegFormTest2 {
	public static void main(String[] args) {
		String url = "http://naveenks.com/selenium/RegForm.html";
		WebDriver driver = DriverFactory.getDriver(DriverNames.CHROME);
		GenericMethods genericMethods = null; 
		
		genericMethods = new GenericMethods(driver); 
		
		driver.get(url);
		
		// list of locators 
		String email ="inputEmail"; 
		String password ="inputPassword"; 
		String confirmPassword="confirmPassword"; 
		String firstName = "firstName"; 
		// lastname, phone, DOB 
		String regBtn ="/html/body/div[1]/form/div[15]/div/input[1]"; 
		
		genericMethods.getElement(email, "id").sendKeys("naveen@probits.in");
		Basics.sleep(1000);

		genericMethods.getElement(password, "id").sendKeys("secret@123");
		Basics.sleep(1000);
		
		genericMethods.getElement(confirmPassword, "id").sendKeys("secret@123");
		Basics.sleep(1000);
		
		genericMethods.getElement(firstName, "id").sendKeys("Naveen");
		
		Basics.sleep(1000);
		genericMethods.getElement(regBtn,"xpath").click(); 
		
		Basics.sleep(3000);
		driver.close(); 
	}
}









