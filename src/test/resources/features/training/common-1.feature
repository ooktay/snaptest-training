Feature: Common 1

  Background:


  Scenario: writing custom steps definitions
    Given I am logged in
    Given I am logged in as Administrator
    Given I am logged in with user1


  Scenario: avoiding duplicate steps definitions
    Given I am registered with user1
    And I am an electrical engineer
    And I am ozgur oktay


  Scenario: using snaptest modules from code
    Given I am logged in with user1


  Scenario: using construction injection in Custom Steps
    Given I am logged in with user1
    And I print last used user

