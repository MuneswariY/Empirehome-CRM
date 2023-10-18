package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Holidayfunctionality  extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;
	@FindBy(xpath = "//span[normalize-space()='Masters']")
	WebElement clickmasters;
	@FindBy(xpath = "//a[normalize-space()='Holidays']")
   WebElement clickholidays;
	@FindBy(xpath = "//a[normalize-space()='Add New']")
	WebElement clickAddnew;
	@FindBy(xpath = "//input[@name='HilidayDate']")
	WebElement HolidayDate;
	@FindBy(xpath = "//input[@id='HolidayName']")
	WebElement HolidayName;
	@FindBy(xpath = "//input[@id='HolidayDesc']")
	WebElement HolidayDesc;
	@FindBy(xpath = "//button[normalize-space()='save']" )
	WebElement clicksave;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[1]/button[1]")
	WebElement clickeditbutton;
	@FindBy(xpath = "//tbody/tr[1]/td[5]/a[2]/button[1]")
	WebElement clickDelatebutton;
	@FindBy(xpath = "//button[@class='swal-button swal-button--yes']")
	WebElement clickyesbutton;
	
	public Holidayfunctionality() {
		PageFactory.initElements(driver, this);
		
	}
	public void Holidaysverify(String TextHolidayDate, String TextHolidayName ,String TextHolidayDesc, String REHolidayDate,String REHolidayName,String REHolidayDesc) throws Throwable{
		Thread.sleep(2000);
		clickkeypad.click();
		Thread.sleep(2000);
		clickmasters.click();
		Thread.sleep(2000);
		clickholidays.click();
		Thread.sleep(2000);
		clickAddnew.click();
		Thread.sleep(2000);
		HolidayDate.clear();
		HolidayDate.sendKeys(TextHolidayDate);
		Thread.sleep(2000); 
		HolidayName.clear();
		HolidayName.sendKeys(TextHolidayName);
		Thread.sleep(2000);
		HolidayDesc.clear();
		HolidayDesc.sendKeys(TextHolidayDesc);
		Thread.sleep(2000);
		 clicksave.click();
		Thread.sleep(2000);
		 clickeditbutton.click();
		Thread.sleep(2000); 
	    HolidayDate.clear();
	    HolidayDate.sendKeys(REHolidayDate);
	    Thread.sleep(2000);
	    HolidayName.clear();
	    HolidayName.sendKeys(REHolidayName);
	    Thread.sleep(2000);
	    HolidayDesc.clear();
	    HolidayDesc.sendKeys(REHolidayDesc);
	    Thread.sleep(2000);
	    clicksave.click();
	    Thread.sleep(2000);
	    clickDelatebutton.click();
		Thread.sleep(2000);
		clickyesbutton.click();
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
