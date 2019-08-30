package com.hpe.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hpe.utility.Basics;

public class BasicTest03 {
	public static void main(String[] args) {
		String url1 = "https://www.hpe.com/us/en/home.html";
		String url2 = "https://in.yahoo.com/?p=us";

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
			"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get(url1);

		String currentWebsite = driver.getTitle(); 
		System.out.println("Current URL title -> " + currentWebsite);
		
		Basics.sleep(2000);
		
		driver.navigate().to(url2);
	
		currentWebsite = driver.getTitle(); 
		System.out.println("Current URL title -> " + currentWebsite);
		Basics.sleep(2000);

		driver.navigate().back(); 
		
		currentWebsite = driver.getTitle(); 
		System.out.println("Current URL title (After back )-> " + currentWebsite);
		Basics.sleep(2000);
		
		System.out.println("Refreshing the page... ");
		currentWebsite = driver.getTitle(); 
		System.out.println("After refresh title is " + currentWebsite);
		
		
		driver.close(); 

	}
}
