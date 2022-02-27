package testcaserunner;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import pom.SignupPom;
import utility.Utility1;

public class SignupTC {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		Utility1 util = new Utility1();

		WebDriver driver = util.intdriver();

		SignupPom signup = new SignupPom(driver);

		// TC01
		signup.enterfirstname(util.readexelsheet(1,1));
		Thread.sleep(1000);
		signup.enterlastname(util.readexelsheet(1,2));
		Thread.sleep(1000);
		signup.enterEmail(util.readexelsheet(1,3));
		Thread.sleep(1000);
		signup.enterPassword(util.readexelsheet(1,4));
		Thread.sleep(2000);
		signup.enterday(util.readexelsheet(1,5));
		Thread.sleep(1000);
		signup.entermonth(util.readexelsheet(1,6));
		Thread.sleep(1000);
		signup.enteryear(util.readexelsheet(1,7));
		Thread.sleep(1000);
		signup.gender();
		

	}
}
