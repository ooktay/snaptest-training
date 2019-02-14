@ignore
Feature: Web Service Demo


  Scenario: Country Info Web Service
    When I call country name web service with parameters:
      | s country iso code | TR |
    Then I verify the response equals "Turkey"

  Scenario: Full Country Info
    When I call full country info web service with parameters:
      | s country iso code | TR |
    Then I verify the response properties:
      | languages -> t language #1 -> siso code | tur |
