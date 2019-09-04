package com.hpe.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hpe.utility.Basics;

// to get-set the multi select box 
// to scroll the page with x pixel, and use java script executor for the same

public class BasicTest05 {
	public static void main(String[] args) {
		
		
		String selectXpath = "//*[@id=\"post-291\"]/div/div[2]/select"; 
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();
		String url = "https://html.com/attributes/select-multiple/";

		driver.get(url);
		
		
		// scroll for 600 px down 
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		// 1st param - x axis 
		// 2nd param - y axis 
		jse.executeScript("window.scrollBy(0, 650)"); 
		
		Basics.sleep(2000);
		

		// get the element 
		WebElement selectElement = driver.findElement(By.xpath(selectXpath)); 
		
		
		Select select = new Select(selectElement); 
		
		
		select.selectByIndex(1);
		Basics.sleep(500);

		select.selectByIndex(3);
		Basics.sleep(500);
		
		select.selectByValue("Lesser");
		Basics.sleep(500);
		
		select.deselectAll(); 
		Basics.sleep(500);


		select.selectByIndex(1);
		Basics.sleep(500);

		select.selectByIndex(3);
		Basics.sleep(500);
		
		List<WebElement> selectedList = select.getAllSelectedOptions(); 
		
		System.out.println("Number of elements selected : " + selectedList.size());
		
		for(WebElement  temp : selectedList) {
			System.out.println(temp.getText());
		}

		Basics.sleep(2000);
		driver.close();
	}
}
