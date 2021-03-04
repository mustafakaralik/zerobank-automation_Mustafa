
Feature:Users should be able to

  Scenario: Login as authorized
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    Then Account summary page should be	displayed

  Scenario: Try to Login as unauthorized
    Given the user is on home page
    When the user should not be able to login with invalid credentials
    And the user should not be able to login with blank username and password
    Then error message should be displayed


