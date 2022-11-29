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
	public void LoginSuccessTest() {
			
			String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
			String PasswordVal = sheet.getRow(1).getCell(1).getRawValue();
			
			LoginPage login = new LoginPage();
			login.LoginFunction(UserNameVal,PasswordVal);		
		}
	
	@Test
	public void LoginValidationTest() {
		
		String UserNameVal = sheet.getRow(2).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(2).getCell(1).getRawValue();
		
		LoginPage login = new LoginPage();
		login.LoginValidationFunction(UserNameVal, PasswordVal);
	}
	
	@Test
	public void LoginValidationTest1() {
		
		String UserNameVal = sheet.getRow(2).getCell(0).getStringCellValue();
		String PasswordVal = sheet.getRow(2).getCell(1).getRawValue();
		
		LoginPage login = new LoginPage();
		login.LoginValidationFunction1(UserNameVal, PasswordVal);
	}
	
	@Test
	public void LoginValidationTest2() {
		
		LoginPage login = new LoginPage();
		login.LoginValidationFunction2();
	}


}