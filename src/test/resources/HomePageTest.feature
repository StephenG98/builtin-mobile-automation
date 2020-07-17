Feature: test functionality of the Home Page on builtin.com web app on IOS

  Scenario: verification that the Sign Up button can be clicked and opens a new page
    Given builtin.com is loaded and home page is visible
    When user swipes down to the sign up button
    And user presses the sign up button
#    Then the sign up page is displayed