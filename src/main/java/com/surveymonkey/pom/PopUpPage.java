package com.surveymonkey.pom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PopUpPage {

	@FindBy(xpath = "//a[@class='linkClose']//span")
	static WebElement closeOption;
	/**
	 * This method will select individual Plan .
	 * 
	 * 
	 * @param void 
	 * @return void
	 *  
	 */
	public static void closePopUp()
	{
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeOption.click();
		Reporter.log("Clicked close Option", true);

	}
}


