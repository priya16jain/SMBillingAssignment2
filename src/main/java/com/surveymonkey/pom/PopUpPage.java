package com.surveymonkey.pom;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PopUpPage {
	
	private static Logger log = Logger.getLogger(PopUpPage.class.getName());

	@FindBy(xpath = "//a[@class='linkClose']")
	static WebElement closeOption;
	/**
	 * This method will select individual Plan .
	 * 
	 * 
	 * @param void 
	 * @return void
	 * @throws InterruptedException 
	 *  
	 */
	public static void closePopUp() throws InterruptedException
	{
		Thread.sleep(5000);
		//CommonUtils.waitForElementToBeVisible(closeOption);
		closeOption.click();
        log.info("Clicked close Option");

	}
}


