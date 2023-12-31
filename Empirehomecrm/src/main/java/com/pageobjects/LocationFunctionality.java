package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class LocationFunctionality  extends Basetest{
	@FindBy(xpath = "\"//span[@class='pe-7s-keypad']\")\r\n")
				WebElement element;
			
				@FindBy (xpath = "//span[normalize-space()='Masters']")
				WebElement masters;
		
				@FindBy (xpath = "//a[normalize-space()='Location']")
			WebElement location;
			
			@FindBy (xpath = "//a[normalize-space()='Add New']")
			WebElement addnew;
			
			@FindBy (xpath = "//input[@id='LocationName']")
			WebElement locationname;
			
			@FindBy (xpath = "//button[normalize-space()='Save']")
				WebElement savebutton;
			
			@FindBy (xpath = "//input[@class='form-control form-control-sm']")
				WebElement search;
			
				@FindBy (xpath = "//i[@class='fa fa-pencil']")
				WebElement edit;
			
				@FindBy (xpath = "//i[@class='fa fa-trash-o']")
				WebElement delete;
			
				@FindBy (xpath = "//button[@class='swal-button swal-button--yes']")
				WebElement yes;
			
				@FindBy (xpath = "//select[@name='mydatatable_length']")
				WebElement length;
		
				public LocationFunctionality() {
				
				PageFactory.initElements(driver, this);
					
				}
			
		
				public void verifyaddnewlocation() throws Throwable {
				
			Thread.sleep(2000);
				element.click();
			masters.click();
				location.click();
				Thread.sleep(2000);
				addnew.click();
				Thread.sleep(2000);
				locationname.sendKeys(prop.getProperty("Locationname"));
				Thread.sleep(2000);
				savebutton.click();
			
			public void verifyeditlocation() throws Throwable {
			
				Thread.sleep(2000);
				search.sendKeys(prop.getProperty("Locationname"));
				search.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				edit.click();
				locationname.clear();
			locationname.sendKeys(prop.getProperty("EditLocationname"));
			Thread.sleep(2000);
			savebutton.click();
			
				}
		
			
				public void verifydeletelocation() throws Throwable {
		
				Thread.sleep(2000);
			search.sendKeys(prop.getProperty("EditLocationname"));
		search.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				delete.click();
				yes.click();
				Thread.sleep(2000);
				
			
			
       
	
		
	}
				}

