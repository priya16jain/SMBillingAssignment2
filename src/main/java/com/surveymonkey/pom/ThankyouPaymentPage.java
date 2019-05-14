package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ThankyouPaymentPage {

	private static Logger log = Logger.getLogger(ThankyouPaymentPage.class.getName());

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
		Assert.assertTrue(goToDashboardButton.isDisplayed());
		CommonUtils.waitForElementToBeVisible(goToDashboardButton);
		CommonUtils.waitForElementToBeClickable(goToDashboardButton);
		goToDashboardButton.click();
		log.info("Clicked go To Dashboard Button");

	}

}
