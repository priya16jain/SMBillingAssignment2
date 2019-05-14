package com.surveymonkey.pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.surveymonkey.setup.Setup;

public class CommonUtils {
	private static Logger log = Logger.getLogger(CommonUtils.class.getName());

	static Properties property;
	static FileInputStream fs;

	/*
	 * This method will generate and return a random username for SignUp.
	 * 
	 * 
	 * @param void
	 * 
	 * @return String
	 * 
	 */
	public static String getRandomUsername() {
		return "IN_b2p_" + new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()) + "test_user_";
	}

	/*
	 * This method method will read data from test data file .
	 * 
	 * 
	 */
	public static Properties getProperty() throws Exception {
		try {
			fs = new FileInputStream(System.getProperty("user.dir") + "\\config.properties");
			property = new Properties();
			property.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property;

	}

	/**
	 * This method wait for given element to be visible in DOM
	 * 
	 * @return void
	 * @param WebElement
	 */
	public static void waitForElementToBeVisible(WebElement element) {
		log.info("Waiting for element to be visible....");
		WebDriverWait wait = new WebDriverWait(Setup.driver, 120);
		wait.until(ExpectedConditions.visibilityOf(element));
		log.info("Element found");
	}

	/**
	 * This method wait for given element to be clickable in DOM
	 * 
	 * @return void
	 * @param WebElement
	 */
	public static void waitForElementToBeClickable(WebElement element) {
		log.info("Waiting for element to be visible and Clickable....");
		WebDriverWait wait = new WebDriverWait(Setup.driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

}
