package StepDefinitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CarInsurance;
import pageObjects.HomePage;

public class TC_002_CarInsurance extends BaseClass
{
	CarInsurance car = new CarInsurance(driver);
	HomePage homepage= new HomePage(driver);

	@Given("User navigates to the car insurance page")
	public void user_navigates_to_the_car_insurance_page() throws InterruptedException 
	{
	   homepage.clickCarInsurance();
	   car.clickHere();
	}
	@When("User selects city and rto")
	public void user_selects_city_and_rto() throws InterruptedException 
	{
		car.selectCity();
		car.selectRTO();
	}
	@When("User selects car details")
	public void user_selects_car_details() throws InterruptedException 
	{
	    car.selectCarBrand();
	    car.selectCarModel();
	    car.selectCarFuelType();
	    car.selectCarVariant();
	}
	@Then("User fills incorrect user details and gets error message")
	public void user_fills_incorrect_user_details_and_gets_error_message() throws IOException, InterruptedException 
	{
	   car.enterFullName();
	   car.enterIncorrectEmail();
	   car.enterMobileNumber();
	   car.printErrorMessage();
	   car.clickViewPrices();
	}
	@Then("User navigates to the policy bazaar homepage")
	public void user_navigates_to_the_policy_bazaar_homepage() throws InterruptedException
	{
		car.navigateBack();
	}



}

