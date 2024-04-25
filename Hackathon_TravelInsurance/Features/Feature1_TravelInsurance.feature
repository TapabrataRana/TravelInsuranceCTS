Feature: TravelInsurance

  @Sanity @Regression
  Scenario: Find travel insurance plan for students
    Given User navigates to the travel insurance page
    When User enters destination details
    And User enters trip date details
    And User enters travellers details
    And User enters medical history details
    And User enters contact details
    Then User gets the student insurance plan details
    And User navigates to policy bazaar homepage
