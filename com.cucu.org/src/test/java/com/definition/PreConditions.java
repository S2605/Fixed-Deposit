package com.definition;

import BaseClass.BaseCodes;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class PreConditions extends BaseCodes {
	
	
	@Before
	public static void beforeSetUp() {
		
		CommonUtils.loadProperties();
		browserLaunch(Constants.BROWSER);
		loadUrl(Constants.APP_URL);
		
		
	}
	@After
	public static void tearDown() {
		
		quitBrowser();
		
	}

}
