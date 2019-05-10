package com.surveymonkey.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PlansAndPricingPage {

    @FindBy(xpath="//a[contains(text(),'Individual Plans')]")
	static WebElement individualPlansAction;

	@FindBy(xpath="//a[contains(text(),'SELECT')]")
	static WebElement selectPlan;

	@FindBy(xpath="//div[contains(text(),'PREMIER')]")
	static WebElement premierPlan;
	
	/**
	 * This method will click Individual Plans Action .
	 * 
     * @param void 
	 * @return void
	 *  
	 */
	public static void clickIndividualPlansAction()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		individualPlansAction.click();
		Reporter.log("individual Plans Action Option", true);
	}
	
	/**
	 * This method will select individual Plan .
	 * 
	 * 
	 * @param void 
	 * @return void
	 *  
	 */
	public static void selectPlan()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectPlan.click();
		Reporter.log("select Plan", true);
	}

	/**
	 * This method will return plan type .
	 * 
	 * 
	 * @param void 
	 * @return String
	 *  
	 */
	public static String getPlanType() {
		String premierPlanType = premierPlan.getText();
		return premierPlanType;
	}

}
