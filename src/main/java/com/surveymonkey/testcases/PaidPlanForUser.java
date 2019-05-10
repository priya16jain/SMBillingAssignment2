package com.surveymonkey.testcases;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.surveymonkey.pom.BillingDetailsPage;
import com.surveymonkey.pom.CommonUtils;
import com.surveymonkey.pom.DashboardPage;
import com.surveymonkey.pom.HomePage;
import com.surveymonkey.pom.MyAccountPage;
import com.surveymonkey.pom.PlansAndPricingPage;
import com.surveymonkey.pom.PopUpPage;
import com.surveymonkey.pom.PremierAnnualPage;
import com.surveymonkey.pom.SignupPage;
import com.surveymonkey.pom.ThankyouPaymentPage;
import com.surveymonkey.setup.Setup;

public class PaidPlanForUser {

	static WebDriver driver;
	public String premierPlanType;
	public String totalBilling;

	@BeforeMethod
	public void testSetup() 
	{
		Setup.testSetup();
	}

	@Test (priority=1)
	public void verifyPaidPlanForUser()throws InterruptedException, IOException 
	{
		HomePage.navigateToHomePage();
		HomePage.navigateToSignUp();
		String username= CommonUtils.getRandomUsername();
		SignupPage.enterSignupData(username, "johntest12345", "qaemails@surveymonkey.com", "test", "monkey");
		SignupPage.signUpButton();
		PopUpPage.closePopUp();
		DashboardPage.clickPlansAndPricingOption();
		PlansAndPricingPage.clickIndividualPlansAction();
		PlansAndPricingPage.selectPlan();
		PremierAnnualPage.enterUserDetails( "test","user");
		PremierAnnualPage.enterCardDetails( "test  user", "4111-1111-1111-1111"," 737","09/20" );
		ThankyouPaymentPage.clickGoToDashboardButton();
		DashboardPage.clickMainMenu();
		DashboardPage.clickMyAccountOption(); 
		MyAccountPage.clickbillingDetailsOptions();
		BillingDetailsPage.comparePlanTypeTotalBillingAmount(premierPlanType, totalBilling);
	}

    @AfterMethod
	public void testTearDown() 
	{
		Setup.testTearDown();
	}

}
