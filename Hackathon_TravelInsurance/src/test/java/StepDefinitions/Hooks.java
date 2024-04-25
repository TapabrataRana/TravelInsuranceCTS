package StepDefinitions;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks 
{
	public static WebDriver driver;
	public static Properties p;
	BaseClass baseclass;
	@Before
    public void setup() throws IOException
    {
		baseclass = new BaseClass();
    	p=BaseClass.getProperties();
		driver=baseclass.initializebrowser(p.getProperty("os"), p.getProperty("browser"));
		driver.manage().window().maximize();
    
    			
	}
	
	@After
	public static void teardown()
	{
		driver.quit();
	}
	
	@AfterStep
    public void addScreenshot(Scenario scenario) 
	{    	
        TakesScreenshot ts=(TakesScreenshot) driver;
        byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png",scenario.getName());
        	            
    }
      
    
}
