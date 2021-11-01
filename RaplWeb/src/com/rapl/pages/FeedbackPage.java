package com.rapl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rapl.base.ReadConfigFile;

public class FeedbackPage extends ReadConfigFile  {
	
	WebDriver Driver;
	
	@FindBy(xpath = "//a[@app-translate = 'LEARNER.MANAGE']") WebElement manageOption;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-admin-header[1]/div[1]/mat-tab-group[1]/mat-tab-header[1]/div[3]/div[1]") WebElement navigationButton;
	
	@FindBy(xpath = "//a[contains(text(),'Manage Feedback')]") WebElement manageFeedback;
	
	@FindBy(xpath = "//body/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/nav[1]/ul[1]/li[2]/a[1]") WebElement feedbackOption;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/ng-datatable-x[1]/div[1]/nav[1]/div[1]/form[1]/div[1]/button[2]") WebElement createFeedbackButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/app-feedback[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-create-edit-feedback[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")WebElement searchTemplateBox;
	
	@FindBy(xpath = "(//div[@class='folder-icon'])[1]") WebElement seriousFeedback;
	
	@FindBy(xpath = "//input[@name='name']") WebElement nameTestBox;
	
	@FindBy(xpath = "//textarea[@name='description']") WebElement descriptionTextBox;
	
	@FindBy(xpath = "//input[@placeholder='Tags']") WebElement tagsTextBox;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/mat-checkbox[1]/label[1]/span[1]") WebElement acknowledgementCheckBox;
	
	@FindBy(xpath = "//input[@data-placeholder='Due by days']") WebElement dueByDaysTextBox;
	
	@FindBy(xpath = "//button[contains(text(),'CREATE')]") WebElement createButton;
	
	@FindBy(xpath = "//body[1]/app-root[1]/ng-component[1]/main[1]/div[1]/app-manage-feedback[1]/app-feedback[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-create-edit-feedback[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/button[1]") WebElement selectGroupButton;
	
	@FindBy(xpath = "//input[@data-placeholder='Search Group']") WebElement searchGroupTextBox;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/div[1]") WebElement selectGroupOption;
	
	@FindBy(xpath = "(//div[@class='custom-control custom-checkbox table-custom-checkbox'])[3]") WebElement selectcheckBox;
	
	@FindBy(xpath = "//button[@class = 'btn btn-sm align-middle btn-outline-primary']") WebElement includeGroupsButton;
	
	@FindBy(xpath = "//div/h5/button[@type='button']") WebElement closeButton;
	
	@FindBy(xpath = "//span[@class='cursor-pointer btn-icon-only']") WebElement BackButton;
	
	public FeedbackPage(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	public void createFeedbackMethod() throws InterruptedException {
		readConfig();
		
		manageOption.click();
		Thread.sleep(5000);
		navigationButton.click();
		Thread.sleep(3000);
		navigationButton.click();
		Thread.sleep(3000);
		manageFeedback.click();
		Thread.sleep(3000);
		feedbackOption.click();
		Thread.sleep(5000);
		createFeedbackButton.click();
		Thread.sleep(2000);
		searchTemplateBox.click();
		Thread.sleep(2000);
		seriousFeedback.click();
		Thread.sleep(2000);
		nameTestBox.sendKeys(properties.getProperty("FeedbackName"));
		Thread.sleep(2000);
		descriptionTextBox.sendKeys(properties.getProperty("FeedbackDescription"));
		Thread.sleep(2000);
		tagsTextBox.sendKeys(properties.getProperty("FeedbackTags"));
		Thread.sleep(2000);
		acknowledgementCheckBox.click();
		Thread.sleep(2000);
		dueByDaysTextBox.sendKeys(properties.getProperty("FeedbackDueDate"));
		Thread.sleep(2000);
		createButton.click();
		Thread.sleep(2000);
		selectGroupButton.click();
		Thread.sleep(2000);
		searchGroupTextBox.sendKeys("praveen");
		Thread.sleep(2000);
		selectGroupOption.click();
		Thread.sleep(2000);
		selectcheckBox.click();
		Thread.sleep(2000);
		includeGroupsButton.click();
		Thread.sleep(6000);
		closeButton.click();
		Thread.sleep(2000);
	}
	
}