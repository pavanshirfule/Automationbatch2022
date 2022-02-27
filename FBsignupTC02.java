package testcaserunner;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import com.vel.config.Configuration;

import pom.SignupPom;
import utility.Utility;

public class SignupTC02 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver = Configuration.initdriver();
		driver.manage().window().maximize();

		SignupPom signup = new SignupPom(driver);
		Utility util = new Utility();

		// TC01
		driver.get(Configuration.appURL);
		signup.enterfirstname(util.readExelSheet(1, 0));
		signup.enterlastname(util.readExelSheet(1, 1));

	}
}
