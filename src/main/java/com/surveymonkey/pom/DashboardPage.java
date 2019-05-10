package com.surveymonkey.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class DashboardPage {

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
	public static void clickPlansAndPricingOption()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		plansAndPricingOption.click();
		Reporter.log("Click on plans And Pricing Option", true);
	}
	/**
	 * This method will click Main Menu.
	 * 
	 * @param  void
	 * @return void
	 *  
	 */
	public static void clickMainMenu(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		Assert.assertTrue(MainMenu.isDisplayed());
		MainMenu.click();
		Reporter.log("Click on MainMenu", true);
	}

	/**
	 * This method will click My Account Option.
	 * 
	 * 
	 * @param  void
	 * @return void
	 *  
	 */
	public static void clickMyAccountOption(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(MainMenu.isDisplayed());
		myAccountOption.click();
		Reporter.log("Click on  my Account Option", true);
	}
}




