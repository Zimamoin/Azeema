package com.zimamoin.org.trainingsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionofAmazon {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
		driver =new ChromeDriver();
	
		
		driver.get("https://www.lexus.com");
		driver.manage().window().maximize();	
		Thread.sleep(6000);
		WebElement shoplink=driver.findElement(By.xpathnull)
				Action ob =new Actions(driver);
		ob.moveToElement(shoplink).build().perform();
		Thread.sleep(6000);
		WebElement search =driver.findElement();
		
		
		
		
		
		
	}

}
