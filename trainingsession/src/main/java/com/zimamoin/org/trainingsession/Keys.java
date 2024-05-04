package com.zimamoin.org.trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keys {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
				// TODO Auto-generated method stub

			  System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
			driver =new ChromeDriver();
			
			
			driver.get("https://www.facebook.com");
			
			driver.manage().window().maximize();
			WebElement Names =driver.findElement(By.name("email"));
			Names.sendKeys("zimamoin@gmail.com");
			Actions ob =new Actions(driver);
			ob.keyDown(org.openqa.Selenium.keys.CONTROL).sendKeys("a").build().perform();
			ob.k
			
		
		
	}

}
