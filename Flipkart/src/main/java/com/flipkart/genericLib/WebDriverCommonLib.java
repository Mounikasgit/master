package com.flipkart.genericLib;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

public class WebDriverCommonLib extends BaseTest
{
	

public String getPageTitle()
{
String title=driver.getTitle();
return title;
}

public void selectOption(WebElement element,String value)
{
	Select sel=new Select(element);
	sel.selectByValue(value);
	
}

public void selectOption(WebElement element,int index)
{
	Select sel=new Select(element);
	sel.selectByIndex(index);
}

public void selectOption(String text,WebElement element)
{
	Select sel=new Select(element);
	sel.selectByVisibleText(text);
}

public void switchToFrame(int index)
{
	driver.switchTo().frame(index);
}

public void switchToFrame(String value)
{
	driver.switchTo().frame(value);
}
public void switchToFrame(WebElement element)
{
	driver.switchTo().frame(element);
}

public void mouseHovering(WebElement element)
{
Actions ac=new Actions(driver);
ac.moveToElement(element).perform();

}

public void waitforElementVisibility(WebElement element)
{
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void waitForPageTitle(String title)
{
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.titleContains(title));
}

public void verifyPage(String actual,String expected,String pageName)
{
	Assert.assertEquals(actual, expected);
	Reporter.log(pageName+"Is Displayed",true);
}
public void getPageScreenshot(String path) 
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File(path);
	try {
		Files.copy(src, des);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}




	
	
	
	
	
	
	
	
	
	
	
	
	

