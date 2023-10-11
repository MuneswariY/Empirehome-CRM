package com.pageobjects;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.github.dockerjava.api.model.Driver;

public class Add_inventory_product extends  Basetest {
	private final String sheetname1 = "AddProductInventory";
	Loginpage Login;
	Add_inventory_product AddInventory;
	private Object Dataprovider;

	public Add_inventory_product() {
		super();
	}

	@DataProvider
	public Object[][] dataload() throws Throwable {
		return Dataprovider.data(sheetname1);
	}

	@BeforeMethod
	public void setup() {
		initialization();
		Login = new Loginpage();
		AddInventory = new Add_inventory_product();
	}

	public void initialization() {
		// TODO Auto-generated method stub
		
	}

	@Test(dataProvider = "dataload")
	public void loginvalidation(String ModelNumber, String Title, String ItemDescription, String Height, String Width,
			String Breadth, String ColorName, String ActualPrice, String textMRP, String Qty) throws Throwable {

		Login.verifyLogin();

		 AddInventory.verifyAddInventorypage(ModelNumber, Title, ItemDescription, Height, Width, Breadth, ColorName,
				ActualPrice, textMRP, Qty);

		String urltest = Driver.getcurrenturl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/");
	}

	void verifyAddInventorypage(String modelNumber, String title, String itemDescription, String height,
			String width, String breadth, String colorName, String actualPrice, String textMRP, String qty) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	public void teardown() {
		
	}
}


