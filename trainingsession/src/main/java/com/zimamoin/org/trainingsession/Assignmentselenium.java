package com.zimamoin.org.trainingsession;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmentselenium {

	static  WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
		driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		 WebElement CreatebuttonClick = driver.findElement(By.linkText("Create new account"));
		 Thread.sleep(6000);
		CreatebuttonClick.click();
		Thread.sleep(6000);
		
		driver.manage().window().maximize();
		WebElement Firstname =driver.findElement(By.name("firstname"));
		Firstname.sendKeys("azeema");
		
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		lastname.sendKeys("Gul");
		
		WebElement Mobile=driver.findElement(By.name("reg_email_"));
		Mobile.sendKeys("zimamoin@gmail.com");
		
		
		WebElement monthofbirth = driver.findElement(By.name (" birthday_ month"));
		Select ob =new Select(monthofbirth);
		ob.selectByValue("5");
		
		WebElement dayofbirth=driver.findElement(By.name("birthday_day;"));
		Select ob1 =new Select(dayofbirth);
		ob.selectByValue("4");
		
		WebElement yearofbirth=driver.findElement(By.name("birthday_year;"));
		  Select ob11 =new Select(yearofbirth);
		  ob.selectByValue("1980");
		  WebElement malefield=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/label/)[-1]"));
		malefield.click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
