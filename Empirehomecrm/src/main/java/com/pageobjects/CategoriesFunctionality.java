package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class CategoriesFunctionality extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	 WebElement keypad;
	@FindBy(xpath = "//span[normalize-space()='masters']")
	WebElement masters;
	@FindBy(xpath = "//a[normalize-space()='Categories']")
	WebElement categories;
	@FindBy(xpath = "//a[normalize-space()='Add New Category']")
	WebElement addnewcategory;
	@FindBy(xpath = "//input[@id='CategoryName']")
	WebElement categoryname;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	@FindBy(xpath = "//select[@name='mytable_length']")
	WebElement tablelength;
	@FindBy(xpath = "//i[@class='fa fa-pencil']")
	WebElement edit;
	@FindBy(id = "preloader")
	WebElement loader;
	@FindBy(xpath = "//i[@class='fa fa-trash-o']")
	WebElement delete;
	@FindBy(xpath = "//button[@class='swal-button swal-button-yes']")
	WebElement alert;
	@FindBy(xpath = "//select[@name='mydatatable_length']")
	WebElement length;
	
	public CategoriesFunctionality() {
		PageFactory.initElements(driver, this);
		
	}
	public void setup() throws Throwable {
		Thread.sleep(2000);
		Thread.sleep(2000);
		keypad.click();
		masters.click();
		categories.click();
	}	
		
	public void verifyaddnewcategory() throws Throwable {	
		
		Thread.sleep(2000);
		addnewcategory.click();
		categoryname.sendKeys(prop.getProperty("categoryName"));
		Thread.sleep(2000);
		savebutton.click();
		
	}
	
	public void verifyeditcategory() throws Throwable {
				
		search.sendKeys(prop.getProperty("categoryName"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		edit.click();
		

		
		categoryname.clear();
		categoryname.sendKeys(prop.getProperty("editcategoryName"));
		Thread.sleep(2000);
		savebutton.click();
		
		WebElement Edit = driver.findElement(By.xpath("//div[@id='mydatatable_info']"));

	
		
		
	}
	
	public void verifydeletecategory() throws Throwable {
		
		search.sendKeys(prop.getProperty("editcategoryName"));
		search.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		delete.click();
		Thread.sleep(2000);
		alert.click();
		
		
		
		
	}
	public void common() {
		// TODO Auto-generated method stub
		
	}


		
	}
	


