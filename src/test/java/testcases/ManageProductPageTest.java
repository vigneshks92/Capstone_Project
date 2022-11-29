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
import pages.ManageProductPage;
import pages.UserHomePage;


public class ManageProductPageTest extends BaseClass {
	
	
	@Test
	public void ManageProductTest() throws InterruptedException {
			
			String UserNameVal = sheet.getRow(3).getCell(0).getStringCellValue();
			String PasswordVal = sheet.getRow(3).getCell(1).getStringCellValue();
			
			LoginPage login = new LoginPage();
			login.LoginFunction(UserNameVal,PasswordVal);
			
			Thread.sleep(2000);
			
			ManageProductPage product = new ManageProductPage();
			product.ManageProductFunction();
		}
	



}