Feature:

  Background:


  Scenario: Before/After hooks for scenarios
    Given I am logged in with user1

  Scenario: Before/After hooks for steps
    Given I am logged in with user1
    And I print last used user

  Scenario: Before/After hooks test run


  Scenario: Running tests in parallel
    