Feature: CarInsurance

  @Sanity @Regression
  Scenario: Getting a Car Insurance quote
    Given User navigates to the car insurance page
    When User selects city and rto
    And User selects car details
    Then User fills incorrect user details and gets error message
    And User navigates to the policy bazaar homepage
