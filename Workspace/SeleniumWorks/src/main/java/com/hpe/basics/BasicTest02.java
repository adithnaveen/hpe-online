package com.hpe.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hpe.utility.Basics;

public class BasicTest02 {
	public static void main(String[] args) {
		String URL = "http://elearning.ohbreaks.com/"; 
		WebDriver driver; 

		System.setProperty("webdriver.chrome.driver",
					"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get(URL);
		
		String homePageLoginNavigatorBtn_id = "login_main_btn";
		String inputTextUserName_xPath = "//*[@id=\"log_in_form\"]/form/div[1]/div[2]/input"; 
		String inputTextPassword_xPath="//*[@id=\"log_in_form\"]/form/div[2]/input"; 
		String submitBtn_xPath ="//*[@id=\"log_in_form\"]/form/div[4]/div[1]/button"; 
		
		String validateLoginName="//*[@id=\"main_page\"]/header/div/div/div[2]/div/div/div/div[2]/p"; 
		
		String expectedName="Gordan";
		// processing 
		
		driver.findElement(By.id(homePageLoginNavigatorBtn_id)).click(); 

		Basics.sleep(1000);
		
		driver.findElement(By.xpath(inputTextUserName_xPath)).clear();
		driver.findElement(By.xpath(inputTextUserName_xPath)).sendKeys("admin");

		Basics.sleep(1000);
		
		driver.findElement(By.xpath(inputTextPassword_xPath)).clear(); 
		driver.findElement(By.xpath(inputTextPassword_xPath)).sendKeys("admin@123"); 
		
		driver.findElement(By.xpath(submitBtn_xPath)).click(); 
		
		Basics.sleep(7000);
		
		String returnedName = driver.findElement(By.xpath(validateLoginName)).getText(); 
		System.out.println("Retuned Text is " + returnedName);
	
		if(expectedName.equals(returnedName)) {
			System.out.println("Test Passed ");
		}else {
			System.out.println("Sorry expected did not match actual... ");
		}
		
		driver.close(); 
	}
	
}
