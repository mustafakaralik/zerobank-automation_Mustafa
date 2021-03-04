@wip
Feature: Purchase Foreign Currency

  Background:
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials
    Given the user accesses the Purchase foreign currency cash tab

#  Scenario: Available currencies
#
#    Then following currencies should be available
#      | Australia (dollar)    |
#      | Canada (dollar)       |
#      | Switzerland (franc)   |
#      | China (yuan)          |
#      | Denmark (krone)       |
#      | Eurozone (euro)       |
#      | Great Britain (pound) |
#      | Japan (yen)           |
#      | Mexico (peso)         |
#      | Norway (krone)        |
#      | New Zealand (dollar)  |
#      | Singapore (dollar)    |


  Scenario: Error message for not selecting currency
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed

#
#  Scenario: Error message for not entering value

#    When user tries to calculate cost without entering a value
#    Then error message should be displayed