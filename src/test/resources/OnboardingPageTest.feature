Feature: test functionality of the onboarding page on builtin.com web app on IOS

  Scenario: verification that the Sign Up button can be clicked and opens a new page
    Given driver is initialized and onboarding page is displayed
    When user presses the login button
    Then the login page is displayed
#    Then community page is displayed