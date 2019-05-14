package com.surveymonkey.setup;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import com.surveymonkey.pom.BillingDetailsPage;
import com.surveymonkey.pom.DashboardPage;
import com.surveymonkey.pom.HomePage;
import com.surveymonkey.pom.MyAccountPage;
import com.surveymonkey.pom.PlansAndPricingPage;
import com.surveymonkey.pom.PopUpPage;
import com.surveymonkey.pom.PremierAnnualPage;
import com.surveymonkey.pom.SignupPage;
import com.surveymonkey.pom.ThankyouPaymentPage;


public class Setup {

	public static ChromeDriver driver;
	static String baseurl = "https://www.monkeytest1.com";
	
       public static void testSetup() {
		driver= Driver.getChromeDriver();
		
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, SignupPage.class);
		PageFactory.initElements(driver, PopUpPage.class);
		PageFactory.initElements(driver, DashboardPage.class);
		PageFactory.initElements(driver, PlansAndPricingPage.class);
		PageFactory.initElements(driver, PremierAnnualPage.class);
		PageFactory.initElements(driver, ThankyouPaymentPage.class);
		PageFactory.initElements(driver, MyAccountPage.class);
		PageFactory.initElements(driver, BillingDetailsPage.class);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseurl);
	}

	public static void testTearDown() {
		driver.close();
		Reporter.log("Closed browser");
	}
}