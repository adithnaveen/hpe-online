package com.hpe.basics.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hpe.utility.Basics;

public class FirstTest {


	private String URL1; 
	private String URL2; 
	
	WebDriver driver ; 
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe"); 
		
		driver = new ChromeDriver(); 
		
		URL1="https://www.hpe.com/us/en/home.html"; 
		URL2="http://elearning.ohbreaks.com/"; 
	}
	@After
	public void tearDown() {
		Basics.sleep(3000);
		driver.close(); 
	}
	
	@Test
	public void hpeTest() {
		driver.get(URL1);
		
		
		String title = driver.getTitle();
		System.out.println("From Selenium -> " + title);
	
		
	}
	
	@Test
	public void elearningTest() {
		driver.get(URL2);


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
	
		assertEquals(expectedName, returnedName);
		
		
	}
	
	

}
