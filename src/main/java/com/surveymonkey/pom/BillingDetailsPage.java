package com.surveymonkey.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class BillingDetailsPage {

	@FindBy(xpath="//span[contains(text(),'PREMIER')]")
	static WebElement planType ;

	@FindBy(xpath="//span[contains(text(),'₨ 59,988')]")
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
			Reporter.log("Same Plan Type", true);
		}else {
			Reporter.log("Plan Type is not same");
		}
		Assert.assertTrue(BillingAmount.isDisplayed());
		if(totalBilling==BillingAmount.getText()) {
			Reporter.log("total Billing is same ", true);
		}else {
			Reporter.log("total Billing is not same");
		}
	}
}