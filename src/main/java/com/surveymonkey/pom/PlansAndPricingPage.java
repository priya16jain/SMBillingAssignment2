package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlansAndPricingPage {
	
	private static Logger log = Logger.getLogger(PlansAndPricingPage.class.getName());

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
		CommonUtils.waitForElementToBeVisible(individualPlansAction);
		individualPlansAction.click();
		log.info("individual Plans Action Option");
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
		CommonUtils.waitForElementToBeVisible(selectPlan);
		selectPlan.click();
		log.info("select Plan");
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
