package com.DemoOrange.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange_Demo_Utilities.XLUtils_Orange;

public class login_Page {
	//XLUtils_Orange xlm=new XLUtils_Orange();
	WebDriver driver;
	//By UserName=By.xpath("//input[@id='txtUsername']");
	//By passWord=By.xpath("//input[@id='txtUsername']");
	//By Loginbtn=By.xpath("//input[@id='btnLogin']");
	
	public login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement usertxt;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement Pwtxt;
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement login_btn;
	
	public void setUser(String Uname) {
		
		usertxt.sendKeys(Uname);
	}
	public void setPassword(String pwd)
	{
		Pwtxt.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		login_btn.click();
	}	
	
	
	
}
