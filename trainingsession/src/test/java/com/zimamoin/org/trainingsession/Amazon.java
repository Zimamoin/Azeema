package com.zimamoin.org.trainingsession;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Common.Utility;
import pages.forgot;
import pages.home;

public class Amazon extends Utility {
	
  @Test(priority=1)
 
  public void f() throws InterruptedException, IOException{
		home ob=new home(driver);
		ob.emailfieldsfill();
		ob.passwedfieldfill();
		shots();
		ob.forgotpasswordFields();
		forgot fb=new forgot(driver);
		fb.ForgotpasswordFields();
		shots();
		fb.SearchButton();
		Thread.sleep(6000);
		String forgotlinktexts=fb.Google();
		System.out.println(forgotlinktexts);
		SoftAssert assertion=new SoftAssert();
		//Assert.assertEquals(forgotlinktexts,"Use your Google accounts"); 
		assertion.assertEquals(forgotlinktexts,"using your Google account");
		System.out.println("This is after assertion");
		assertion.assertAll();
  }
  	  		 

@Test(priority= 2)

public void CreateAccount() {
home ob=  new  home(driver);
ob.CreateAnAccount();
}  

  
  
  
  
}
