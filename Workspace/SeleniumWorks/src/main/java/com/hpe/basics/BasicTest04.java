package com.hpe.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.hpe.utility.Basics;

public class BasicTest04 {
	public static void main(String[] args) {
		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "C:\\OnlineTraining\\HPE\\driver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		String url = "https://www.expedia.com/";

		driver.get(url);

//		1. click on flights tab 
		driver.findElement(By.id("tab-flight-tab-hp")).click();

		driver.findElement(By.id("flight-origin-hp-flight")).click();
		driver.findElement(By.id("flight-origin-hp-flight")).clear();
		driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("Bengaluru, India (BLR-Kempegowda Intl.)");

		driver.findElement(By.id("flight-destination-hp-flight")).click();
		driver.findElement(By.id("flight-destination-hp-flight")).clear();
		driver.findElement(By.id("flight-destination-hp-flight"))
				.sendKeys("Washington, DC (IAD-Washington Dulles Intl.)");

		// clicking on close for fly-to, to enable access for selecting number
		// of people

		Basics.sleep(500);

		// if the element is present or not we can check agaist isEnabled or
		// isDisplayed -> boolean
		driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[3]/div[2]/div/div[2]/footer/a")).click();

		// for selecting number of people
		driver.findElement(By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/button")).click();

		Basics.sleep(500);

		driver.findElement(
				By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button"))
				.click();

		Basics.sleep(500);

		driver.findElement(
				By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[1]/div[4]/button"))
				.click();

		// have number of kids
		driver.findElement(
				By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button"))
				.click();

		driver.findElement(
				By.xpath("//*[@id=\"traveler-selector-hp-flight\"]/div/ul/li/div/div/div/div[2]/div[1]/div[4]/button"))
				.click();

		// selecting the age for 2 kids

		List<WebElement> options1 = new ArrayList<WebElement>();
		List<WebElement> options2 = new ArrayList<WebElement>();

		for (int i = 0; i < 2; i++) {
			System.out.println("I value is " + i);
			// *[@id="flight-age-select-1-hp-flight"]
			String childSelector = "flight-age-select-" + (i + 1) + "-hp-flight";

			Select childSelectsFromWebSite = new Select
					(driver.findElement(By.id(childSelector)));

			if (i == 0) {
				options1 = childSelectsFromWebSite.getOptions();
			} else if (i == 1) {
				options2 = childSelectsFromWebSite.getOptions();
			}
		}

		for (WebElement temp : options1) {
			System.out.println(temp.getText());
		}

		for (WebElement temp : options2) {
			System.out.println(temp.getText());
		}

		driver.close();

	}
}
