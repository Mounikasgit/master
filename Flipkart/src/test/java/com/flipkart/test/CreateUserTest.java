package com.flipkart.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.flipkart.genericLib.BaseTest;
import com.flipkart.genericLib.FileLib;
import com.flipkart.genericLib.WebDriverCommonLib;
import com.flipkart.pages.ActiveProjectsAndCustomers;
import com.flipkart.pages.AddNewUserPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.OpenTasksPage;
import com.flipkart.pages.UserListPage;

public class CreateUserTest extends BaseTest

{
	@Test
	public void createusertest() throws Throwable 
	{
		LoginPage lp=new LoginPage();
		FileLib flib=new FileLib();
		lp.login(flib.readPropData(PROP_PATH, "username"),flib.readPropData(PROP_PATH, "password"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.readPropData(PROP_PATH, "openTaskTitle"));
		wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "openTaskTitle"),"open task page");
		  
		OpenTasksPage otp=new OpenTasksPage();
		otp.clickUsersTab();
		
		wlib.waitForPageTitle(flib.readPropData(PROP_PATH, "userListTitle"));
		wlib.verifyPage(wlib.getPageTitle(),flib.readPropData(PROP_PATH, "userListTitle"),"user list page");
		
		UserListPage ulp=new UserListPage();
		ulp.clickAddNewUserBtn();
		
		wlib.waitForPageTitle(flib.readPropData(PROP_PATH, "addNewUserTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.readPropData(PROP_PATH, "addNewUserTitle"), "add NewUser Title");
		
		AddNewUserPage anup= new AddNewUserPage();
		anup.createUser(flib.getData(EXCEL_PATH,"Sheet1",0,1),
				flib.getData(EXCEL_PATH,"Sheet1",1,1),
				flib.getData(EXCEL_PATH,"Sheet1",2,1),
				flib.getData(EXCEL_PATH,"Sheet1",3,1),
				flib.getData(EXCEL_PATH,"Sheet1",4,1));
		
		if(ulp.getSuccesMsg().isDisplayed())
		{
			Reporter.log("user is created,sucess message is displayed",true);
			
		}
		else
		{
			Reporter.log("user is not created,sucess message is not displayed",true);
		}
	

	
}
}


				
				
	
