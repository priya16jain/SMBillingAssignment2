package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DashboardPage {
	
	private static Logger log = Logger.getLogger(DashboardPage.class.getName());

	@FindBy(xpath = "//a[contains(text(),'Plans & Pricing')]")
	static WebElement plansAndPricingOption ;

	@FindBy(id=("userAcctTab_MainMenu"))
	static WebElement MainMenu;

	@FindBy(xpath = "//a[contains(text(),'My Account')]")
	static WebElement myAccountOption;

	/**
	 * This method will click on Plans And Pricing Option.
	 * 
	 * 
	 * @param  void
	 * @return void
	 *  
	 */
	public static void clickPlansAndPricingOption(){
		CommonUtils.waitForElementToBeVisible(plansAndPricingOption);
		CommonUtils.waitForElementToBeClickable(plansAndPricingOption);
		plansAndPricingOption.click();
		log.info("Click on plans And Pricing Option");
	}
	/**
	 * This method will click Main Menu.
	 * 
	 * @param  void
	 * @return void
	 * @throws InterruptedException 
	 *  
	 */
	public static void clickMainMenu() throws InterruptedException{
		Thread.sleep(2000);
		CommonUtils.waitForElementToBeVisible(MainMenu);
		CommonUtils.waitForElementToBeClickable(MainMenu);
		Assert.assertTrue(MainMenu.isDisplayed());
		MainMenu.click();
		log.info("Click on MainMenu");
	}

	/**
	 * This method will click My Account Option.
	 * 
	 * 
	 * @param  void
	 * @return void
	 * @throws InterruptedException 
	 *  
	 */
	public static void clickMyAccountOption() throws InterruptedException{
		Thread.sleep(2000);
		Assert.assertTrue(myAccountOption.isDisplayed());
		CommonUtils.waitForElementToBeVisible(myAccountOption);
		CommonUtils.waitForElementToBeClickable(myAccountOption);
		myAccountOption.click();
		log.info("Click on  my Account Option");
	}
}




