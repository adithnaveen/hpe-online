package com.hpe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTest01 {
	public static void main(String[] args) {
		String URL = "https://www.hpe.com/us/en/home.html"; 
		WebDriver driver; 
//		1. Load the Driver (Chrome Driver) 
		System.setProperty("webdriver.chrome.driver",
					"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver(); 
		
//		2. Open the web site / web application
		driver.get(URL);
		
//		3. Do Processing
		String title = driver.getTitle();
		System.out.println("From Selenium -> " + title);
		
//		4. Close the browser 
		
		driver.close();
	}
}
