package com.zimamoin.org.trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
			driver =new ChromeDriver();
			
			
			driver.get("https://demo.guru99.com/");
			
			driver.manage().window().maximize();
			
			///accept
			WebElement submitbutton=driver.findElement(By.name("submit"));
			submitbutton.click();
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
			
			/////Dismiss
			
			WebElement submitbutton1=driver.findElement(By.name("submit"));
			submitbutton1.click();
			Thread.sleep(6000);
			driver.switchTo().alert().dismiss();
			driver.switchTo().alert().sendKeys("guru99");
			
			
			
			
		
		
		
		
		
		
		
		
		
		
	}

}
