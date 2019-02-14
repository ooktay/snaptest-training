@ignore
Feature: IMDB web site test automation with Snaptest

  Background:
    Given I open browser


  Scenario: Movie search

    Given I open imdb home page

    When I fill:
      | search | The Thin Red Line |
    And I click search button

    Then I see search results page
    And I see "The Thin Red Line (1998)" in first search result

