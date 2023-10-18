package com.pageobjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class loginpadefunctionality extends Basetest {

   @FindBy (xpath="//input[@placeholder='example@gmail.com']")   
   WebElement userid;
	
   @FindBy (name="pword")
   WebElement pass;
  
   
   @FindBy (xpath="//button[text()='Login']")
   WebElement loginbutton;
   
   public loginpadefunctionality() {           //constructor
	   
	   PageFactory.initElements(driver,this);
   }
   
   
   public void verifylogin() {
	   
	  userid.sendKeys(prop.getProperty("username")); 
	   pass.sendKeys(prop.getProperty("password"));
	   loginbutton.click();
   }
   
	
}



