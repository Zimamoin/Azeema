package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	WebDriver driver;

	//add all the locators according to use for that pages,create method for each locator according to action
	@FindBy(name = "email") WebElement emailfields;
	@FindBy(name = "pass") WebElement psswrdfields;
	@FindBy(linkText="Forgot password?") WebElement Forgot;
     @FindBy(linkText="Create new account")WebElement CreatNewAccount;
	//This is for github chicken
     
     
	public home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	///Separate method for each application
	
	public void emailfieldsfill() {
		emailfields.sendKeys("zimamoin@gmail.com");
	}	

public void passwedfieldfill() {
	psswrdfields.sendKeys("kj");
}
public void ForgotPsswordClick() {
	Forgot.click();
	
}

public void CreateAnAccount() {
	CreatNewAccount.click();
	
}

public void forgotpasswordFields() {
	Forgot.click();

}

}
