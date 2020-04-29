package com.automation.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class login {

	public WebDriver driver;

	@Test(priority = 1)
	public void launchBrowser() {
		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", "/Users/ashutosh.verma1/Documents/Selenium/geckodriver");
		driver = new FirefoxDriver();
	}

	@Test(priority = 2)
	public void openApplication() {
		driver.navigate().to("http://www.google.com");
	}

	@Test(priority = 3)
	public void closeDriver() {
		if (driver != null) {
			driver.close();
		}
	}

}
