package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

import dev.failsafe.internal.util.Assert;

public class customertest<Customerfunctionality> extends Basetest {
	Loginfunctionality lf;
	Customerfunctionality cf;
	public customertest() {
		super();
	}
 @BeforeMethod
 public void setup() {
	 initialization();
 }
public void initialization() {
	// TODO Auto-generated method stub
	lf = new Loginfunctionality();
	   lf.verifylogin();
	   cf = new Customerfunctionality();
	
}
@Test
public void customerfunctionality() throws Throwable {
	  cf.verifycustomer();
	  String urltest = driver.getCurrentUrl();
	  Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/user/CustomerList"); 
}
@AfterMethod
public void teardown() {
	driver.close();
}
}
