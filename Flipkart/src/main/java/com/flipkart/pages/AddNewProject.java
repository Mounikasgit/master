package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.flipkart.genericLib.BaseTest;

public class AddNewProject

{ 
@FindBy(xpath="//select[@name='customerId']") private WebElement customer;
@FindBy(xpath="//input[@name='name']") private WebElement projectname;
@FindBy(xpath="//input[@name='createProjectSubmit']") private WebElement submitbtn;

public AddNewProject()
{
PageFactory.initElements(BaseTest.driver, this);

}
public void customerdropdown(String vistext)
{
 Select s1=new Select(customer);
 s1.selectByVisibleText(vistext);
 
}
public void enterprojectname(String pname)
{
	 projectname.sendKeys(pname);
	 submitbtn.click();
	
}

	

}
