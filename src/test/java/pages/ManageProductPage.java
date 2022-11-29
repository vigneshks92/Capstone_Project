package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.BaseClass;

public class ManageProductPage {
	
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
	
	@FindBy(id = "manageProduct")
	WebElement ManageProducts;
	
	@FindBy(id = "name")
	WebElement ProductName;
	
	@FindBy(id = "brand")
	WebElement BrandName;
	
	@FindBy(id = "description")
	WebElement Description;
	
	@FindBy(id = "unitPrice")
	WebElement UnitPrice;
	
	@FindBy(id = "quantity")
	WebElement Quantity;
	
	@FindBy(id = "file")
	WebElement Upload;
	
	@FindBy(id = "categoryId")
	WebElement Category;
	
	@FindBy(xpath = "//*[@name='submit']")
	WebElement SaveButton;
	
	
	public ManageProductPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	//=====================Functions===========================
	
public void ManageProductFunction() throws InterruptedException {
		
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
		
	ManageProducts.click();
	test.log(LogStatus.PASS, "Click on ManageProducts Link", "ManageProducts link clicked successfully");
	
	Thread.sleep(2000);
	
	ProductName.sendKeys("Test Tablet");
	test.log(LogStatus.PASS, "Enter Product Name", "Prodcut Name entered successfully");
	
	Thread.sleep(2000);
	
	BrandName.sendKeys("Test Brand");
	test.log(LogStatus.PASS, "Enter Brand Name", "Brand Name entered successfully");
	
	Thread.sleep(2000);
	
	Description.sendKeys("Test Description");
	test.log(LogStatus.PASS, "Enter Description", "Description entered successfully");
	
	Thread.sleep(2000);
	
	UnitPrice.clear();
	UnitPrice.sendKeys("10.0");
	test.log(LogStatus.PASS, "Enter Unit Price", "Unit Price entered successfully");
	
	Thread.sleep(2000);
	
	Quantity.clear();
	Quantity.sendKeys("5");
	test.log(LogStatus.PASS, "Enter Quantity", "Quantity entered successfully");
	
	WebElement chooseFile = Upload;
	chooseFile.sendKeys("D:\\Vignesh\\Horizon Project\\Class\\Final Project\\Test Tablet.jpg");
	
	Select CategoryType = new Select(Category);
	CategoryType.selectByValue("2");
	test.log(LogStatus.PASS, "Choose Category", "Category chosen successfully");
	
	Category.click();
	
	Thread.sleep(2000);
	
	String TabletName = ProductName.getText();
	
	SaveButton.click();
	test.log(LogStatus.PASS, "Click on Save Button", "Save Button clicked successfully");
	
	Thread.sleep(2000);
	
}

}