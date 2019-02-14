@ignore
Feature: Customization

  @demo
  Scenario: Custom user
    Given I am registered with user1
    Then I verify my prop equals "custom"

    When I assign random prop
    Then I save my prop as the random
    # See logs for the random value
