package com.pageobjects;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Basetest;
import com.github.dockerjava.core.dockerfile.DockerfileStatement.Add;
import com.graphbuilder.struc.Stack;

import io.netty.handler.codec.http.HttpHeaders.Names;

public class Stackmovefuntionality<Robot> extends Basetest {

	private static final WebElement ModelNumber = null;

	@FindBy(xpath = "//span[@class='pe-7s-keypad']")
	WebElement element;

	@FindBy(xpath = "//i[@class='fa fa-houzz']")
	WebElement inventory;

	@FindBy(xpath = "//a[normalize-space()='Move Stock']")
	WebElement movestock;

	@FindBy(xpath = "//select[@id='movedFromD']")
	WebElement movefrom;

	@FindBy(xpath = "//select[@id='movedToD']")
	WebElement moveto;

	@FindBy(xpath = "//input[@id='MoStNot']")
	WebElement notes;

	@FindBy(xpath = "//button[@id='btnSave']")
	WebElement savebutton;

	@FindBy(xpath = "//span[@id='select2-invId-container']")
	WebElement selectmnumber;
	
	@FindBy (xpath = "//input[@role='textbox']")
	WebElement textbox;

	@FindBy(xpath = "//input[@id='qtymoving']")
	WebElement movingqty;

	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement addbutton;

	private WebElement Save;

	public void MoveStockFunctionality() {
		PageFactory.initElements(driver, this);
	}

	public void verifymovingstock(WebElement Clickpad, WebElement Inventory, WebElement MoveStock, WebElement movedFromD, WebElement movedToD, WebElement reference, WebElement MovingQty, WebElement Textbox, Object Add) throws Throwable {
		Thread.sleep(2000);
		 Clickpad.click();
		 Thread.sleep(2000);
		 Inventory.click();
		 Thread.sleep(2000);
		 MoveStock.click();
		 Thread.sleep(2000);
		 Select Sc = new Select(movedFromD);
		 Sc.selectByIndex(0);
		 movedFromD.click();
		 Thread.sleep(2000);
		 
		 Select Sc1 = new Select(movedToD);
		 Sc1.selectByIndex(1);
		 movedToD.click();
		 Thread.sleep(2000);
		 reference.sendKeys(prop.getProperty("Reference"));
		 Thread.sleep(2000);
		 Robot R = new Robot();
		 ModelNumber.click();
		 Textbox.sendKeys(prop.getProperty("textbox"));
		 R.keyPress(KeyEvent.VK_ENTER);
		  R.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 MovingQty.sendKeys(prop.getProperty("QTY"));
		 Thread.sleep(2000);
		 ((WebElement) Add).click();
		 Thread.sleep(2000);
		 Save.click();
		 Thread.sleep(2000);
		 driver.navigate().to("http://empirehome.myprojectsonline.co.in/Inventory/MoveStock");
		 driver.navigate().back();
		 Select Sc3 = new Select(movedFromD);
		 Sc3.selectByIndex(1);
		 movedFromD.click();
		 Thread.sleep(2000);
		 
		 Select Sc4 = new Select(movedToD);
		 Sc4.selectByIndex(0);
		 movedToD.click();
		 reference.sendKeys(prop.getProperty("Notes"));
		 Thread.sleep(2000);
		 Robot R1 = new Robot();
		 ModelNumber.click();
		 Textbox.sendKeys(prop.getProperty("TEXTBOX1"));
		 R1.keyPress(KeyEvent.VK_ENTER);
		 R1.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 MovingQty.sendKeys(prop.getProperty("QTY1"));
		 Thread.sleep(2000);
		 ((WebElement) Add).click();
		 Thread.sleep(2000);
		 Save.click();
		 
	 }	
}
	
	

		