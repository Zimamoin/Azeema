package com.zimamoin.org.trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emplicitwait {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
			driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			
		WebElement  CreateAnaccount=driver.findElement(By.linkText("Create new account"));
		CreateAnaccount.click();
		
		WebElementWait wait=new WebDriverWait
		
		
	}

}
