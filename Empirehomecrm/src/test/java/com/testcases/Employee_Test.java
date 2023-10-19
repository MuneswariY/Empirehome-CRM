package com.testcases;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Employeeregistration;
import com.pageobjects.Login_page02;
import com.pageobjects.loginpadefunctionality;

import dev.failsafe.internal.util.Assert;

public class Employee_Test  extends Basetest{
	
	Login_page02  lf;
	Employeeregistration ef;
	
	public Employee_Test() {
		super();
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
	    
		lf = new Login_page02 ();
	    lf = verifylogin();
	

		
		ef = new Employeeregistration() ;
	}
	
		
	
		private Login_page02 verifylogin() {
		// TODO Auto-generated method stub
		return null;
	}
		@Test
		private void Employeeregistrationvalidation() {
			
			ef.verifyemployee();
			String urltest =driver.getCurrentUrl();
			AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Holidays");
		
		
	}
	
}



