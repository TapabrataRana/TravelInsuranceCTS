Feature: HealthInsurance

  @Sanity @Regression
  Scenario: Retrieving all Health Insurance menu items
    Given User clicks on health insurance menu
    Then User displays all health insurance plans
    