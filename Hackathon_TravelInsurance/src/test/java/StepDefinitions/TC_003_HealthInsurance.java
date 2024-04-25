package StepDefinitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.HealthInsurance;
import pageObjects.HomePage;

public class TC_003_HealthInsurance extends BaseClass
{
	HealthInsurance health = new HealthInsurance(driver);
	HomePage homepage = new HomePage(driver);
	
	
	@Given("User clicks on health insurance menu")
	public void user_clicks_on_health_insurance_menu() throws InterruptedException 
	{
		homepage.healthInsuranceMenu();
	}
	@Then("User displays all health insurance plans")
	public void user_displays_all_health_insurance_plans() throws IOException, InterruptedException 
	{
	   health.printHealthInsurancePlans();
	   health.navigateBack();
	}



}
