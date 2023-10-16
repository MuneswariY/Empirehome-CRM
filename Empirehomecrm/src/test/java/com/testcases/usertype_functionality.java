package com.testcases;

import org.apache.xmlbeans.UserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

import dev.failsafe.internal.util.Assert;

public class usertype_functionality extends Basetest{
	Loginfunctionality lp;
	UserType user;
	public void UsertypeTest() {
	      super();
	}
    
	@BeforeMethod
    public void setup() {
    initialization();
  	lp = new Loginfunctionality();
  	user = new UserType();
	}
	
	@Test
	public void verifyusertypetestm() throws Exception {
	lp.verifylogin();
	((Object) user).verifyusertype();
	String urltest = driver.getCurrentUrl();
	Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Usertypes");
	}
	
	@AfterMethod
	public void teardown() {
	}




}
