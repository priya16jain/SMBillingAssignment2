package com.surveymonkey.pom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {

	/**
	 * This method will generate and return a random username for SignUp.
	 * 
	 * 
	 * @param  void
	 * @return String
	 *  
	 */
	public static String getRandomUsername() {
		return "IN_b2p_" + new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date()) + "test_user_";
	}
}
