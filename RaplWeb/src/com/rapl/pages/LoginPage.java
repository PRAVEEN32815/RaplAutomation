package com.rapl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driverb) 
	{
		this.driver = driverb;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']") WebElement emailAddress;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]") WebElement nextButton;
	
	@FindBy(name = "password") WebElement password;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]") WebElement submitButton;
	
	public void enterEmail(String Username) {
		emailAddress.sendKeys(Username);
		nextButton.click();
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
		submitButton.click();
	}
}
