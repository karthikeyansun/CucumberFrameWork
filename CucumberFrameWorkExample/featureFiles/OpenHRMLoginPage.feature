@LoginHRM @DataTable
Feature: Login to the HRM application
Scenario: Login to the applicaiton
    Given Open Chrome browser and launch the HRM application
    When user enters the username in the username field
    And user enters the password in the password field
    Then user click on the login button and validate if the user login is sucessful
    
    
   