package com.Demo_Orange.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Cache_Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		// TODO Auto-generated method stub
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("chrome://settings/clearBrowserData");
		driver.manage().window().maximize();
Thread.sleep(10000);
Actions ac= new Actions(driver);
for(int i=1;i<=7;i++) {

    ac.sendKeys(Keys.TAB);
  
    Thread.sleep(1000);
}
ac.sendKeys(Keys.ENTER);

Thread.sleep(1000);
      
		Thread.sleep(10000);
		driver.get("https://www.facebook.com/");
	}

}
