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

public class AdminHomePage {
	
	WebDriver driver = BaseClass.driver;
	
	ExtentTest test = BaseClass.test;
	
	//=====================WebElements==========================
	
	@FindBy(id = "login")
	WebElement LoginLink;
	
	@FindBy(id = "username")
	WebElement UserName;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(xpath = "//*[@value='Login']")
	WebElement LoginButton;
	
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
	
	@FindBy(id = "logout")
	WebElement Logout;
	
	public AdminHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//=====================Functions===========================
	
public void AdminHomeFunction() throws InterruptedException {
	
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	Thread.sleep(2000);
	
	UserName.sendKeys("vk@gmail.com");
	test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
	
	Thread.sleep(2000);
	
	Password.sendKeys("admin");
	test.log(LogStatus.PASS, "Enter Password", "Password successfully");
	
	Thread.sleep(2000);
	
	LoginButton.click();
	test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");
	
	Thread.sleep(2000);
		
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
	
	Logout.click();
	test.log(LogStatus.PASS, "Click on Logout Button", "Logout Button clicked successfully");
	
}

}