$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OpenHRMLoginPage.feature");
formatter.feature({
  "line": 2,
  "name": "Login to the HRM application",
  "description": "",
  "id": "login-to-the-hrm-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginHRM"
    },
    {
      "line": 1,
      "name": "@DataTable"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Login to the applicaiton",
  "description": "",
  "id": "login-to-the-hrm-application;login-to-the-applicaiton",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Chrome browser and launch the HRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters the username in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the password in the password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on the login button and validate if the user login is sucessful",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenHRMLoginPageDefinitions.open_Chrome_browser_and_launch_the_HRM_application()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpenHRMLoginPageDefinitions.user_enters_the_username_in_the_username_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpenHRMLoginPageDefinitions.user_enters_the_password_in_the_password_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OpenHRMLoginPageDefinitions.user_click_on_the_login_button_and_validate_if_the_user_login_is_sucessful()"
});
formatter.result({
  "status": "skipped"
});
});