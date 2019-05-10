package com.surveymonkey.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage {

	static String baseurl = "https://www.monkeytest1.com";

	@FindBy(xpath="//a[@class='sign-up static-buttons']")
	static WebElement SignupElement;

	/**
	 * This method will navigate To Home Page.
	 *  
	 * @param void 
	 * @return void
	 *  
	 */	

	public static void navigateToHomePage(){
		Assert.assertTrue(SignupElement.isDisplayed());
		Reporter.log("Navigated to Home Page", true);	
	}

	/**
	 * This method will navigate To SignUp Page.
	 *  
	 * @param void 
	 * @return void
	 *  
	 */	
	public static void navigateToSignUp(){
		SignupElement.click();
		Assert.assertTrue(SignupPage.usernameTextBox.isDisplayed());
		Reporter.log("Navigated to Signup Page and Username Text Box is displayed", true);	

	}			
}
