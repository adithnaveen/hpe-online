package com.hpe.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hpe.utility.Basics;

// program to show working of click by link and click by partial link text
public class DemoStore07 {
	public static void main(String[] args) {
		String url="https://demostore.x-cart.com/";

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", 
					"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		
		driver.get(url);
		
		
		driver.findElement(By.linkText("Shipping")).click(); 
		
		Basics.sleep(4000);
		
		// no guarantee 
		driver.findElement(By.partialLinkText("Contact")).click(); 
		Basics.sleep(4000);
		
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("hi");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("hi@bye.com");
		
		driver.findElement(By.id("subject")).clear();
		driver.findElement(By.id("subject")).sendKeys("Testing... "); 
		
		driver.findElement(By.id("message")).clear();
		driver.findElement(By.id("message")).sendKeys("This is for simple test case "); 
		

//		driver.findElement(By.xpath("//*[@id=\"form-1567525940210\"]/div[2]/div[2]/div/button/span"))
//			.click(); 
		// TODO 


		driver.findElement(By.xpath("//*[contains(text(),'Send')]")).click(); 
		
		Basics.sleep(6000);
		driver.close(); 
	}
}
