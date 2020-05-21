@DataTable
Feature: Login to the HRM application
Scenario: Login to the applicaiton
    Given You are on the login page
    When you enter the below credentials
    |admin|admin123|
    And enter the login button
    Then able to see the home page
    
    
    
    
   