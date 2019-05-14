package com.surveymonkey.testcases;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
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

@Listeners(Listerner.LoggingListner.class)
public class PaidPlanForUser  {
	static WebDriver driver;
	static String premierPlanType;
	Properties properties;
	static String totalBilling;


	@BeforeMethod
	public void testSetup() throws Exception 
	{
            properties = CommonUtils.getProperty();
		    Setup.testSetup();
	}

	@Test
	public void verifyPaidPlanForUser()throws InterruptedException, IOException 
	{
		HomePage.verifyHomePage();
		HomePage.navigateToSignUp();
		String username= CommonUtils.getRandomUsername();
		SignupPage.enterSignupData(username, properties.getProperty("password"), properties.getProperty("email"), properties.getProperty("firstname"),properties.getProperty("lastname"));
		SignupPage.signUpButton();
		PopUpPage.closePopUp();
		DashboardPage.clickPlansAndPricingOption();
		PlansAndPricingPage.clickIndividualPlansAction();
		PlansAndPricingPage.selectPlan();
		PremierAnnualPage.enterUserDetails( properties.getProperty("firstnameUser"), properties.getProperty("lastnameUser"));
		PremierAnnualPage.enterCardDetails( properties.getProperty("name"), properties.getProperty("CreditCardNumber"),properties.getProperty("ExpiryDate"),properties.getProperty("SecurityCode"));
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
