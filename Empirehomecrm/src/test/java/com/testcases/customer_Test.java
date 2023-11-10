package com.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Login_page02;
import com.pageobjects.customer_functionality;



public class customer_Test extends Basetest {

	Login_page02 Login;
	customer_functionality Customer;

	public customer_Test() {
		super();
	}

	@BeforeMethod
	public void setup() {

		initialization();

		Login = new Login_page02();
		Customer = new customer_functionality();
	}

	@Test

	public void Customervalidation() throws Throwable {
		Login.verifyLogin();
		Customer.Customervalidation();

		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/User/CustomerList");

	}

	@AfterMethod
	public void teardown() {

	}
}

