package com.testcases;

import org.bouncycastle.jcajce.provider.asymmetric.ec.GMCipherSpi.SM2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginpage;

import dev.failsafe.internal.util.Assert;

public class stock_movefunctionality<StockmoveFunctionality> extends Basetest {
	Loginpage LP ;
	stock_movefunctionality SMF;

	
	public void Stock_moving () {
		
	}
		
@BeforeMethod
public  void Data() {
	initialization();
	LP = new Loginpage();
	StockmoveFunctionality SMF= new  StockmoveFunctionality();
}
public void initialization() {
	// TODO Auto-generated method stub
	
}

@Test
public void Data1() throws Throwable {
	LP.Loginverification();
	  SMF.verifyStockmove();
	String urltest =  driver.getCurrentUrl();
	Assert.asserteEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/StockMovement");

}

@AfterMethod
public void teardown() {

}
}
	
	


