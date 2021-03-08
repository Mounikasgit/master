package com.flipkart.genericLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

	public class BaseTest implements IAutoConstants 
	{
		public static WebDriver driver;
		@BeforeTest
		public void openBrowser() throws Throwable
		{
			
			FileLib flib=new FileLib();
			String browser=flib.readPropData(PROP_PATH,"browser");
			System.out.println(browser);
			
			if(browser.equals("chrome"))
			{ 
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				driver= new ChromeDriver();
				
			}
			else if(browser.equals("firefox"))
			{
				System.setProperty(GECKO_KEY, GECKO_VALUE);
				driver=new FirefoxDriver();
			}
			else
			{
				System.out.println("give proper browser name");
			}
		
		      String appUrl=flib.readPropData(PROP_PATH,"url");
		      driver.get(appUrl);
	}
		      
		   public void closeBrowser()
		   {
			   driver.quit();
		
			}
		   }
		

