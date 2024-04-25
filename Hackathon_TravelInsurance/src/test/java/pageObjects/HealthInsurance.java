package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.ExcelUtility;

public class HealthInsurance extends BasePage
{
	JavascriptExecutor jse;
	public HealthInsurance(WebDriver driver)
	{
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	@FindBy(xpath="(//div[contains(@class,'ruby-col-3 hidden-md')])[2]/ul/li")
	List<WebElement> healthInsurancePlans;
	
	public void printHealthInsurancePlans() throws IOException
	{
		for(int i=0; i<healthInsurancePlans.size(); i++)
		{
			String insurancePlans = healthInsurancePlans.get(i).getText();
			System.out.println(insurancePlans);
			ExcelUtility.setcelldata("Sheet1", insurancePlans, i+5, 0);
		}
	}
	
	public void navigateBack() throws InterruptedException
	{
		driver.navigate().to("https://www.policybazaar.com/");
		Thread.sleep(2000);
	}
	
}
