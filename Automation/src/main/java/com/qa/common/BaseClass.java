package com.qa.common;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.ExtentTest;

import groovyjarjarasm.asm.commons.Method;

public abstract class BaseClass {
	public static WebDriver driver;

	public BaseClass() throws IOException {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constant.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constant.IMPLICITY_TIME_OUT, TimeUnit.SECONDS);
		driver.get(FileUtils.readProperties(Constant.CONFIG_PROPERTIES).getProperty("BaseURL"));
		
		
		
	}

}
