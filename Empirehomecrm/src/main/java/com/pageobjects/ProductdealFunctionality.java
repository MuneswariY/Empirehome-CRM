package com.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class ProductdealFunctionality  extends Basetest{
       @FindBy(xpath = "//strong[normalize-space()='Select Customer']")
       WebElement selectcustomer;
       @FindBy(xpath = "//a[@class='btn common-btn mt-3']")
       WebElement register;
       @FindBy(xpath = "//input[@placeholder='Full Name']")
       WebElement fullname;
       @FindBy(xpath = "//input[@placeholder='Mobile Number']")
       WebElement mobilenumber;
       @FindBy(xpath = "//input[@placeholder='Email']")
       WebElement Email;
       @FindBy(xpath = "//input[@placeholder='Whatsapp Number']")
       WebElement whatsappnumber;
       @FindBy(xpath = "//button[normalize-space()='Save']")
       WebElement savebutton;
       @FindBy(xpath = "//input[@placeholder='Search Name or Number or Mail']")
       WebElement searchbox;
       @FindBy(xpath = "class=\"col-md-12 table-bordered table-striped table-condensed cf\"")
       WebElement select;
       @FindBy(xpath = "")
       WebElement ;
       @FindBy(xpath ="")
       WebElement ;
       
       
       public ProductdealFunctionality() {
    	   PageFactory.initElements(driver, this);
       }   
       
       public void setup() {
    	   selectcustomer.click();
    	   register.click();
    	   fullname.sendKeys(prop.getProperty("fullname"));
    	   mobilenumber.sendKeys("mobilenumber");
    	   Email.sendKeys("email");
    	   whatsappnumber.sendKeys("whatsappnumber");
    	   savebutton.click();
    	   searchbox.sendKeys(prop.getProperty("searchbox"));
    	   searchbox.sendKeys(Keys.ENTER);
    	   select.click();
       }
}
