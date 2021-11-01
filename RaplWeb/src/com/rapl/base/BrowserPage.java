package com.rapl.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserPage extends ReadConfigFile {
	
	public WebDriver startApplication(WebDriver driver, String browserName) {
		
		readConfig();
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\RaplWeb\\driver files\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\RaplWeb\\driver files\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		return driver;
	}
}