package com.rapl.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePage {
	
	public WebDriver driver;
	
	@BeforeClass
		public void startApplication() {			
			BrowserPage browser = new BrowserPage();
			driver = browser.startApplication(driver, "chrome");
		}
	
	@AfterClass
		public void quitBrowser() {
			driver.close();
	}
}
