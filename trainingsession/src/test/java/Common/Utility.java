package Common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Utility {

		public WebDriver driver;
		
		@BeforeMethod
		@Parameters({"browser","url"})
		public void Ibrowers(String browser, String url) {
			if(browser.equalsIgnoreCase("chrome")) {
				
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\chromedriver.exe");	
						driver =new ChromeDriver();
			}
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\Drivers\\msedgedriver.exe");
				  driver=new EdgeDriver();
			}else {
				System.out.println("Namae of browser didnt exist");
			}
			driver.get(url);
			
			driver.manage().window().maximize();
			WebElement cookie=driver.findElement(By.xpath("//button[contains(text(),'Decline optional cookie')]"));
			cookie.click();
		}
		  
		  
		  @AfterMethod
		  public void afterMethod() throws InterruptedException  {
			  
				  Thread.sleep(6000);
			  }
			 public void shots() throws IOException {
				 Date sessio=new Date();
				 System.out.println(sessio);
				String kj= sessio.toString().replace("","_").replace("","_");
				System.out.println(kj);
				File output=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
				FileHandler.copy(output, new File("C:\\Users\\zimam\\eclipse-workspace\\trainingsession\\pictures\\"+kj+"pictures.png"));	  	

	}
		
}
