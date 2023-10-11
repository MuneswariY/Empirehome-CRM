package com.pageobjects;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;

public class logintestwithmultipledata  extends Basetest{
	private logintestwithmultipledata LF;
	public logintestwithmultipledata() {
		super();
	}
	@BeforeMethod
        public void setup() {
		initialization ();
		LF = new logintestwithmultipledata();
		
	}
      private void initialization() {
		// TODO Auto-generated method stub
		
	}
	@Test
      public void loginvalidation() {
    	  
		
	}
}
