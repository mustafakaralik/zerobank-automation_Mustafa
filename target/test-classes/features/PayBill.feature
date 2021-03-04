
@smoke
Feature:Pay Bills

  Background:
    Given the user is on home page
    Then the user is on the login page
    When the user logs in with valid credentials

  Scenario: Successfully payment
    Then Page should have "Zero - Pay Bills" as title
    When user is able to complete payment
      | Amount | 125        |
      | Date   | 2021-01-01 |
    And  After Payment,"The payment was successfully submitted." should be displayed

  Scenario: tyring to pay with missing data
    When Payment should not be performed without entering the amount  or date
    Then Please	fill out this field message! should be displayed

    #WE CAN RUN SEPERATED USİNG MAP AND PİPE
#  Scenario: Failed Pay operation
#    When user tries to make a payment without entering the date
#      | Amount | 100        |
#    Then The payment was failed and fail message is displayed on date input box

  Scenario: tyring to pay with missing data
    And  Alphabetical or special characters should not be accepted in Amount field
    And  Alphabetical characters should not be accepted in Date field