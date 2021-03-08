package com.flipkart.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class LoginPage 
{
@FindBy(name="username") private WebElement untb;
@FindBy(name="pwd") private WebElement pwtb;
@FindBy(xpath="//input[@type='submit']") private WebElement loginBtn;


public LoginPage()
{
	PageFactory.initElements(BaseTest.driver,this);
	
}
public void login(String un,String pwd)
{
	untb.sendKeys(un);
	pwtb.sendKeys(pwd);
	loginBtn.click();
}

}





	


