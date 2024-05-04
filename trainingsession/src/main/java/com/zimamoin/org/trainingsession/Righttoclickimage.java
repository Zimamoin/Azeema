package com.zimamoin.org.trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Righttoclickimage {
	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
			driver =new ChromeDriver();
			//driver.navigate().to("https://www.google.com");
			
			driver.get("https://www.google.com");
			
			driver.manage().window().maximize();
			WebElement Rightimage=driver.findElement(By.xpath("//img [@style='cursor:pointer;']"));
		
		
		
		
	}

}
