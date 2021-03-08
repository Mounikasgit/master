package com.flipkart.test;

import org.testng.annotations.Test;

import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.FileLib;
import com.flipkart.genericLib.WebDriverCommonLib;
import com.flipkart.pages.ActiveProjectsAndCustomers;
import com.flipkart.pages.AddNewProject;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.OpenTasksPage;

public class CreateProject extends BaseTest
{
@Test
public void projecttest() throws Throwable

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
	apac.clickonaddnewproject();
	
	wlib.waitForPageTitle(flib.readPropData(PROP_PATH, "addNewProject"));
	wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "addNewProject"),"AddNewProject");
	
	AddNewProject anp=new AddNewProject();
	anp.customerdropdown(flib.getData(EXCEL_PATH, "Sheet1", 5, 1));
	anp.enterprojectname(flib.getData(EXCEL_PATH, "Sheet1", 6, 1));
	
	apac.retrievesuccessmsgprojects();
	
	
	
}

}
