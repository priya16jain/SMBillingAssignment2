package com.surveymonkey.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PremierAnnualPage {

	@FindBy(name="first_name")
	static WebElement firstNameTextBox;

	@FindBy(name="last_name")
	static WebElement lastNameTextBox;

	@FindBy(name="country_subdivision")
	static WebElement subdivisionDropdown;

	@FindBy(xpath="//option[contains(text(),'Bihar')]")
	static WebElement stateOption ;

	@FindBy(xpath="//button[contains(text(),'Next')]")
	static WebElement NextButton ;

	@FindBy(name="full_name")
	static WebElement nameOnCard ;

	@FindBy(name="credit_card_number")
	static WebElement creditCardNumber;

	@FindBy(name="credit_card_verification")
	static WebElement creditCardVerification ;

	@FindBy(name="expiry_date")
	static WebElement expiryDate;

	@FindBy(xpath=" //button[contains(text(),'Confirm')]")
	static WebElement ConfirmButton ;

	@FindBy(xpath=" //strong[contains(text(),'₨ 59,988')]")
	static WebElement billingAmount ;


	/**
	 * This method will enter User Details .
	 * 
	 * 
	 * @param firstname, lastname
	 * @return void
	 *  
	 */
	public static void enterUserDetails( String firstname, String lastname)
	{	
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys(firstname);
		Reporter.log("Entered firstname", true);
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(lastname);
		Reporter.log("Entered lastname", true);
		subdivisionDropdown.click();
		Reporter.log("Click on Dropdown of States", true);
		stateOption.click();
		Reporter.log("Click on States Options", true);
		NextButton.click();
		Reporter.log("Click on Next Button", true);	
	}

	/**
	 * This method will select individual Plan .
	 * 
	 * 
	 * @param nameoncreditcard, creditcardnumber, creditCardVerificationNumber, expiryDateOfCard 
	 * @return void
	 *  
	 */
	public static void enterCardDetails( String nameoncreditcard, String creditcardnumber, String creditCardVerificationNumber, String expiryDateOfCard  )
	{
		nameOnCard.clear();
		nameOnCard.sendKeys(nameoncreditcard);
		Reporter.log("Entered name on credit card", true);
		creditCardNumber.clear();
		creditCardNumber.sendKeys(creditcardnumber);
		Reporter.log("Entered credit Card Number", true);
		creditCardVerification.clear();
		creditCardVerification.sendKeys(creditCardVerificationNumber);
		Reporter.log("Entered credit Card Verification Number", true);
		expiryDate.clear();
		expiryDate.sendKeys(expiryDateOfCard);
		Reporter.log("Entered expiryDate", true);
		NextButton.click();
		Reporter.log("Click on Next Button", true);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConfirmButton.click();
		Reporter.log("Click on Confirm Button", true);
	}

	/**
	 * This method will select individual Plan .
	 * 
	 * 
	 * @param void 
	 * @return string
	 *  
	 */
	public static String getTotalBillingAmount() {
		String totalBilling  = billingAmount.getText();
		return totalBilling;
	}

}




