package com.stepdefinition;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
		
		@Before
		public void beforeScenario()  {
			getDriver();
			maximize();
			loadUrl("http://dev-sportzentric.s3-website.us-east-2.amazonaws.com/");
			implicitiwait(20);
		}
	     @After
	    public void afterScenario(Scenario scenario) {
	    	 scenario.attach(getScreenShot(), "target//images//png", "Every Scenario");
		
	    	

		}


	}
