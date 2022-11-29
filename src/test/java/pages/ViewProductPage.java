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

public class ViewProductPage {
	
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
	
	@FindBy(xpath = "//*[@class='odd']/td[6]/a/span")
	WebElement FirstViewOption;
	
	@FindBy(xpath = "//*[text()=' Add to Cart']")
	WebElement AddToCart;
	
	@FindBy(xpath = "//*[@data-th='Price']")
	WebElement Price;
	
	@FindBy(xpath = "//*[@data-th='Quantity']/input")
	WebElement Quantity;
	
	@FindBy(xpath = "//*[@name='refreshCart']/span")
	WebElement CartRefreshButton;
	
	@FindBy(xpath = "//*[@data-th='Subtotal']")
	WebElement SubTotal;
	
	@FindBy(xpath = "//*[@name='refreshCart']/following::span")
	WebElement CartDeleteButton;
	
	@FindBy(xpath = "//*[text()='Checkout ']")
	WebElement CheckoutButton;
	
	@FindBy(xpath = "//*[text()='Select']")
	WebElement SelectAddress;
	
	@FindBy(id = "cardNumber")
	WebElement CardNumber;
	
	@FindBy(id = "expityMonth")
	WebElement Month;
	
	@FindBy(id = "expityYear")
	WebElement Year;
	
	@FindBy(id = "cvCode")
	WebElement CVVCode;
	
	@FindBy(xpath = "//*[text()='Pay']")
	WebElement PayButton;
	
	public ViewProductPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//=====================Functions===========================
	
public void ViewProductFunction() throws InterruptedException {
		
//	Antipyretics.click();
//	test.log(LogStatus.PASS, "Click on Antipyretics Link", "Antipyretics link clicked successfully");
//	
//	Thread.sleep(2000);
//	
//	Analgesics.click();
//	test.log(LogStatus.PASS, "Click on Analgesics Link", "Analgesics link clicked successfully");
//	
//	Thread.sleep(2000);
//	
//	Antibiotics.click();
//	test.log(LogStatus.PASS, "Click on Antibiotics Link", "Antibiotics link clicked successfully");
//	
//	Thread.sleep(2000);
		
	ViewProducts.click();
	test.log(LogStatus.PASS, "Click on ViewProducts Link", "ViewProducts link clicked successfully");
	
	Thread.sleep(2000);
	
	FirstViewOption.click();
	test.log(LogStatus.PASS, "Click on View Button", "View Button clicked successfully");
	
	Thread.sleep(2000);
	
	AddToCart.click();
	test.log(LogStatus.PASS, "Click on AddToCart Button", "AddToCart Button clicked successfully");
	
	Thread.sleep(2000);
	
	String PriceText = Price.getText();
	test.log(LogStatus.PASS, "Get Single Quantity Price", "Got the Single Quantity Price successfully");
	
	Thread.sleep(2000);
	
	Quantity.clear();
	Quantity.sendKeys("2");
	test.log(LogStatus.PASS, "Enter Quantity", "Quantity entered successfully");
	
	Thread.sleep(2000);
	
	CartRefreshButton.click();
	test.log(LogStatus.PASS, "Click on CartRefresh Button", "CartRefresh Button clicked successfully");
	
	Thread.sleep(2000);
	
	String SubTotalText = SubTotal.getText();
	test.log(LogStatus.PASS, "Get Single Quantity Price", "Got the Single Quantity Price successfully");
	
	CheckoutButton.click();
	test.log(LogStatus.PASS, "Click on Checkout Button", "Checkout Button clicked successfully");
	
	Thread.sleep(2000);
	
	SelectAddress.click();
	test.log(LogStatus.PASS, "Select the Address", "Address selected successfully");
	
	Thread.sleep(2000);
	
	CardNumber.sendKeys("1111111111111111");
	test.log(LogStatus.PASS, "Enter Card Number", "Card Number entered successfully");
	
	Thread.sleep(2000);
	
	Month.sendKeys("10");
	test.log(LogStatus.PASS, "Enter Expiry Month", "Expiry Month entered successfully");
	
	Thread.sleep(2000);
	
	Year.sendKeys("2022");
	test.log(LogStatus.PASS, "Enter Expiry Year", "Expiry Year entered successfully");
	
	Thread.sleep(2000);
	
	CVVCode.sendKeys("101");
	test.log(LogStatus.PASS, "Enter CVVCode", "CVVCode entered successfully");
	
	Thread.sleep(2000);
	
	PayButton.click();
	test.log(LogStatus.PASS, "Click on the Pay Button", "Pay Button clicked successfully");
	
	Thread.sleep(2000);
	
}

}