package testRunner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features/Feature1_TravelInsurance.feature", "Features/Feature2_CarInsurance.feature", "Features/Feature3_HealthInsurance.feature"},
				glue = "StepDefinitions",
				plugin= {"pretty", "html:reports/myreport.html", 
						  "rerun:target/rerun.txt",
						  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						},
				dryRun=false,    
				monochrome=true,   
				publish=true,
				tags="@Sanity or @Regression"
				)
//public class TestRunner{
//
//}
public class TestRunner extends AbstractTestNGCucumberTests{

}
