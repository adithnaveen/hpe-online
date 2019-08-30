package com.hpe.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hpe.utility.Basics;

public class BasicTest04 {
	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver",
			"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		String url = "https://www.expedia.com/";
		
		driver.get(url);
		
//		1. click on flights tab 
		driver.findElement(By.id("tab-flight-tab-hp")).click(); 
		
		driver.findElement(By.id("flight-origin-hp-flight")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).clear();
		driver.findElement(By.id("flight-origin-hp-flight")).
			sendKeys("Bengaluru, India (BLR-Kempegowda Intl.)"); 
		
		driver.findElement(By.id("flight-destination-hp-flight")).click(); 
		driver.findElement(By.id("flight-destination-hp-flight")).clear(); 
		driver.findElement(By.id("flight-destination-hp-flight")).
			sendKeys("Washington, DC (IAD-Washington Dulles Intl.)");
		
		// for selecting number of people 
		driver.findElement(
				By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button"))
					.click();
		
		Basics.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button"))
			.click();
		
		Basics.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button"))
		.click();
		
		// have number of kids 
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button"))
			.click(); 
		

		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button"))
		.click(); 

		// selecting the age for 2 kids 
		
		for(int i=1; i<=2; i++) {
			String childSelector ="flight-age-select-"+i+"-hp-flight";
			
			Select childSelectsFromWebSite = new Select
						(driver.findElement(By.id(childSelector)));  
			
			
			List<WebElement> options = childSelectsFromWebSite.getOptions(); 
			System.out.println(options);
			
			
		}
		
		
		
		
		
	}
}
