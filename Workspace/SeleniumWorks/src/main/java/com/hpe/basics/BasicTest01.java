package com.hpe.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasicTest01 {
	public static void main(String[] args) {
		String URL = "https://www.hpe.com/us/en/home.html"; 
		WebDriver driver; 
//		1. Load the Driver (Chrome Driver) 
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");
		 * 
		 * driver = new ChromeDriver();
		 */
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
		caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
		caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
		caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);

		System.setProperty("webdriver.ie.driver",
					"C:\\OnlineTraining\\HPE\\driver\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe"); 
		
		driver = new InternetExplorerDriver(caps); 
		

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
//		2. Open the web site / web application
		driver.get(URL);
		
//		3. Do Processing
		String title = driver.getTitle();
		System.out.println("From Selenium -> " + title);
		
//		4. Close the browser 
		
		driver.close();
	}
}
