@E2ETests
Feature:Creation of a End to End scenarios

  @Smoke @Reg @Positive @E2ETest1 @TC24
  Scenario Outline: user is able to create a project with a pipeline in ready status with FileSystem as source and Destination as FileSystem
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" with "<Description>","<Tag>","<ExecutionType>","<Key>","<Value>","<SKey>" and "<SValue>"
    And  clicks on "<Icon>"
    When Enters "<SourceName>","<SourceType>","<SourceConnection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<SourceName>"
    When enters "<TransformationName>","<Category>","<TransformationType>","<columnValue>" and click add
    Then Transformation with "<TransformationName>" should get created
    When enters "<DestinationName>","<DestinationType>","<DestConnection>","<fileType>" ,"<FilePath>","<TopicName>" and click add
    Then PipeLine with status "<Status>" is validated
    Examples:
      | ProjectName | Description          | Tag           | ExecutionType | Key | Value | SKey | SValue | Pipeline | Icon         | SourceName | SourceType  | SourceConnection       | fileType | FilePath | Separator | sourceSchema  | SchemaValue | TransformationName | Category | TransformationType | columnValue | DestinationName | DestinationType | DestConnection         | TopicName | Status |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | STREAMING     | k1  | v1    | s1   | v2     | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | Manual Schema | H_JSON      | TestTrans          | Column   | GroupBy            | age         | DemoDestination | File System     | AUTOMATION_DONOTDELETE | CDR       | READY  |

  @Smoke @Reg @Positive @E2ETest1 @TC25
  Scenario Outline: user is able to create a project with a pipeline in ready status with Kafka as source and Destination as FileSystem
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" with "<Description>","<Tag>","<ExecutionType>","<Key>","<Value>","<SKey>" and "<SValue>"
    And  clicks on "<Icon>"
    When Enters "<SourceName>","<SourceType>","<SourceConnection>","<TopicName>","<SourceSchema>","<RegistryName>","<Offset>","<Key>","<Value>" and clicks on add
    Then Source should get created with "<SourceName>"
    When enters "<TransformationName>","<Category>","<TransformationType>","<columnValue>" and click add
    Then Transformation with "<TransformationName>" should get created
    When enters "<DestinationName>","<DestinationType>","<DestConnection>","<fileType>" ,"<FilePath>","<TopicName>" and click add
    Then PipeLine with status "<Status>" is validated
    Examples:
      | ProjectName | Description          | Tag           | ExecutionType | Key | Value | SKey | SValue | Pipeline | Icon         | SourceName | SourceType | SourceConnection | fileType | FilePath | SourceSchema | RegistryName            | Offset  | TransformationName | Category | TransformationType | columnValue | DestinationName | DestinationType | DestConnection         | TopicName | Status |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | STREAMING     | k1  | v1    | s1   | v2     | PipeLIne | Add a Source | DemoSource | KAFKA      | Kafka_plain      | CSV      | .csv     | Manual       | AAA_Automation_DoNotDEl | Earlier | TestTrans          | Column   | GroupBy            | m_id        | DemoDestination | File System     | AUTOMATION_DONOTDELETE | CDR       | READY  |

  @Smoke @Reg @Positive @E2ETest1 @TC26
  Scenario Outline: user is able to create a project with a pipeline in ready status with FileSystem as source and Destination as Kafka
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" with "<Description>","<Tag>","<ExecutionType>","<Key>","<Value>","<SKey>" and "<SValue>"
    And  clicks on "<Icon>"
    When Enters "<SourceName>","<SourceType>","<SourceConnection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<SourceName>"
    When enters "<TransformationName>","<Category>","<TransformationType>","<columnValue>" and click add
    Then Transformation with "<TransformationName>" should get created
    When enters "<DestinationName>","<DestinationType>","<DestConnection>","<fileType>" ,"<FilePath>","<TopicName>" and click add
    Then PipeLine with status "<Status>" is validated
    Examples:
      | ProjectName | Description          | Tag           | ExecutionType | Key | Value | SKey | SValue | Pipeline | Icon         | SourceName | SourceType  | SourceConnection       | fileType | FilePath | Separator | sourceSchema  | SchemaValue | TransformationName   | Category | TransformationType | columnValue | DestinationName | DestinationType | DestConnection | TopicName    | Status |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | STREAMING     | k1  | v1    | s1   | v2     | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | Manual Schema | H_JSON      | TestTransFileToKafka | Column   | GroupBy            | age         | DemoDestination | KAFKA           | Kafka_plain    | testkafkacmp | READY  |

  @Smoke @Reg @Positive @E2ETest1 @TC27
  Scenario Outline: user is able to create a project with a pipeline in ready status with Kafka as source and Destination as kafka
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" with "<Description>","<Tag>","<ExecutionType>","<Key>","<Value>","<SKey>" and "<SValue>"
    And  clicks on "<Icon>"
    When Enters "<SourceName>","<SourceType>","<SourceConnection>","<TopicName>","<SourceSchema>","<RegistryName>","<Offset>","<Key>","<Value>" and clicks on add
    Then Source should get created with "<SourceName>"
    When enters "<TransformationName>","<Category>","<TransformationType>","<columnValue>" and click add
    Then Transformation with "<TransformationName>" should get created
    When enters "<DestinationName>","<DestinationType>","<DestConnection>","<fileType>" ,"<FilePath>","<TopicName>" and click add
    Then PipeLine with status "<Status>" is validated
    Examples:
      | ProjectName | Description          | Tag           | ExecutionType | Key | Value | SKey | SValue | Pipeline | Icon         | SourceName | SourceType | SourceConnection | fileType | FilePath | SourceSchema | RegistryName            | Offset  | TransformationName | Category | TransformationType | columnValue | DestinationName | DestinationType | DestConnection | TopicName    | Status |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | STREAMING     | k1  | v1    | s1   | v2     | PipeLIne | Add a Source | DemoSource | KAFKA      | Kafka_plain      | CSV      | .csv     | Manual       | AAA_Automation_DoNotDEl | Earlier | TestTrans          | Column   | GroupBy            | m_id        | DemoDestination | KAFKA           | Kafka_plain    | testkafkacmp | READY  |
