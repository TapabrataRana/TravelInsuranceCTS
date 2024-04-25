package pageObjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.ExcelUtility;

public class TravelInsurance extends BasePage
{
	JavascriptExecutor jse; 
	public TravelInsurance(WebDriver driver)
	{
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath="//input[@id='country']")
	WebElement searchBox;
	
	@FindBy(xpath="//li[text()='Germany']")
	WebElement selectCountryName;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement destinationNextButton;
	
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[1]")
	WebElement startDate;
	
	@FindBy(xpath="(//input[@class='MuiInputBase-input MuiOutlinedInput-input'])[2]")
	WebElement endDate;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement tripDateNextButton;
	
	@FindBy(xpath="//label[text()='2']")
	WebElement noOfPeople;
	
	@FindBy(xpath="//div[contains(text(),'Select age of traveller 1')]")
	WebElement firstTraveller;
	
	@FindBy(xpath="//label[contains(text(),'22')]")
	WebElement firstTravellerAge;
	
	@FindBy(xpath="//div[contains(text(),'Select age of traveller 2')]")
	WebElement secondTraveller;
	
	@FindBy(xpath="//label[contains(text(),'21')]")
	WebElement secondTravellerAge;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement travellersNextButton;
	
	@FindBy(xpath="//input[@id='ped_yes']")
	WebElement yesRadioButton;
	
	@FindBy(xpath="//input[@id='ped_yes_traveller_0']")
	WebElement firstCheckBox;
	
	@FindBy(xpath="//input[@id='ped_yes_traveller_1']")
	WebElement secondCheckBox;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement medicalHistoryNextButton;
	
	@FindBy(xpath="//input[@id='mobileNumber']")
	WebElement mobileNo;
	
	@FindBy(xpath="//button[text()='View plans']")
	WebElement contactDetailsNextButton;
	
	@FindBy(xpath="(//input[@id='studentTrip'])[1]")
	WebElement studentPlansRadioButton;
	
	@FindBy(xpath="//input[@id='Traveller_1']")
	WebElement travellerOne;
	
	@FindBy(xpath="//input[@id='Traveller_2']")
	WebElement travellerTwo;
	
	@FindBy(xpath="//select[@id='feet']")
	WebElement travelDuration;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement travelInformationApplyButton;
	
	@FindBy(xpath="//p[@class='filter_name_heading']")
	WebElement sortBy;
	
	@FindBy(xpath="//input[@value='Premium low to high']")
	WebElement sortPriceRangeRadioButton;
	
	@FindBy(xpath="//p[@class='quotesCard--insurerName']")
	List<WebElement> insuranceCompanyName;
	
	@FindBy(xpath="//span[@class='premiumPlanPrice']")
	List<WebElement> insuranceAmount;
	
	public void clickCountry() throws IOException
	{
		searchBox.click();
		searchBox.sendKeys(ExcelUtility.getcelldata("Sheet1", 1, 0));
	}
	
	public void selectCountryName()
	{
		jse.executeScript("arguments[0].click();", selectCountryName);
	}
	
	public void clickDestinationNextButton() throws InterruptedException
	{
		destinationNextButton.click();
		Thread.sleep(2000);
	}
	
//	public void clickStartDate()
//	{
//		
//		startDate.click();
//	}
	public void selectStartDate(String travelStartDate)
	{
		startDate.sendKeys(travelStartDate);
	}
//	
//	public void clickEndDate()
//	{
//		endDate.click();
//	}
	public void selectEndDate(String travelEndDate)
	{
		endDate.sendKeys(travelEndDate);
	}
	
	public void clickTripDateNextButton()
	{
		tripDateNextButton.click();
	}
	
	public void selectTravellers()
	{
		noOfPeople.click();
	}
	
	public void clickFirstTraveller() throws InterruptedException
	{
		firstTraveller.click();
		Thread.sleep(2000);
	}
	
	public void selectFirstTravellerAge() throws InterruptedException 
	{
		firstTravellerAge.click();	
		Thread.sleep(4000);
	}
	
	public void clickSecondTraveller() throws InterruptedException
	{
		secondTraveller.click();
		Thread.sleep(2000);
	}
	
	public void selectSecondTravellerAge() throws InterruptedException 
	{
		
		secondTravellerAge.click();
		Thread.sleep(2000);
	}
	
	public void clickTravellersNextButton()
	{
		jse.executeScript("arguments[0].click();", travellersNextButton);
	}
	
	public void clickYes()
	{
		yesRadioButton.click();
	}
	
	public void selectFirstCheckBox()
	{
		firstCheckBox.click();
	}
	
	public void selectSecondCheckBox()
	{
		secondCheckBox.click();
	}
	
	public void clickMedicalHistoryNextButton()
	{
		jse.executeScript("arguments[0].click();", medicalHistoryNextButton);
	}
	
	public void enterMobileNo() throws IOException
	{
		mobileNo.sendKeys(ExcelUtility.getcelldata("Sheet1", 1, 1));
	}
	
	public void clickContactDetailsNextButton() throws InterruptedException
	{
		contactDetailsNextButton.click();
		
	}
	
	public void selectStudentPlansRadioButton() throws InterruptedException
	{
		
		jse.executeScript("arguments[0].click();", studentPlansRadioButton);
		Thread.sleep(2000);
	}
	
	public void selectTravellerOneCheckBox() throws InterruptedException
	{
		jse.executeScript("arguments[0].click();", travellerOne);
		Thread.sleep(2000);
	}
	
	public void selectTravellerTwoCheckBox() throws InterruptedException
	{
		jse.executeScript("arguments[0].click();", travellerTwo);
		Thread.sleep(2000);
	}
	
	public void clickTravelDuration() throws InterruptedException
	{
		jse.executeScript("arguments[0].click();", travelDuration);
	}
	
	public void selectTravelDuration() throws InterruptedException
	{
		Select dropDown = new Select(travelDuration);
		dropDown.selectByValue("1");
		
	}
	
	public void clickTravelInformationApplyButton() throws InterruptedException
	{
		jse.executeScript("arguments[0].click();", travelInformationApplyButton);
		
	}
	
	public void clickSortBy() throws InterruptedException
	{
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", sortBy);		
	}
	
	public void selectSortPriceRange() throws InterruptedException
	{
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();", sortPriceRangeRadioButton);
	}
	
	public void printInsuranceCompanyName() throws IOException
	{
		List<String> companyName = new ArrayList<String>();
		for(int i=0; i<3; i++)
		{
			companyName.add(insuranceCompanyName.get(i).getText());
			ExcelUtility.setcelldata("Sheet1", insuranceCompanyName.get(i).getText(), 0, i);
			
		}
		System.out.println(companyName);	
	}
	
	public void printInsuranceAmount() throws IOException, InterruptedException
	{
		List<String> insurancePrices = new ArrayList<String>();
		for(int i=0; i<3; i++)
		{
			insurancePrices.add(insuranceAmount.get(i).getText());
			ExcelUtility.setcelldata("Sheet1", insuranceAmount.get(i).getText(), 1, i);
			
		}
		System.out.println(insurancePrices);
		Thread.sleep(2000);
	}
	
	public void navigateBack() throws InterruptedException
	{
		driver.navigate().to("https://www.policybazaar.com/");
		Thread.sleep(2000);
	}
	
	
	
	
	
	
}
