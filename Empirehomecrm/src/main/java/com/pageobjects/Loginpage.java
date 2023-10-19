package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;

public class Loginpage  extends Basetest{
	
	private final String sheetname1 = "AddProductInventory";
	Loginpage Login;
	Add_inventory_product AddInventory;
	private Object Dataprovider;

	public Loginpage() {
		super();
	}

	@DataProvider
	public Object[][] dataload() throws Throwable {
		return Dataprovider(sheetname1);
	}

	private Object[][] Dataprovider(String sheetname12) {
		// TODO Auto-generated method stub
		return null;
	}

	@BeforeMethod
	public  void setup() {
		initialization();
		Login = new Loginpage();
		AddInventory = new Add_inventory_product();
	}

	@Test(dataProvider = "dataload")
	public void loginvalidation(String ModelNumber, String Title, String ItemDescription, String Height, String Width,
			String Breadth, String ColorName, String ActualPrice, String textMRP, String Qty) throws Throwable {

		Login.verifyLogin();

		AddInventory.verifyAddInventorypage(ModelNumber, Title, ItemDescription, Height, Width, Breadth, ColorName,
				ActualPrice, textMRP, Qty);

		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Inventory/All");
	}

	
	
		
	



	

	private void verifyLogin() {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	public void teardown() {
		
	}

	public void Loginverification() {
		// TODO Auto-generated method stub
		
	}
}
