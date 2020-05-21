@DataTable
Feature: Login to the HRM application
Scenario Outline: Login to the applicaiton
    Given Move to login page
    When user enters the "<username>"  and "<password>" 
    And login button
    Then verify loginscreen
    
    Examples:
    |username|password|
    |admin   |admin123|
    |admin   |admin124|
    |admin1   |admin123|
   
   