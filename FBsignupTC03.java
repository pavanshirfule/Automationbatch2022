package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignupPom {

	//Declaration
     @FindBy(xpath="//input[@name='firstname']") private WebElement ftname;
     
     @FindBy(xpath="//input[@name='lastname']") private WebElement ltname;
     
     @FindBy(xpath="//input[@name='reg_email__']") private WebElement email;
     
     @FindBy(xpath="//input[@name='reg_email_confirmation__']") private WebElement ReEmail;
     
     @FindBy(xpath="//input[@name='reg_passwd__']") private WebElement pass;
     
     @FindBy(xpath="//select[@name='birthday_day']") private WebElement DOBday; 
     
     @FindBy(xpath="//select[@name='birthday_month']") private WebElement DOBmonth;
     
     @FindBy(xpath="//select[@name='birthday_year']") private WebElement DOByear; 
        
     @FindBy(xpath="(//input[@name='sex'])[2]") private WebElement radio;
     
     //initialization
     public SignupPom(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     
     //usage
     public void enterfirstname(String name) {
    	 ftname.sendKeys(name);
     }
     public void enterlastname(String lname) {
    	 ltname.sendKeys(lname);
     }
     public void enterEmail(String emailid) {
    	 email.sendKeys(emailid);
     }
     public void Reenteremail(String reenter) {
    	 ReEmail.sendKeys(reenter);
     }
     public void enterPassword(String password) {
    	 pass.sendKeys(password);
     }
     public void enterday(String dayDOB) {
    	 Select day=new Select(DOBday);
    	 day.selectByVisibleText(dayDOB);
     }
     public void entermonth(String monthDOB) {
    	 Select month=new Select(DOBmonth);
    	 month.selectByVisibleText(monthDOB);
     }
     public void enteryear(String yearDOB) {
    	 Select year=new Select(DOByear);
    	 year.selectByVisibleText(yearDOB);
     }     
     public void gender() {
    	 radio.click(); 
     }
     
     
}
