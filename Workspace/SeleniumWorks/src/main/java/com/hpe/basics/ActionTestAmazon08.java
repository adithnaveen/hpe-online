package com.hpe.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.hpe.generics.GenericMethods;
import com.hpe.screenshot.CaptureScreenShot;
import com.hpe.utility.Basics;
import com.hpe.utility.DriverFactory;
import com.hpe.utility.DriverNames;

public class ActionTestAmazon08 {
	public static void main(String[] args) {
		String url ="https://www.amazon.in/";

		WebDriver driver = DriverFactory.getDriver(DriverNames.CHROME); 
		GenericMethods genMethods = new GenericMethods(driver); 
		CaptureScreenShot screenShot = new CaptureScreenShot(driver); 
		
		String shopByCateogyXpath="nav-link-shopall";
		String mensFashionXpath="//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span"; 
		String mensWatchesXpath="//*[@id='nav-flyout-shopAll']/div[3]/div[8]/div[1]/div[2]/a[1]/span"; 
	
		
		driver.get(url);

//		1. hover on the nav bar or main menu 
		WebElement menuElement = genMethods.getElement(shopByCateogyXpath, "id"); 
		
		// if you have driver passed then all the web elements in this can use 
		// the same action object 
		Actions action = new Actions(driver); 
		
		// if you dont invoke perfom() method then the actual job will not 
		// be invoked 
		action.moveToElement(menuElement).perform(); 
		screenShot.takeScreenShot("Sample");
		
		WebElement mensFashionElement = genMethods.getElement(mensFashionXpath, "xpath"); 
		action.moveToElement(mensFashionElement).perform();
		
		Basics.sleep(3000);
		
		screenShot.takeScreenShot(); 
		
		WebElement mensWatchesElement = genMethods.getElement(mensWatchesXpath, "xpath"); 
		mensWatchesElement.click(); 
		
		Basics.sleep(3000);
		driver.close(); 
	
	}
}
