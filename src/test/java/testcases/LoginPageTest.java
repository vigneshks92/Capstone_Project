package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginPageTest extends BaseClass {
	
	
	@Test
	public void LoginSuccessTest() throws InterruptedException {
			
			LoginPage login = new LoginPage();
			login.LoginFunction();	
		}
	
	@Test
	public void LoginValidationTest() throws InterruptedException {
		
		LoginPage login = new LoginPage();
		login.LoginValidationFunction();
	}
	
	@Test
	public void LoginValidationTest1() throws InterruptedException {
		
		LoginPage login = new LoginPage();
		login.LoginValidationFunction1();
	}
	
	@Test
	public void LoginValidationTest2() throws InterruptedException {
		
		LoginPage login = new LoginPage();
		login.LoginValidationFunction2();
	}


}