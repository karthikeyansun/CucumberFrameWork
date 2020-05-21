Feature: Login to the HRM application
Scenario: Login to the applicaiton
    Given Launch Chrome browser and open the HRM application
    When customer enters the username in the username field "admin"
    And customer enters the password in the password field "admin123"
    Then customer click on the login button and validate if the user login is sucessful