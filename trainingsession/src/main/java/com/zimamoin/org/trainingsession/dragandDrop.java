package com.zimamoin.org.trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDrop {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
			driver =new ChromeDriver();
			
			
		driver.get("https://www.https://jqueryui.com");
			
			driver.manage().window().maximize();
			Thread.sleep(6000);
			
Thread.sleep(6000);
			
			WebElement dropable= driver .findElement(By.linkText("Droppable"));
			dropable.click();
			driver.switchTo().frame(0);
			
			WebElement dragable=driver.findElement(By.id("dragable"));
			WebElement dropabletoobject=driver.findElement(By.id("droppable"));
			
			Actions ob =new Actions(driver);
			ob.dragAndDrop(dropable, dropabletoobject).build().perform();
			Thread.sleep(6000);
			driver.switchTo().parentFrame();
			WebElement Resizable=driver.findElement(By.linkText("Resizable"));
			Resizable.click();
			
		
			
		
		
		
		
	}

}
