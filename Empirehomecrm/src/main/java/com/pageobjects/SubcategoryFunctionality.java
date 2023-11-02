package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class SubcategoryFunctionality  extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement keypad;
	@FindBy(xpath = "//span[normalize-space()='masters']")
      WebElement masters;
	@FindBy(xpath = "//a[normalize-space()='sub categories")
	WebElement subcategory;
	@FindBy(xpath = "//a[normalize-space()='Add New Sub Category']")
	WebElement addnewcategory;
	@FindBy(xpath = "//span[@id='select2-subcatDD-container']")
	WebElement selectcategory;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	WebElement search;
	@FindBy(xpath = "//tr[@class='even']//i[@class='fa fa-pencil']")
	WebElement edit;
	@FindBy(xpath = "//tr[@class='even']//i[@class='fa fa-trash-o']")
	WebElement delete;
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement yes;
	
	public SubcategoryFunctionality() {
		PageFactory.initElements(driver,this);
	}
	public void verifyaddnewcategory() throws Throwable {
		Thread.sleep(2000);
		keypad.click();
		masters.click();
		subcategory.click();
		Thread.sleep(2000);
		addnewcategory.click();
		
	 Utils.dropdowns(selectcategory,"Bedroom");
	 subcategory.sendKeys(prop.getProperty("subcategory"));
	 Thread.sleep(2000);
	 savebutton.click();
	}
	public void verifyeditsubcategory() throws Throwable {
		Thread.sleep(2000);
		search.sendKeys(prop.getProperty("subcategoryname"));
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		edit.click();
		Thread.sleep(2000);
		Utils.dropdowns(selectcategory, "Bedroom");
		Thread.sleep(2000);
		selectcategory.clear();
		Thread.sleep(2000);
		subcategory.sendKeys(prop.getProperty("Editsubcategoryname"));
		Thread.sleep(2000);
		savebutton.click();
		
	}
	public void verifydeletesubcategory() throws Throwable {
		Thread.sleep(2000);
		search.sendKeys(prop.getProperty("Editsubcategoryname"));
		search.sendKeys(Keys.ENTER);
		delete.click();
		yes.click();
	}
	
}
