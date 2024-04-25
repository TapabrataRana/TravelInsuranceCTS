package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	JavascriptExecutor jse;
	public HomePage(WebDriver driver)
	{
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath="//p[normalize-space()='Travel Insurance']")
	WebElement travelInsuranceButton;
	
	@FindBy(xpath="(//i[@class='arrow'])[1]")
	WebElement menuDownArrow;
	
	@FindBy(xpath="//a[text()='Car Insurance']")
	WebElement carInsuranceButton;
	
	@FindBy(xpath="//a[normalize-space()='Insurance Products']")
	WebElement insuranceProductsMenu;
	
	public void clickTravelInsurance()
	{
		jse.executeScript("arguments[0].click();", travelInsuranceButton);
	}
	
	public void clickCarInsurance()
	{
		menuDownArrow.click();
		jse.executeScript("arguments[0].click();", carInsuranceButton);
	}
	
	public void healthInsuranceMenu() throws InterruptedException
	{
		menuDownArrow.click();
	}
	
}
