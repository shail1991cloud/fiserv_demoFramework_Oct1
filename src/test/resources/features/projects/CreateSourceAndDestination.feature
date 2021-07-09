@CreateSourceAndDestination
Feature:Creation of Sources and Destination
  As a user I want to Create a Source and Destination,Validate Source and Destination attributes


  @Smoke @Reg @Positive @CP-Test1
  Scenario Outline: user is able to create source for NoSchema
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<Name>","<FileType>""<FilePath>","<Seperator>"
    Then Source should get created
    Examples:
      | ProjectName | Description          | Tag           | Pipeline |Icon|Name|FileType|FilePath|Seperator|
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne |Add a Source|DemoSource|File System|.csv|,|