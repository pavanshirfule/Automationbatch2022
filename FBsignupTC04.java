package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	//Declartion
	@FindBy(xpath="//input[@id='email']")private WebElement uid;
	
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	
	@FindBy(xpath="//button[@name='login']")private WebElement lnbtn;
	
	
	//initiallization
	
	public LoginPom(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	//usage using different method
	public void userid(String usename) {
		uid.sendKeys(usename);
	}
	public void password(String passwrd) {
		pass.sendKeys(passwrd);
	}
	public void clickloginbt() {
		lnbtn.click();
	}
	
	
}
	