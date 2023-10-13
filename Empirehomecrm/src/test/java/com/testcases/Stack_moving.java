package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;

import dev.failsafe.internal.util.Assert;

public class Stack_moving<StockmoveFunctionality>  extends Basetest{
	Loginpage LP ;
	StockmoveFunctionality SMF;
	
	public void Stock_moving () {
		super();
	}
		
@BeforeMethod
public void Data() {
	initialization();
	LP = new Loginpage();
	StockmoveFunctionality SMF= new  StockmoveFunctionality();
}
@Test
public void Data1() throws Throwable {
	LP.Loginverification();
	  SMF.verifyStockmove();
	String urltest = driver.getCurrentUrl();
	Assert.asserteEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

}

@AfterMethod
public void teardown() {

}
}
	
	


