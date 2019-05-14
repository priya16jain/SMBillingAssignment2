package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

	private static Logger log = Logger.getLogger(HomePage.class.getName());

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

	public static void verifyHomePage(){
		Assert.assertTrue(SignupElement.isDisplayed());
		log.info("Home Page is dispalyed");
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
		log.info("Navigated to Signup Page and Username Text Box is displayed");
	}			
}
