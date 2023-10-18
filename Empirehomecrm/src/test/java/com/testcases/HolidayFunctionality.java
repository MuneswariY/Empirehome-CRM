package com.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;

public class HolidayFunctionality extends Basetest {
	Loginpage login;
	HolidayFunctionality holidays;
	 
	
	public HolidayFunctionality() {
		super();
	}	
	@BeforeMethod
	public void setup() {
		initialization();
		
		login = new Loginpage();
		holidays = new HolidayFunctionality();
	}
	@Test	
	public void Holidaysvalidation() {
		login.Loginverification();
		holidays.Holidaysvalidation();
		
		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirename,myprojectonline.co.in/master/Holidays");
	}
		
	@AfterMethod
	public void teardown() {
		
	}
	

}
