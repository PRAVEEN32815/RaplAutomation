package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebBrowser {
	
	WebDriver driver;
	
	public  void  firefox() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\eclipse-workspace\\RaplDemoLogin\\Driver files\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
}
