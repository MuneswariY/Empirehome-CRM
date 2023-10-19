package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;
import com.utils.Utils;

public class Employeeregistration  extends Basetest{
	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement clickkeypad;
	@FindBy(xpath = "//span[normalize-space()='Staff']")
	WebElement clickstaff;
	@FindBy(xpath = "//a[normalize-space()='Add New Staff']")
	WebElement Addnewstaff;
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement Name;
	@FindBy(xpath = "//input[@placeholder='Enter Your Mail']")
	WebElement mailid;
	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	WebElement Number;
	@FindBy(xpath = "//span[@id='select2-UserTypeId-container']")
	WebElement designation;
	@FindBy(xpath = "//input[@role=textbox']")
	WebElement textbox;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement savebutton;
	private String Employeename;
	private String Emailid;
	
	public Employeeregistration() {
		PageFactory.initElements(driver, this);
	}
	public void verifyemployee(String ENumber) throws InterruptedException {
		Thread.sleep(2000);
		clickkeypad.click();
		clickstaff.click();
		Thread.sleep(2000);
		Addnewstaff.click();
		Name.sendKeys(prop.getProperty("EmPloyeename"));
		Thread.sleep(2000);
		mailid.sendKeys(prop.getProperty("EMailid"));
		Thread.sleep(2000);
		Number.sendKeys(prop.getProperty("ENumber"));
		Thread.sleep(2000);
		Utils.actions(driver,designation);
		textbox.sendKeys(prop.getProperty("staffDesignationtextbox"));
		textbox.sendKeys(Keys.ENTER);
		savebutton.click();
		
	}
	public void verifyemployee() {
		
		
	}
	



}
