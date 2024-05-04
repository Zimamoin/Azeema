package com.zimamoin.org.trainingsession;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Emplicitwaitimplicit {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
			driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			//// implicit wait
		WebElement  CreateAnaccount=driver.findElement(By.linkText("Create new account"));
		CreateAnaccount.click();
		
		///driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		///Thread.sleep(10000);
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		Wait .until(ExpectedConditions.presenceOfElementLocated (By.name("lastname")));
		WebElement Lastname=driver.findElement(By.name("lastname"));
		Lastname.sendKeys("Gul");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
