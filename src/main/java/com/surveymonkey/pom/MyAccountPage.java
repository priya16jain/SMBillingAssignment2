package com.surveymonkey.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MyAccountPage {

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		billingDetails .click();
		Reporter.log("billing Details Option", true);
	}

}
