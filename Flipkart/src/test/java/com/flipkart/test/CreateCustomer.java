package com.flipkart.test;

import org.testng.annotations.Test;

import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.FileLib;
import com.flipkart.genericLib.WebDriverCommonLib;
import com.flipkart.pages.ActiveProjectsAndCustomers;
import com.flipkart.pages.AddNewCustomer;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.OpenTasksPage;

public class CreateCustomer extends BaseTest
{
	@Test
	public void customertest() throws Throwable
	{
		
	LoginPage lp=new LoginPage();
	FileLib flib=new FileLib();
	lp.login(flib.readPropData(PROP_PATH, "username"),flib.readPropData(PROP_PATH, "password"));
	
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	wlib.waitForPageTitle(flib.readPropData(PROP_PATH, "openTaskTitle"));
	wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "openTaskTitle"),"open task page");
	  
	OpenTasksPage otp=new OpenTasksPage();
	otp.clickonprojectsandcustomers();

	wlib.waitForPageTitle(flib.readPropData(PROP_PATH, "activeProjectsAndCustomers"));
	wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "activeProjectsAndCustomers"),"ActiveProjectsAndCustomers");
	
	ActiveProjectsAndCustomers apac=new ActiveProjectsAndCustomers();
	apac.clickonaddnewcustomer();
	wlib.waitForPageTitle(flib.readPropData(PROP_PATH, "addNewCustomer"));
	wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "addNewCustomer"),"add New Customer");
	
	AddNewCustomer anc=new AddNewCustomer();
	anc.createcustomer(flib.getData(EXCEL_PATH, "Sheet1",7 ,1));
	
	apac.retrievesuccessmsg();
	
	
}
	
}
