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
	
public void LoginFunction(String UserNameVal, String PasswordVal) {
		
		
		LoginLink.click();
		test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
		
		UserName.sendKeys(UserNameVal);
		test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
		
		Password.sendKeys(PasswordVal);
		test.log(LogStatus.PASS, "Enter Password", "Password successfully");
		
		LoginButton.click();
		test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");
		
	}

public void LoginValidationFunction(String UserNameVal, String PasswordVal) {
	
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	UserName.sendKeys(UserNameVal);
	test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
	
	Password.sendKeys(PasswordVal);
	test.log(LogStatus.PASS, "Enter Password", "Password successfully");
	
	LoginButton.click();
	test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");
	
	String ActualValidationMessage = ValidationMessage.getText();
	test.log(LogStatus.PASS, "Get the Validation Message", "Validation Message captured successfully");
	
	String ExpectedValidationMessage = "Username and Password is invalid!";
	Assert.assertEquals(ExpectedValidationMessage, ActualValidationMessage);
	
}

public void LoginValidationFunction1(String UserNameVal, String PasswordVal) {
	
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	UserName.sendKeys(UserNameVal);
	test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
	
	LoginButton.click();
	test.log(LogStatus.PASS, "Click on LoginButton", "LoginButton clicked successfully");
	
	String ActualValidationMessage = ValidationMessage1.getText();
	test.log(LogStatus.PASS, "Get the Validation Message", "Validation Message captured successfully");
	
	String ExpectedValidationMessage = "Please enter your password!";
	Assert.assertEquals(ExpectedValidationMessage, ActualValidationMessage);
	
}

public void LoginValidationFunction2() {
	
	LoginLink.click();
	test.log(LogStatus.PASS, "Click on Login Link", "Login link clicked successfully");
	
	UserName.sendKeys("UserNameCheck");
	test.log(LogStatus.PASS, "Enter UserName", "UserName entered successfully");
	
	Password.click();
	test.log(LogStatus.PASS, "Enter Password", "Password successfully");
	
	String ActualValidationMessage = ValidationMessage2.getText();
	test.log(LogStatus.PASS, "Get the Validation Message", "Validation Message captured successfully");
	
	String ExpectedValidationMessage = "Please enter a valid email address!";
	Assert.assertEquals(ExpectedValidationMessage, ActualValidationMessage);
	
}

}