package com.testcases;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Login_page02;
import com.pageobjects.Loginpage;

public class HolidayFunctionality extends Basetest {
	Login_page02 login;
	HolidayFunctionality holidays;
	 
	
	public HolidayFunctionality() {
		super();
	}	
	@BeforeMethod
	public void setup() {
		initialization();
		
		login = new Login_page02();
		holidays = new HolidayFunctionality();
	}
	@Test	
	public void Holidaysvalidation() {
		login.verifyLogin();
		holidays.Holidaysvalidation();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirename,myprojectonline.co.in/master/Holidays");
	}
		
	@AfterMethod
	public void teardown() {
		
	}
	

}
