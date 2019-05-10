package com.surveymonkey.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	public static WebDriver driver;
	public static ChromeDriver getChromeDriver() 
	{
	System.setProperty("webdriver.chrome.driver","src\\driver\\chromedriver.exe");
 	driver = new ChromeDriver();
 	return (ChromeDriver) driver;
	}
}
