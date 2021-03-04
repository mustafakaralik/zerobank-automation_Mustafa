Feature: Account Summary

  Scenario: Account types
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    Then Account summary page should be	displayed
    Then the user should see following Account types
      |	Cash Accounts       |
      |	Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

    Then Credit Accounts table must have following column names
      |	Account      |
      |	Credit Card  |
      |	Balance	     |
