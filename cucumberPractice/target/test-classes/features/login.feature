Feature: Testing Login Functionality

  Scenario: Positive login test case
    Given the user is on the home screen
    And an account is already created
    When the correct username is entered
    And the correct password is entered
    Then the user is successfully logged in
    
  Scenario Outline: Positive login test case
     Given the user "<name>" with value "<value>" is on the home screen
     And an account is already created
     When the correct username is entered
     And the correct password is entered
     Then the user login status should be "<status>"

    
    Example: 
      | name | value | status |
      | "name1" | 5 | "success" |
      | "name2" | 7 | "fail" |
      
      