# Automationbatch2022
package testcaserunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGdemo {

	@Test(enabled = false)
	public void TC01() {
		System.out.println("test01 is executed");
	}

	@Test(priority = 1)
	public void TC02() {
		System.out.println("test02 is executed");
	}

	@Test(priority = 2)
	public void TC03() {
		System.out.println("test03 is executed");
	}

	@BeforeMethod
	public void Login() {
		System.out.println("log in Application");
	}

	@AfterMethod
	public void logout() {
		System.out.println("log out application");
	}

	@BeforeClass
	public void lanchbrowser() {
		System.out.println("Open The brower");
	}

	@AfterClass
	public void closebrowser() {
		System.out.println("brower is closed");
	}

}
