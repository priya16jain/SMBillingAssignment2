package com.surveymonkey.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class SignupPage {

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
		Reporter.log("Enter Username", true);
		passwordTextBox.clear();
		passwordTextBox.sendKeys(password);
		Reporter.log("Enter Password", true);
		EmailTextBox.clear();
		EmailTextBox.sendKeys(email);
		Reporter.log("Enter email", true);
		firstnameTextBox.clear();
		firstnameTextBox.sendKeys(firstname);
		Reporter.log("Enter firstname", true);
		lastnameTextBox.clear();
		firstnameTextBox.sendKeys(lastname);
		Reporter.log("Enter lastname", true);

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
		Reporter.log("Clicked Signup Button", true);
	}
}
