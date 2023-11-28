package com.testcases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.LocationFunctionality;
import com.pageobjects.Login_page02;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.asm.Advice.OffsetMapping.ForThrowable;

public class Location_Test extends Basetest{
	LocationFunctionality location;
	Login_page02 lf;
	
	public Location_Test() {
		
		super();
	}
	@BeforeTest
	public void setup() {
		initialization();
		
		lf = new Login_page02();
		lf.verifyLogin();
		
		location = new LocationFunctionality();
	}
	@Test(priority = 1)
	
	public void addnewlocationvalidation() throws Throwable {
		 
	
		 
		 List<WebElement> records = driver.findElements(By.tagName("tr"));
		 int recordcount = records.size();
	org.testng.Assert.assertEquals(recordcount,82);
	}
	@Test(priority = 2)
	public void editlocationvalidation() {
		String urltest = driver.getCurrentUrl();
	org.testng.Assert.assertEquals(urltest,"http://empirehome.myprojectsonline.co.in/master/Location");
		
	}
       @Test(priority = 3)
       
       public  void deletelocationvalidation() {
    	   List<WebElement> records = driver.findElements(By.tagName("tr"));
  		 int recordcount = records.size();
  	org.testng.Assert.assertEquals(recordcount,81);
    	   
       }
}
