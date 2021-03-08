package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class AddNewUserPage {
@FindBy(name="username") private WebElement usernameTB;
@FindBy(name="passwordText") private WebElement passwordTB;
@FindBy(name="passwordTextRetype") private WebElement passwordRetypeTB;
@FindBy(name="firstName") private WebElement firstNameTB;
@FindBy(name="lastName") private WebElement lastNameTB;
@FindBy(xpath="//input[@type='submit']") private WebElement createUserBTN;

public AddNewUserPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public void createUser(String un,String pwd,String rPwd,String fn,String ln)
{
	usernameTB.sendKeys(un);
	passwordTB.sendKeys(pwd);
	passwordRetypeTB.sendKeys(rPwd);
	firstNameTB.sendKeys(fn);
	lastNameTB.sendKeys(ln);
	createUserBTN.click();
}
	
	
	
	
	
}




