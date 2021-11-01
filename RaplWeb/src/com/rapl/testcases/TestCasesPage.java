package com.rapl.testcases;

import org.testng.annotations.Test;
import com.rapl.base.BasePage;
import com.rapl.pages.FeedbackPage;
import com.rapl.pages.LoginPage;

public class TestCasesPage extends BasePage {
	
	LoginPage login;
	FeedbackPage Feedback;
	
	@Test
		public void loginRapl() {	
			login = new LoginPage(driver);
			login.enterEmail("praveen@linkstreet.in");
			login.enterPassword("Admin@123");
		}
	
	@Test(priority=2)
	public void createFeedback() throws InterruptedException {
		Feedback = new FeedbackPage(driver);
		Feedback.createFeedbackMethod();
	}
	
}