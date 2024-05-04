package com.zimamoin.org.trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsers {
	
  static WebDriver driver;
 
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	  System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
	driver =new ChromeDriver();
	//driver.navigate().to("https://www.google.com");
	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	Thread.sleep(6000);
	driver.navigate().back();
	Thread.sleep(6000);
	driver.navigate().forward();
	Thread.sleep(6000);
	driver.close();
	
	String titile=driver.getTitle();
	String CurrentURL=driver.getCurrentUrl();
	String Session =driver.getWindowHandle();
	System.out.println(titile);
	System.out.println(CurrentURL);
	System.out.println(Session);
	driver.close();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
