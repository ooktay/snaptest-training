@ignore
Feature: Rest Service Demo

  Background:
    Given I open browser


  Scenario: Country code
    When I call iso code rest service with parameters:
      | countryCode | TR |
    Then response status code is 200
    And verify the response with jsonpath:
      | RestResponse.result.name        | Turkey |
      | RestResponse.result.alpha2_code | TR     |
      | RestResponse.result.alpha3_code | TUR    |
    And I save values of the response:
      | RestResponse.result.alpha2_code | the alpha2 code of Turkey |
      | RestResponse.result.alpha3_code | the alpha3 code of Turkey |
    And I save variable the Turkey ISO codes as:
      | the alpha2 code of Turkey | ' / ' | the alpha3 code of Turkey |

    When I open countrycode home page
    And I save countries table row as the turkey row where:
      | COUNTRY | Turkey |
    And I verify the turkey row with columns:
      | COUNTRY | COUNTRY CODE | ISO CODES            | POPULATION | AREA KM2 | GDP $USD      |
      | Turkey  | 90           | the Turkey ISO codes | 77.804.122 | 780.580  | 821.8 Billion |
