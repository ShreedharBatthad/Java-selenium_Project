package com.orgbatthad.constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Frameworkconcepts {

	private Frameworkconcepts() 
	{

	}

	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/main/resources/chromedriver";


	public static String getChromeDriverpath() {
		return CHROMEDRIVERPATH;
	}


}
