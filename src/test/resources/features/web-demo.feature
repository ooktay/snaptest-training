@ignore
Feature: Web Demo

  Background:
    Given I open browser


  Scenario: imdb home
    Given I open imdb home page
    Then I see "Opening This Week"
