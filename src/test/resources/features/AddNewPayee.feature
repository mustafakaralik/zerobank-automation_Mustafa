Feature: Add new payee under pay bills


  Scenario: Add a new payee
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    Given Add New Payee tab
    And creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA, 10001         |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |
    Then message The new payee The Law Office of Hyde, Price & Scharks was successfully created. should be  displayed
