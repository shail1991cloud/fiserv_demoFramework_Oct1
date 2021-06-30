Feature: To validate api calls

  @Smoke @Reg @Api-Test1
  Scenario Outline: user is an authorized user
    Given user is access api with "<username>" and "<password>" with "<path>"
    Then  user should get validated with "<code>"
    And   searches for records with "<parameter>"
    Then  records size with "<code>" validated with "<parameter>"
    Examples:
      | username| password |code|           path           |parameter          |
      | apiUser|apiPassword|200 | /Account/v1/GenerateToken|/BookStore/v1/Books|
