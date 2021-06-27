package com.Demo_Orange.TestCases;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.DemoOrange.pageObjects.Recuiters_Objects;


public class Recuiters extends Base_Class_Testcase {

	@Test
	public void recuit() throws InterruptedException, IOException {
		
		
		Recuiters_Objects c1=new Recuiters_Objects(driver);
		
		c1.recuit();
		Thread.sleep(3000);
		c1.sel1("Chief Financial Officer");
		
		c1.sel2("Sales Representative");
		
		
	/*	driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();
	

	Select sc1= new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']")));
sc1.selectByIndex(1);
	

Select sc2= new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_jobVacancy']")));
sc2.selectByIndex(1);*/
	}
}
