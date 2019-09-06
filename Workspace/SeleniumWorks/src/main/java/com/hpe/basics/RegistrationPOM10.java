package com.hpe.basics;

import org.openqa.selenium.WebDriver;

import com.hpe.pom.RegistrationPOM;
import com.hpe.pom.RegistrationPOM1;
import com.hpe.screenshot.CaptureScreenShot;
import com.hpe.utility.Basics;
import com.hpe.utility.DriverFactory;
import com.hpe.utility.DriverNames;

public class RegistrationPOM10 {
	public static void main(String[] args) {
		WebDriver driver = DriverFactory.getDriver(DriverNames.CHROME); 
		RegistrationPOM1 regPOM = new RegistrationPOM1(driver); 
		CaptureScreenShot screenShot = new CaptureScreenShot(driver); 
		
		String url ="http://naveenks.com/selenium/RegForm.html"; 

		driver.get(url);
		
		regPOM.sendEmail("naveen@probits.in");
		regPOM.sendPassword("secret@123");
		regPOM.sendConfirmPassword("secret@123");
		regPOM.sendFirstName("Naveen" );
		regPOM.sendLastName("Kumar");
		screenShot.takeScreenShot();
		
		Basics.sleep(2000);
		
		driver.close(); 
	}
}
