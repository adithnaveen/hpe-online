package com.hpe.generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// middle layer 
public class GenericMethods {
	WebDriver driver; 
	
	//this driver information will be shared by selenium test 
	public GenericMethods(WebDriver driver) {
		this.driver  = driver; 
	}
	
	
	
	// type -> id, name, linkText, linkPartialText
	public WebElement getElement(String locator, String type) {
	
		WebElement element = null; 
		type = type.toLowerCase(); 
		
		if(type.equals("id")) {
			element = driver.findElement(By.id(locator)); 
		}else if(type.equals("css")) {
			element = driver.findElement(By.cssSelector(locator)); 
		}else if(type.equals("name")) {
			element = driver.findElement(By.name(locator)); 			
		} else if(type.equals("xpath")) {
			element = driver.findElement(By.xpath(locator)); 			
		} else if(type.equals("class")) {
			element = driver.findElement(By.className(locator)); 			
		}else {
			element = null; 
		}
	
		if(checkSingleEntry(locator, type)) {
			System.out.println("Element Found and its single entry...");
			return element; 
		}else {
			System.out.println("Sorry there are no entries or multiple entries");
			return null; 
		}
	}
	
	public List<WebElement> getElementAsList(String locator, String type){
		type= type.toLowerCase(); 
		
		List<WebElement> elements = null; 
		
		if(type.equals("id")) {
			elements = driver.findElements(By.id(locator)); 
		}else if(type.equals("name")) {
			elements = driver.findElements(By.name(locator)); 
		} else if(type.equals("xpath")) {
			elements = driver.findElements(By.xpath(locator)); 
		}else if(type.equals("class")) {
			elements = driver.findElements(By.className(locator)); 
		}
		
		return elements; 
		
	}
	
	
	public boolean checkSingleEntry(String locator, String type) {
		return getElementAsList(locator, type).size() ==1; 
	}
	
	
	
}











