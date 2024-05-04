package com.zimamoin.org.trainingsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	private static final WebElement Dateofbirth = null;
	static WebDriver driver;
	private static WebElement Monthofbirth;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		 WebElement Newacount = driver.findElement(By.linkText("Create new account"));
		 Thread.sleep(6000);
	
		 Newacount.click();
		Thread.sleep(6000);
		WebElement Createaccount = driver.findElement(By.name (" birthday_month"));
		Select ob =new Select  (Monthofbirth);
		ob.selectByValue("5");
		WebElement Createaccount1=driver.findElement(By.name("birthday_day;"));
		Select ob1 =new Select(Dateofbirth);
		ob.selectByValue("4");
		
		WebElement firstname=driver.findElement(By.xpath //input[@name='first'])
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static By Element(By linkText) {
		// TODO Auto-generated method stub
		return null;
	}

}
