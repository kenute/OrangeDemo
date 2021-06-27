package com.DemoOrange.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Time_Sheet_Page {
WebDriver driver;
By TimeLogo= By.xpath("//tbody/tr[1]/td[3]/div[1]/a[1]/img[1]");

	public Time_Sheet_Page(WebDriver driver) {
		this.driver =driver;
		
	}





public void timelogop_Click() {
	driver.findElement(TimeLogo).click();
}
}