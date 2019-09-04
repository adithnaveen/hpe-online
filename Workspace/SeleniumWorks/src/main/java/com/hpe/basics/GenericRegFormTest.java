package com.hpe.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hpe.generics.GenericMethods;
import com.hpe.utility.Basics;

public class GenericRegFormTest {
	public static void main(String[] args) {
		String url = "http://naveenks.com/selenium/RegForm.html";
		WebDriver driver;
		GenericMethods genericMethods = null; 
		System.setProperty("webdriver.chrome.driver", 
					"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

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









