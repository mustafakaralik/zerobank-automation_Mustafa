Feature:Navigating to specific	accounts in	Accounts Activity

#  Background:
#              Given the user is on home page
#              Then the user is on the login page

  Scenario:Savings account redirect
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    When the user clicks on Savings link on the Account Summary page
    Then Account Activity page should have "Zero - Account Activity" as title
    And Account dropdown should have saving selected

  Scenario:Brokerage account redirect
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    When the user clicks on Brokerage link on the Account Summary page
    Then Account Activity page should have "Zero - Account Activity" as title
    And Account	drop down should have Brokerage	selected


  Scenario: Checking account redirect
      Given the user is on home page
      Then the user is on the login page
      When the user logs in with valid credentials
      When the user clicks on Checking link on the Account Summary page
      Then Account Activity page should have "Zero - Account Activity" as title
      And Account drop down should have Checking selected

  Scenario: Credit Card account redirect
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    When the user clicks on Credit card link on the Account Summary page
    Then Account Activity page should have "Zero - Account Activity" as title
    And Account drop down should have Credit Card selected

  Scenario: Loan account redirect
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    When the user clicks on Loan link on the Account Summary page
    Then Account Activity page should have "Zero - Account Activity" as title
    And Account drop down should have Loan selected