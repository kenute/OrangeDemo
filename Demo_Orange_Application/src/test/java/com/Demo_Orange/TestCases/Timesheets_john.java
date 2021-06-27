package com.Demo_Orange.TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Orange_Demo_Utilities.XLUtils_Orange;
import com.google.common.base.Verify;

public class Timesheets_john extends Base_Class_Testcase {
	String val=null;
	int i,j=1;
	int k,l =1;
	@Test
public  void timesheet() throws Exception  {
		XLUtils_Orange obj=new XLUtils_Orange();
		Thread.sleep(1000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/a[1]/img[1]")).click();

	driver.findElement(By.xpath("//input[@id='employee']")).clear();
	
	String d1=	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]")).getText();
	driver.findElement(By.xpath("//input[@id='employee']")).sendKeys(d1);
	driver.findElement(By.xpath("//input[@id='employee']")).sendKeys(Keys.ARROW_DOWN);
boolean st1 =	driver.findElement(By.xpath("//input[@id='btnView']")).isDisplayed();

  System.out.println(st1);
	driver.findElement(By.xpath("//input[@id='btnView']")).click();
	
	Thread.sleep(5000);


	Select Timesh= new Select(driver.findElement(By.xpath("//select[@id='startDates']")));
	
	Timesh.selectByVisibleText("2020-09-21 to 2020-09-27");
	//Timesh.selectByIndex(3);
	Thread.sleep(5000);
	List<WebElement> row=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr"));
	List<WebElement> col=driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td"));
//	captureScreen(driver, "tname");
	int row1=row.size();
	System.out.println(row1);
	int col1=col.size();
	System.out.println(col1);
	for(i=1;i<=row1;i++) {
		for(j=1;j<=col1;j++) {
		String val=	driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/table[1]/tbody[1]/tr["+i+"]/td["+j+"]")).getText();

	
		obj.writeIO(k,l,val);
       l=l+1;
		}
		l=l*0;
		l=l+1;
		k=k+1;
		j=j*0;
		j=j+1;
		}
}
	
}