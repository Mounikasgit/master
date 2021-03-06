package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class UserListPage
{
@FindBy(xpath="//input[@value='Add New User']") private WebElement addNewUserBtn;
@FindBy(xpath="//span[@class='successmsg']") private WebElement successMsg;

public UserListPage()
{
	PageFactory.initElements(BaseTest.driver, this);
}
public void clickAddNewUserBtn()
{
	addNewUserBtn.click();
}
public WebElement getSuccesMsg()
{
	return successMsg;
	
}

public String getTextSuccessMsg()
{
	return successMsg.getText();
}
}

