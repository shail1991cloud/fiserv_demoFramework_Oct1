@E2ETests
Feature:Creation of a End to End scenarios

  @Smoke @Reg @Positive @E2ETest1 @TC22
  Scenario Outline: user is able to create a project with a pipeline in ready status
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" with "<Description>","<Tag>","<ExecutionType>","<PKey>","<PValue>","<SKey>" and "<SValue>"
    And  clicks on "<Icon>"
    When Enters "<SourceName>","<SourceType>","<SourceConnection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<SourceName>"
    When enters "<TransformationName>","<Category>","<TransformationType>","<columnValue>" and click add
    Then Transformation with "<TransformationName>" should get created
    When enters "<DestinationName>","<DestinationType>","<DestConnection>","<fileType>" ,"<FilePath>","<TopicName>" and click add
    Then PipeLine with status "<Status>" is validated
    Examples:
      | ProjectName | Description          | Tag           | ExecutionType | PKey | PValue | SKey | SValue | Pipeline | Icon         | SourceName | SourceType  | SourceConnection       | fileType | FilePath | Separator | sourceSchema  | SchemaValue | TransformationName | Category | TransformationType | columnValue | DestinationName | DestinationType | DestConnection         | TopicName | Status |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | STREAMING     | k1   | v1     | s1   | v2     | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | Manual Schema | H_JSON      | TestTrans          | Column   | GroupBy            | age         | DemoDestination | File System     | AUTOMATION_DONOTDELETE | CDR       | READY  |


