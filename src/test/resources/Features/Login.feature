Feature: Login User with correct email and password

  Scenario: Login with valid credentials
    Given the user launches the browser
    And navigates to 'http://automationexercise.com'
    Then the home page should be visible successfully
    When the user clicks on Signup Login button
    Then Login to your account should be visible
    When the user enters correct email address and password
    And clicks the login button
    Then Logged in as username should be visible
    When the user clicks Delete Account button
    Then ACCOUNT DELETED! should be visible
