package com.hpe.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

	static WebDriver driver = null;

	public static WebDriver getDriver(String driverName) {

		if (driverName.equals(DriverNames.CHROME)) {
			System.setProperty(DriverInfo.CHROME_KEY,DriverInfo.CHROME_PATH);
			driver = new ChromeDriver();

		} else if (driverName.equals(DriverNames.IE)) {
			System.setProperty(DriverInfo.IE_KEY, DriverInfo.IE_PATH); 
			
			DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			caps.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
			caps.setCapability(InternetExplorerDriver.ENABLE_PERSISTENT_HOVERING, false);
			caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, false);
			caps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
			caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			caps.setCapability(InternetExplorerDriver.
						INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver(caps); 
		} else if (driverName.equals(DriverNames.FIREFOX)) {
			// TODO 
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.manage().window().maximize();

		return driver;

	}
}
