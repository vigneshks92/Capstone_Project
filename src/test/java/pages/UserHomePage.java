package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class UserHomePage {
	
	WebDriver driver = BaseClass.driver;
	
	ExtentTest test = BaseClass.test;
	
	//=====================WebElements==========================
	
	@FindBy(id = "a_Antipyretics")
	WebElement Antipyretics;
	
	@FindBy(id = "a_Analgesics")
	WebElement Analgesics;
	
	@FindBy(id = "a_Antibiotics")
	WebElement Antibiotics;
	
	@FindBy(id = "listProducts")
	WebElement ViewProducts;
	
	@FindBy(id = "dropdownMenu1")
	WebElement ProfileMenu;
	
	@FindBy(id = "cart")
	WebElement Cart;
	
	@FindBy(id = "logout")
	WebElement Logout;
	
	public UserHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//=====================Functions===========================
	
public void UserHomeFunction() throws InterruptedException {
		
	Antipyretics.click();
	test.log(LogStatus.PASS, "Click on Antipyretics Link", "Antipyretics link clicked successfully");
	
	Thread.sleep(2000);
	
	Analgesics.click();
	test.log(LogStatus.PASS, "Click on Analgesics Link", "Analgesics link clicked successfully");
	
	Thread.sleep(2000);
	
	Antibiotics.click();
	test.log(LogStatus.PASS, "Click on Antibiotics Link", "Antibiotics link clicked successfully");
	
	Thread.sleep(2000);
		
	ViewProducts.click();
	test.log(LogStatus.PASS, "Click on ViewProducts Link", "ViewProducts link clicked successfully");
	
	Thread.sleep(2000);
	
	ProfileMenu.click();
	test.log(LogStatus.PASS, "Click on ProfileMenu", "ProfileMenu clicked successfully");
	
	Thread.sleep(2000);
	
	Cart.click();
	test.log(LogStatus.PASS, "Click on Cart", "Cart clicked successfully");
	
}

}