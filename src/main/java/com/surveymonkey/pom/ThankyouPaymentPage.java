package com.surveymonkey.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ThankyouPaymentPage {

	@FindBy(xpath="//a[contains(text(),'GO TO DASHBOARD')]")
	static WebElement goToDashboardButton;

	/**
	 * This method will click Go To Dashboard Button once user successfully submit the payment .
	 * 
	 * 
	 * @param void 
	 * @return void
	 *  
	 */
	public static void clickGoToDashboardButton()
	{
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		goToDashboardButton.click();
		Reporter.log("Clicked go To Dashboard Button", true);

	}

}
