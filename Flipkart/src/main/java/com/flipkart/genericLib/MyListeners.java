package com.flipkart.genericLib;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	public class MyListeners implements ITestListener
	{
	
       public void onTestStart(ITestResult result) 
       {
    	   Reporter.log(result.getName()+" STARTED",true);
		}

		public void onTestSuccess(ITestResult result) {
			
			Reporter.log(result.getName()+" PASSED",true);
		}

		public void onTestFailure(ITestResult result) 
		{
			Reporter.log(result.getName()+" FAILED",true);
		  WebDriverCommonLib wlib=new WebDriverCommonLib();
		  wlib.getPageScreenshot("C:\\Users\\Qspiders-Swiping Pc\\Desktop\\Automation Grooming\\HybridFramework\\screenshots\\"+result.getName()+".png");
		
		}



		public void onTestSkipped(ITestResult result) 
		{
			Reporter.log(result.getName()+" SKIPPED",true);
			
		}

		public void onStart(ITestContext context)
		{
			Reporter.log(context.getName()+" started",true);
			
		}

		public void onFinish(ITestContext context) 
		{
			Reporter.log(context.getName()+" Completed",true);
			
		}
	}