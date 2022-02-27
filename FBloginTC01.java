package testcaserunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.vel.config.Configuration;
import pom.LoginPom;

public class LoginTC01 {
	public static void main(String[] args) throws InterruptedException {
		// Setup1.initdriver();
		System.setProperty("webdriver.chrome.driver", Configuration.driverpath);

		WebDriver driver = new ChromeDriver();

		driver.get(Configuration.appURL);
		driver.manage().window().maximize();

		// TC01
		LoginPom login = new LoginPom(driver);

		login.userid("tony");

		login.password("214252626");

		login.clickloginbt();
		Thread.sleep(3000);

	}
}
