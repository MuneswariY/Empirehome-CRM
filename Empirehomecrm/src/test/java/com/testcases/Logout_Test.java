package com.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Login_page02;
import com.pageobjects.LogoutFunctionality;

public class Logout_Test extends Basetest {
	Login_page02 lf;
	LogoutFunctionality logout;
	
	public Logout_Test() {
		 super();
	}
	@BeforeMethod
	public void setup() {
		  initialization();
		  
		  lf = new Login_page02();
		  lf.verifyLogin();
		  
		  logout = new LogoutFunctionality();
		  
	}
	@Test
	
	public void logoutvalidation() throws Throwable  {
		logout.verifylogout();
		
		String urltest = driver.getCurrentUrl();
		
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/");
		
		
	}
	@AfterMethod
	public void teardown() {
		
	}

}
