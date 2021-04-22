package com.cjc.mt.Listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo implements ITestListener,ISuiteListener
{
	
	public void onStart(ITestContext context)
	{
		System.out.println("This is our On Start");
	}
	
	
	public void onFinish(ITestContext context)
	{
		System.out.println("This is our On Finish");
	}
	
	
	public void onTestStart(ITestResult result)
	{
		System.out.println("This is our On Test Start");
	}
	

	public void onTestSuccess(ITestResult result)
	{
		System.out.println("This is our On Test Success");
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("This is our On Test Failure");
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("This is our On Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("On Start Class");
	}

	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		System.out.println("On Finish Class");

	}
	
}