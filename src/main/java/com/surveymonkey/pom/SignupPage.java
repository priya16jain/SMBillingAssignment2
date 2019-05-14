package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignupPage {	

	private static Logger log = Logger.getLogger(SignupPage.class.getName());

	@FindBy(id="username")
	static WebElement usernameTextBox;

	@FindBy(id="password")
	static WebElement passwordTextBox;

	@FindBy(name="first_name")
	static WebElement firstnameTextBox;

	@FindBy(name="last_name")
	static WebElement lastnameTextBox;

	@FindBy(name="email")
	static WebElement EmailTextBox;

	@FindBy(xpath="//button[@type='submit']")
	static WebElement SignUpButton;

	/**
	 * This method will enter User Details for SignUp .
	 * 
	 * 
	 * @param username, password, email,  firstname, lastname
	 * @return void
	 *  
	 */
	public static void enterSignupData(String username, String password, String email, String firstname, String lastname)
	{	
		Assert.assertTrue(usernameTextBox.isDisplayed());
		usernameTextBox.clear();
		usernameTextBox.sendKeys(username);
		log.info("Enter Username");
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		log.info("Enter Password");
		EmailTextBox.clear();
		EmailTextBox.sendKeys(email);
		log.info("Enter email");
		firstnameTextBox.clear();
		firstnameTextBox.sendKeys(firstname);
		log.info("Enter firstname");
		lastnameTextBox.clear();
		firstnameTextBox.sendKeys(lastname);
		log.info("Enter lastname");

	}

	/**
	 * This method Click on SignUp Button .
	 * 
	 * 
	 * @param void 
	 * @return void
	 *  
	 */
	public static void signUpButton()
	{
		SignUpButton.click();
		log.info("Clicked Signup Button");
	}
}
