package com.Demo_Orange.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoOrange.pageObjects.Time_Sheet_Page;
import com.DemoOrange.pageObjects.login_Page;
import com.Orange_Demo_Utilities.XLUtils_Orange;

public class Login_TestCase extends Base_Class_Testcase {
	@DataProvider(name="test1")
	public  Object[][] logintestdata() throws IOException {
		int a =0;
		XLUtils_Orange xl=new XLUtils_Orange();
		Object[][] a1= xl.getexcelalldata(a);
		
		return a1;
		
	}
	@Test(dataProvider ="test1")
	public void OrangeDemo(String Url,String Uname,String pwd) throws InterruptedException, IOException {
		
		login_Page x2= new login_Page(driver);
		/*driver.get("chrome://settings/clearBrowserData");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='clearBrowsingDataConfirm']")).click();
		Thread.sleep(10000);*/
		driver.get(Url);
		logger.info("navighateto url");
		driver.manage().window().maximize();
		x2.setUser(Uname);
		Actions act= new Actions(driver);

		logger.info("set uname");
		x2.setPassword(pwd);
		logger.info("set pw");
		x2.clickSubmit();
		Thread.sleep(4000);
		
	/*driver.findElement(x2).sendKeys(xl.getCellData(1,1));
	
	Thread.sleep(1000);
	driver.findElement(By.xpath()).sendKeys(Keys.TAB);
	Thread.sleep(1000);
	driver.findElement(By.xpath()).sendKeys(xl.getCellData(1,2));
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Keys.TAB);
	Thread.sleep(1000);
	
	driver.findElement(By.xpath()).click();
x2.
	}*/
	}	
}
