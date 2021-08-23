Feature: User should be able to Create, Validate Connections on Connections Page

  @Smoke @Reg @Positive @PBE-API-Test1 @TC29
  Scenario Outline: user is able to create a Project and is able to validate it in backend Api
    Given user is on DIL login page
    When  enter username and password
    And   navigates to the "<CreateConnection>" tab
    When  enters "<Name>","<Description>","<ConnectionType>",principal and fileType
    Then  connection should be tested successfully
    When  creates the connection
    Then  connection with "<Name>" should be validated on Connection listing page
    Examples:
      | CreateConnection    | Name               | Description         | ConnectionType |
      | Create a connection | AutomationKerberos | Creating Connection | KERBEROS       |
