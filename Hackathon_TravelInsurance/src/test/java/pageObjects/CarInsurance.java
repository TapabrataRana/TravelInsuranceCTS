package pageObjects;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class CarInsurance extends BasePage
{
	JavascriptExecutor jse;
	
	public CarInsurance(WebDriver driver)
	{
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath="//span[text()='car? Click here']")
	WebElement carClickHere;
	
	@FindBy(xpath="//div[normalize-space()='Pune']")
	WebElement city;
	
	@FindBy(xpath="//span[text()='MH12']")
	WebElement rto;
	
	@FindBy(xpath="(//span[text()='Tata'])[1]")
	WebElement carBrand;
	
	@FindBy(xpath="//span[text()='NEXON']")
	WebElement carModel;
	
	@FindBy(xpath="//span[text()='Petrol']")
	WebElement carFuelType;
	
	@FindBy(xpath="//span[text()='Creative Plus 1.2 Revotron Petrol 6AMT']")
	WebElement carVariant;
	
	@FindBy(xpath="//input[@id='txtName']")
	WebElement fullName;
	
	@FindBy(xpath="//input[@id='txtEmail']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='mobNumber']")
	WebElement mobileNumber;
	
	@FindBy(xpath="//div[text()='View Prices ']")
	WebElement viewPrices;
	
	@FindBy(xpath="//div[text()='Please enter valid email address']")
	WebElement errorMessage;
	
	public void clickHere() throws InterruptedException
	{
		carClickHere.click();
		Thread.sleep(2000);
	}
	
	public void selectCity() throws InterruptedException
	{
		city.click();
		Thread.sleep(2000);
	}
	
	public void selectRTO() throws InterruptedException
	{
		rto.click();
		Thread.sleep(2000);
	}
	
	public void selectCarBrand() throws InterruptedException
	{
		jse.executeScript("arguments[0].click();", carBrand);
		Thread.sleep(2000);
	}
	
	public void selectCarModel() throws InterruptedException
	{
		carModel.click();
		Thread.sleep(2000);
	}

	public void selectCarFuelType() throws InterruptedException
	{
		carFuelType.click();
		Thread.sleep(2000);
	}
	
	public void selectCarVariant() throws InterruptedException
	{
		carVariant.click();
		Thread.sleep(2000);
	}
	
	public void enterFullName() throws InterruptedException, IOException
	{
		fullName.sendKeys(ExcelUtility.getcelldata("Sheet1", 1, 2));
		Thread.sleep(2000);
	}
	
	public void enterIncorrectEmail() throws IOException, InterruptedException
	{
		email.sendKeys(ExcelUtility.getcelldata("Sheet1", 1, 3));
		Thread.sleep(2000);
	}
	
	public void enterMobileNumber() throws IOException, InterruptedException
	{
		mobileNumber.sendKeys(ExcelUtility.getcelldata("Sheet1", 1, 4));
		Thread.sleep(2000);
	}
	public void clickViewPrices() throws InterruptedException
	{
		viewPrices.click();
		Thread.sleep(2000);
	}
	
	public void printErrorMessage() throws InterruptedException, IOException
	{
		System.out.println(errorMessage.getText());
		Thread.sleep(2000);
		ExcelUtility.setcelldata("Sheet1", errorMessage.getText(), 3, 0);
	}
	
	public void navigateBack() throws InterruptedException
	{
		driver.navigate().to("https://www.policybazaar.com/");
		Thread.sleep(2000);
	}
	
	
}
