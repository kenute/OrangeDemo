package com.Orange_Demo_Utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Demo_Utilities extends TestListenerAdapter{
ExtentHtmlReporter htmlreport;

	@Override
	public void onStart(ITestContext testContext) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSkipped(tr);
	}


	
	
}