Feature: To validate Project in backend API

  @Smoke @Reg @Positive @PBE-API-Test1
  Scenario Outline: user is able to create a Project and is able to validate it in backend Api
    Given user is on DIL login page
    When  enter username and password
    And   clicks on createProject tab
    When  creates project with "<ProjectName>","<Description>","<Tag>" and engine
    Then  user should be able to use "<QueryParam>" to validate project on "<BackendApiPath>"
    Examples:
      | ProjectName | Description      | Tag  | QueryParam  | BackendApiPath |
      | Auto_Pro    | CreatingPipeLine | Test | projectName | /projects      |


  @Smoke @Reg @Api-Test2
  Scenario Outline: user is an authorized user and validate record size
    Given user is access api with "<username>" and "<password>" with "<path>"
    Then  user should get validated with "<code>"
    And   searches for records with "<parameter>"
    Then  records size with "<code>" validated with "<parameter>"
    Examples:
      | username | password    | code | path                      | parameter           |
      | apiUser  | apiPassword | 200  | /Account/v1/GenerateToken | /BookStore/v1/Books |
