package com.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.CategoriesFunctionality;
import com.pageobjects.Login_page02;

import dev.failsafe.internal.util.Assert;

public class Categories_Test  extends Basetest{
	Login_page02 lf;
	CategoriesFunctionality ctf;
	
	public Categories_Test() {
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		
		lf = new Login_page02();
		lf = Verifylogin();
	   ctf = new CategoriesFunctionality();

		
		
			
	}
	private Login_page02 Verifylogin() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Test (priority = 1)
	public void addnewcategoryvalidation() throws Throwable {
		ctf.common();
		ctf.verifyaddnewcategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	   AssertJUnit.assertEquals(recordcount, 8);
		
	}
	
	@Test (priority = 2)
	public void editcategoryvalidation() throws Throwable {
		//ctf.common();
		ctf.verifyeditcategory();
		
		String urltest = driver.getCurrentUrl();
		AssertJUnit.assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/Master/Categories");
	}
	
	@Test (priority = 3)
	public void deletecategoryvalidation() throws Throwable {
		
		ctf.verifydeletecategory();
		
		List<WebElement> records = driver.findElements(By.tagName("tr"));
		int recordcount = records.size();
	    AssertJUnit.assertEquals(recordcount, 7);
	}

	@AfterTest
	public void teardown() {
		
	}
	

}
		
		
	
		

