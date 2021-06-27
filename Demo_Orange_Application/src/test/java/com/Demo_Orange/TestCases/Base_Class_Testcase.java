package com.Demo_Orange.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base_Class_Testcase {
	public static WebDriver driver;
	public static Logger logger;
	
@BeforeTest
	public void setup() throws InterruptedException{
	
	
		
	String ProjectPath=System.getProperty("user.dir");
	logger = Logger.getLogger(Base_Class_Testcase.class);
	PropertyConfigurator.configure(ProjectPath+"/test-output/log4j1.properties");
	
	
	System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	logger.info("login passed");
	
	
}
public  void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}


@AfterTest
	public void tearDown()
	{
		driver.quit();
		
	}
	
}