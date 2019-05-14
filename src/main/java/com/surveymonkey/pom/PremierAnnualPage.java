package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PremierAnnualPage {

	private static Logger log = Logger.getLogger(PremierAnnualPage.class.getName());

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
	static WebElement securityCode ;

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
		log.info("Entered firstname");
		lastNameTextBox.clear();
		lastNameTextBox.sendKeys(lastname);
		log.info("Entered lastname");
		subdivisionDropdown.click();
		log.info("Click on Dropdown of States");
		stateOption.click();
		log.info("Click on States Options");
		NextButton.click();
		log.info("Click on Next Button");
	}

	/**
	 * This method will select individual Plan .
	 * 
	 * 
	 * @param nameoncreditcard, creditcardnumber, creditCardVerificationNumber, expiryDateOfCard 
	 * @return void
	 *  
	 */
	public static void enterCardDetails( String nameoncreditcard, String creditcardnumber, String expiryDateOfCard, String creditCardVerificationNumber )
	{
		nameOnCard.clear();
		nameOnCard.sendKeys(nameoncreditcard);
		log.info("Entered name on credit card`");
		creditCardNumber.clear();
		creditCardNumber.sendKeys(creditcardnumber);
		log.info("Entered credit Card Number");
		expiryDate.clear();
		expiryDate.sendKeys(expiryDateOfCard);
		log.info("Entered expiryDate");
		securityCode.clear();
		securityCode.sendKeys(creditCardVerificationNumber);
		log.info("Entered credit Card Verification Number");
		NextButton.click();
		log.info("Click on Next Button");
		CommonUtils.waitForElementToBeVisible(ConfirmButton);
		ConfirmButton.click();
		log.info("Click on Confirm Button");
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




