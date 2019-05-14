package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class BillingDetailsPage {
	
	private static Logger log = Logger.getLogger(BillingDetailsPage.class.getName());

	@FindBy(xpath="//dt[contains(text(),'Plan Type')]")
	static WebElement planType ;

	@FindBy(xpath="//dd[@class='billing-next-amount']//span")
	static WebElement BillingAmount ;

	/**
	 * This method will compare Plan Type and Total Billing Amount .
	 * 
	 * 
	 * @param premierPlanType,totalBilling 
	 * @return void
	 *  
	 */
	public static void comparePlanTypeTotalBillingAmount(String premierPlanType, String totalBilling) {
		Assert.assertTrue( planType.isDisplayed());
		Reporter.log( planType.getText());
		if(premierPlanType==planType.getText()) {
		log.info("Same Plan Type");
		}else {
		log.info("Plan Type is not same");
		}
		Assert.assertTrue(BillingAmount.isDisplayed());
		if(totalBilling==BillingAmount.getText()) {
			log.info("Billing Amount is not same");
		}else {
			log.info("Billing Amount is same");
		}
	}
}