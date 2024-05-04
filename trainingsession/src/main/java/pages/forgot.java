package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Verify;

public class forgot {
		
	
		WebDriver driver;
		@FindBy(xpath= "//*a[contains(text(),'Forgot password?')]") WebElement Forgotfieldsenter;
		@FindBy(name="did_submit")WebElement Searchbutton;
		@FindBy(xpath="(//*[text()='Use your Google account'])[2]") WebElement Verifies;
		public  forgot(WebDriver driver) {		
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}		
		
	public void ForgotpasswordFields(){
		Forgotfieldsenter.sendKeys("zimamoin@gmail.com");
		
		
	}
	public void SearchButton()	{
		Searchbutton.click();
	}
		
	public String Google() {
		String Forgotelemttexts=Verifies.getText();
		return Forgotelemttexts;
	}

}
