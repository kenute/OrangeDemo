package com.DemoOrange.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Recuiters_Objects {
WebDriver driver;

	
	public Recuiters_Objects(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//select[@id='candidateSearch_jobTitle']")
	WebElement sel1;
	@FindBy(xpath ="//select[@id='candidateSearch_jobVacancy']")
	WebElement sel2;
	
	@FindBy(xpath ="//b[contains(text(),'Recruitment')]")
	WebElement recuit;
	
	public void recuit() {
		recuit.click();
	}
	public void  sel1(String val) {
		Select s1=new Select(sel1);
	s1.selectByVisibleText(val);

	}
	public void  sel2(String val) {
		Select s1=new Select(sel2);
	s1.selectByVisibleText(val);
	}
	
}

