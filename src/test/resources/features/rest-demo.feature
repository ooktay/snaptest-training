Feature: Rest Service Demo


  Scenario: Star wars REST API
    When I call star wars people rest service with parameters:
      | id | 36 |
    Then response status code is 200
    And I verify the response with jsonpath:
      | name | Jar Jar Binks |
    And I save values of the response:
      | films[0] | the first film |


  Scenario: Star wars film
    When I call star wars people rest service with parameters:
      | id | 36 |
    Then response status code is 200
    And I verify the response with jsonpath:
      | name | Jar Jar Binks |
    And I save values of the response:
      | films[0] | the first film |


  Scenario: Country code
    When I call iso code rest service with parameters:
      | countryCode | TR |
    Then response status code is 200
    And verify the response with jsonpath:
      | RestResponse.result.name        | Turkey |
      | RestResponse.result.alpha2_code | TR     |
      | RestResponse.result.alpha3_code | TUR    |
    And I save jsonpath values of the response:
      | RestResponse.result.alpha3_code | the alpha3 code of Turkey |

