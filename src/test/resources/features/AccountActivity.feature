Feature: Account Activity

  Scenario: Account activity page
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    Then the user is on Account activity page
    Then Account Activity page should have "Zero - Account Activity" as title
    And Account dropdown should have saving selected
    And Account dropdown  following options
    | Savings       |
    | Checking      |
    | Savings       |
    | Loan          |
    | Credit Card   |
    | Brokerage     |
    And Transaction table column names
      |	Date          |
      |	Description   |
      |	Deposit	      |
      |	Withdrawal	  |