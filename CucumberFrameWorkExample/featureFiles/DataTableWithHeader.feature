@DataTable
Feature: Login to the HRM application
Scenario: Login to the applicaiton
    Given Go to login page
    When enter the below credentials
    |username|password|
    |admin   |admin123|
    And press the login button
    Then able to see the home page screen
    
    
    
    
   