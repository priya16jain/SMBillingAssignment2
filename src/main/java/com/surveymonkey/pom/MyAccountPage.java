package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MyAccountPage {
	private static Logger log = Logger.getLogger(MyAccountPage.class.getName());

	@FindBy(xpath = "//a[@href='/billing/']")
	static WebElement billingDetails ;

	/**
	 * This method will navigate To billing Details Options.
	 *  
	 * @param void 
	 * @return void
	 *  
	 */		
	public static void clickbillingDetailsOptions ()
	{
		CommonUtils.waitForElementToBeVisible(billingDetails);
		CommonUtils.waitForElementToBeClickable(billingDetails);
		billingDetails .click();
		log.info("billing Details Option");
	}

}
