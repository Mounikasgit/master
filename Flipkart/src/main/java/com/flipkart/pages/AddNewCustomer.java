package com.flipkart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.genericLib.BaseTest;

public class AddNewCustomer {
	@FindBy(xpath="//input[@name='name'])") private WebElement customername;
	@FindBy(xpath="//input[@name='createCustomerSubmit']") private WebElement createcustomerbtn;
	
	public AddNewCustomer()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void createcustomer(String name)
	{
		customername.sendKeys(name);
		createcustomerbtn.click();
	}
	

}
