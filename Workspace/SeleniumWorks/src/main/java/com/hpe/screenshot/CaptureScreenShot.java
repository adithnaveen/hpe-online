package com.hpe.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

// to capture the screen 
// 1. you provide the file name, location 
// 2. you dont provide file name(time stamp), neither give location 
// lets hard code 
public class CaptureScreenShot {

	private WebDriver driver; 
	
	public CaptureScreenShot(WebDriver driver) {
		this.driver = driver; 
	}
	
	
	public void takeScreenShot(String fileName) {
		String path ="C:\\OnlineTraining\\HPE\\screenshots\\"; 
		
		try {
		TakesScreenshot takeScreenShot  = (TakesScreenshot) driver; 
		// the file which is captured by selenium is in transient mode 
		// will be kept by selenium only, this has to be persisted to the 
		// path which we have specified 
		File file = takeScreenShot.getScreenshotAs(OutputType.FILE); 
		
		FileUtils.copyFile(file, new File(path + fileName+".png"));
		}catch(IOException ioe) {
			ioe.printStackTrace(); 
		}
		
	}
	
	public void takeScreenShot() {

		String path ="C:\\OnlineTraining\\HPE\\screenshots\\"; 

		Calendar calendar = GregorianCalendar.getInstance(); 
		String fileName = calendar.get(Calendar.DATE) +"-" + 
						  calendar.get(Calendar.HOUR) +"-" +
						  calendar.get(Calendar.MINUTE) +"-" +
						  calendar.get(Calendar.SECOND) +".png";  
	
		try {
			TakesScreenshot takeScreenShot  = (TakesScreenshot) driver; 
			File file = takeScreenShot.getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(file, new File(path + fileName));
		}catch(IOException ioe) {
			ioe.printStackTrace(); 
		}
		
		
		
		
		
		
		
		
		
	}
	
}
