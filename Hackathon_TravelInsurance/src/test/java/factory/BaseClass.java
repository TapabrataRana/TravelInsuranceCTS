package factory;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseClass 
{
	public static  WebDriver driver;
	public static Properties p;
	
	public WebDriver initializebrowser(String os,String browser) throws IOException {
		if(getProperties().getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//os
			if (getProperties().getProperty("os").equalsIgnoreCase("windows")) 
			{
			    capabilities.setPlatform(Platform.WIN11);
			} 
			else if (getProperties().getProperty("os").equalsIgnoreCase("mac")) 
			{
			    capabilities.setPlatform(Platform.MAC);
			} 
			else 
			{
			    System.out.println("No matching OS..");
			}
			
			if(browser.equalsIgnoreCase("chrome"))
			{
				capabilities.setBrowserName("chrome");
			}
			else if (browser.equalsIgnoreCase("edge"))
			{
				capabilities.setBrowserName("MicrosoftEdge");
			}
			else
			{
				System.out.println("No matching browser!!!");
			}
			
	//		switch(br)
	//		{
	//		case "chrome" : capabilities.setBrowserName("chrome"); break;
	//		case "edge" : capabilities.setBrowserName("MicrosoftEdge"); break;
	//		default: System.out.println("No matching browser.."); return;
	//		}
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
			
		    }
		else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
			}
			else
			{
				System.out.println("No matching browser!!!");
			}
			
	//		switch(br.toLowerCase())
	//		{
	//		case "chrome": driver=new ChromeDriver(); break;
	//		case "edge": driver=new EdgeDriver(); break;
	//		default: System.out.println("No matching browser..");
	//					return;
	//		}
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		return driver;
	}
	
	public static String startDate()
	{
		DateTimeFormatter Date = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
		String travelStartDate = LocalDate.now().plusDays(5).format(Date);
		return travelStartDate;
	}
	
	public static String endDate()
	{
		DateTimeFormatter Date1 = DateTimeFormatter.ofPattern("dd MMMM, yyyy");
		String travelEndDate = LocalDate.now().plusDays(40).format(Date1);
		return travelEndDate;
	}
	public static Properties getProperties() throws IOException
	{		 
        FileReader file=new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
       		
        p=new Properties();
		p.load(file);
		return p;
	}
	
	
	
	
}
