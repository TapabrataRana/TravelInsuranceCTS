package StepDefinitions;

import java.io.IOException;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.TravelInsurance;

public class TC_001_TravelInsurance extends BaseClass
{
	TravelInsurance travel = new TravelInsurance(driver); 
	HomePage homepage = new HomePage(driver);
	
	@Given("User navigates to the travel insurance page")
	public void user_navigates_to_the_travel_insurance_page() 
	{
		homepage.clickTravelInsurance();
	}
	@When("User enters destination details")
	public void user_enters_destination_details() throws IOException, InterruptedException 
	{
		travel = new TravelInsurance(driver);
		travel.clickCountry();
		travel.selectCountryName();
		travel.clickDestinationNextButton();
	}
	@When("User enters trip date details")
	public void user_enters_trip_date_details() 
	{
		travel.selectStartDate(startDate());
		travel.selectEndDate(endDate());
		travel.clickTripDateNextButton();
	}
	@When("User enters travellers details")
	public void user_enters_travellers_details() throws InterruptedException 
	{
		travel.selectTravellers();
		travel.clickFirstTraveller();
		travel.selectFirstTravellerAge();
		travel.clickSecondTraveller();
		travel.selectSecondTravellerAge();
		travel.clickTravellersNextButton();
	}
	@When("User enters medical history details")
	public void user_enters_medical_history_details() 
	{
		travel.clickYes();
		travel.selectFirstCheckBox();
		travel.selectSecondCheckBox();
		travel.clickMedicalHistoryNextButton();
	}
	@When("User enters contact details")
	public void user_enters_contact_details() throws IOException, InterruptedException 
	{
		travel.enterMobileNo();
		travel.clickContactDetailsNextButton();
	}
	@Then("User gets the student insurance plan details")
	public void user_gets_the_student_insurance_plan_details() throws InterruptedException, IOException 
	{
		travel.selectStudentPlansRadioButton();
		travel.selectTravellerOneCheckBox();
		travel.selectTravellerTwoCheckBox();
		travel.selectTravelDuration();
		travel.clickTravelInformationApplyButton();
		travel.clickSortBy();
		travel.selectSortPriceRange();
		travel.printInsuranceCompanyName();
		travel.printInsuranceAmount();
	}
	@Then("User navigates to policy bazaar homepage")
	public void user_navigates_to_policy_bazaar_homepage() throws InterruptedException
	{
		travel.navigateBack();
	}



}
