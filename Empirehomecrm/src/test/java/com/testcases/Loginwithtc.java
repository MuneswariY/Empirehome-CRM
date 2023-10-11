package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;

import com.utils.Datasource;

public class Loginwithtc extends Basetest {
	Loginwithtc If;
	private final String sheet = "sheet1";
	public  Loginwithtc() {
		super();
	}
	public Loginwithtc(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	@DataProvider
	public String[][] dataload() throws Throwable{
		return Datasource.Customerdata(sheet);
		
	}
	@BeforeMethod
	public void setup() {
		initialization();
		If = new Loginwithtc(driver);
		
	}
	@Test(dataProvider = "dataload",dataProviderClass = Loginwithtc.class)
	
	public void verifylogin(String username, String password) {
		// TODO Auto-generated method stub
		If.verifylogin(username,password);
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
	}
	
	



}
