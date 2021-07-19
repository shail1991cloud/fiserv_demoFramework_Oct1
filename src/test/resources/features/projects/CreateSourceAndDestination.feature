@CreateSourceAndDestination
Feature:Creation of Sources and Destination
  As a user I want to Create a Source and Destination,Validate Source and Destination attributes

  @Smoke @Reg @Positive @CSource-Test1 @TC14
  Scenario Outline: user is able to create source for NoSchema
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<Name>","<Type>","<connection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<Name>"
    Examples:
      | ProjectName | Description          | Tag           | Pipeline |Icon|Name|Type|connection|fileType|FilePath|Separator|sourceSchema|
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne |Add a Source|DemoSource|File System|AUTOMATION_DONOTDELETE|CSV|.csv|,|No Schema|

  @Smoke @Reg @Positive @CSource-Test2 @TC15
  Scenario Outline: user is able to create source for ManualSchema
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<Name>","<Type>","<connection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<Name>"
    Examples:
      | ProjectName | Description          | Tag           | Pipeline |Icon|Name|Type|connection|fileType|FilePath|Separator|sourceSchema|SchemaValue|
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne |Add a Source|DemoSource|File System|AUTOMATION_DONOTDELETE|CSV|.csv|,|Manual Schema|H_JSON|

  @Smoke @Reg @Positive @CSource-Test3 @TC16
  Scenario Outline: user is able to delete created source
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<Name>","<Type>","<connection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<Name>"
    And  click on "<DeleteButton>" to delete
    Then source "<Name>" should get deleted
    Examples:
      | ProjectName | Description          | Tag           | Pipeline |Icon|Name|Type|connection|fileType|FilePath|Separator|sourceSchema|DeleteButton|
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne |Add a Source|DemoSource|File System|AUTOMATION_DONOTDELETE|CSV|.csv|,|No Schema| Delete Source |
