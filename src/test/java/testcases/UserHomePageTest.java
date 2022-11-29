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
import pages.UserHomePage;


public class UserHomePageTest extends BaseClass {
	
	
	@Test
	public void UserHomeTest() throws InterruptedException {
			
			String UserNameVal = sheet.getRow(1).getCell(0).getStringCellValue();
			String PasswordVal = sheet.getRow(1).getCell(1).getRawValue();
			
			LoginPage login = new LoginPage();
			login.LoginFunction(UserNameVal,PasswordVal);
			
			Thread.sleep(2000);
			
			UserHomePage home = new UserHomePage();
			home.UserHomeFunction();
		}
	



}