package com.zimamoin.org.trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {
	static WebDriver driver;
	private static WebElement Forgotlk;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
			driver =new ChromeDriver();
			//driver.navigate().to("https://www.google.com");
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement EmailField=driver.findElement(By.id("email"));
			EmailField.sendKeys("zimamoin.com");
			Thread.sleep(6000);
			WebElement PasswordField=driver.findElement(By.name("Pass"));
			PasswordField.sendKeys("azeema");
			Thread.sleep(6000);
			WebElement Forgotik=driver.findElement(By.linkText("forgot password"));
			Forgotlk.click();
			
			
			
			
			
			
			
		
		
		
		

	}

}
