package com.hpe.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// given the element extrct the attribute/s 
public class BasicTest06 {
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", 
					"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		String url = "http://naveenks.com/selenium/RegForm.html";

		driver.get(url);
		
		String xpathBtn ="/html/body/div[1]/form/div[15]/div/input[1]"; 
	
		WebElement regUserBtn = driver.findElement(By.xpath(xpathBtn)); 
		String elementValue = regUserBtn.getAttribute("value"); 
		System.out.println("Attribute Value : " + elementValue);
		

		driver.close(); 
	}
}










