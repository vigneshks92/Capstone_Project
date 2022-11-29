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

public class LoginPage {
	
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
	
	@FindBy(xpath = "//*[@class='content']/div/div/div/div")
	WebElement ValidationMessage;
	
	@FindBy(id = "password-error")
	WebElement ValidationMessage1;
	
	@FindBy(id = "username-error")
	WebElement ValidationMessage2;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//=====================Functions===========================
	
public void LoginFunction() throws InterruptedException {
		
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
		
		Thread.sleep(2000);
		
		UserName.sendKeys("kn@gmail.com");
		test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
		
		Thread.sleep(2000);
		
		Password.sendKeys("12345");
		test.log(LogStatus.PASS, "Enter Password", "Password successfully");
		
		Thread.sleep(2000);
		
		LoginButton.click();
		test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");
		
		Thread.sleep(2000);
		
	}

public void LoginValidationFunction() throws InterruptedException {
	
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	Thread.sleep(2000);
	
	UserName.sendKeys("kn@gmail.com");
	test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
	
	Thread.sleep(2000);
	
	Password.sendKeys("1234");
	test.log(LogStatus.PASS, "Enter Password", "Password successfully");
	
	Thread.sleep(2000);
	
	LoginButton.click();
	test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");
	
	Thread.sleep(2000);
	
	String ActualValidationMessage = ValidationMessage.getText();
	test.log(LogStatus.PASS, "Get the Validation Message", "Validation Message captured successfully");
	
	String ExpectedValidationMessage = "Username and Password is invalid!";
	Assert.assertEquals(ExpectedValidationMessage, ActualValidationMessage);
	
}

public void LoginValidationFunction1() throws InterruptedException {
	
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	Thread.sleep(2000);
	
	UserName.sendKeys("kn@gmail.com");
	test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
	
	Thread.sleep(2000);
	
	LoginButton.click();
	test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");
	
	Thread.sleep(2000);
	
	String ActualValidationMessage = ValidationMessage1.getText();
	test.log(LogStatus.PASS, "Get the Validation Message", "Validation Message captured successfully");
	
	String ExpectedValidationMessage = "Please enter your password!";
	Assert.assertEquals(ExpectedValidationMessage, ActualValidationMessage);
	
}

public void LoginValidationFunction2() throws InterruptedException {
	
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	Thread.sleep(2000);
	
	UserName.sendKeys("UserNameCheck");
	test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
	
	Thread.sleep(2000);
	
	Password.click();
	test.log(LogStatus.PASS, "Enter Password", "Password successfully");
	
	Thread.sleep(2000);
	
	String ActualValidationMessage = ValidationMessage2.getText();
	test.log(LogStatus.PASS, "Get the Validation Message", "Validation Message captured successfully");
	
	String ExpectedValidationMessage = "Please enter a valid email address!";
	Assert.assertEquals(ExpectedValidationMessage, ActualValidationMessage);
	
}

}