@CreateSourceAndDestination
Feature:Creation of Sources and Destination
  As a user I want to Create a Source and Destination,Validate Source and Destination attributes

  @Smoke @Reg @Positive @CSource-Test1 @TC15
  Scenario Outline: user is able to create file type source for NoSchema
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<Name>","<Type>","<connection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<Name>"
    Examples:
      | ProjectName | Description          | Tag           | Pipeline | Icon         | Name       | Type        | connection             | fileType | FilePath | Separator | sourceSchema |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | No Schema    |

  @Smoke @Reg @Positive @CSource-Test2 @TC16
  Scenario Outline: user is able to create file type source for ManualSchema
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<Name>","<Type>","<connection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<Name>"
    Examples:
      | ProjectName | Description          | Tag           | Pipeline | Icon         | Name       | Type        | connection             | fileType | FilePath | Separator | sourceSchema  | SchemaValue |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | Manual Schema | H_JSON      |

  @Smoke @Reg @Positive @CSource-Test3 @TC17
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
      | ProjectName | Description          | Tag           | Pipeline | Icon         | Name       | Type        | connection             | fileType | FilePath | Separator | sourceSchema | DeleteButton  |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | No Schema    | Delete Source |

  @Smoke @Reg @Positive @CTransformation-Test1 @TC18
  Scenario Outline: user is able to create Transformation
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<SourceName>","<Type>","<connection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<SourceName>"
    When enters "<TransformationName>","<Category>","<TransformationType>","<columnValue>" and click add
    Then Transformation with "<TransformationName>" should get created
    Examples:
      | ProjectName | Description          | Tag           | Pipeline | Icon         | SourceName | Type        | connection             | fileType | FilePath | Separator | sourceSchema  | SchemaValue | TransformationName | Category | TransformationType | columnValue |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | Manual Schema | H_JSON      | TestTrans          | Column   | GroupBy            | age         |

  @Smoke @Reg @Positive @CDestination-Test1 @TC19
  Scenario Outline: user is able to create Kafka type Destination
    Given user is on DIL login page
    When enter username and password
    And  clicks on createProject tab
    When creates project with "<ProjectName>","<Description>","<Tag>" and engine
    And  creates a "<Pipeline>" having "<Description>" and "<Tag>"
    And  clicks on "<Icon>"
    When Enters "<SourceName>","<SourceType>","<SourceConnection>","<fileType>","<FilePath>","<Separator>","<sourceSchema>","<SchemaValue>"
    Then Source should get created with "<SourceName>"
    When enters "<DestinationName>","<DestinationType>","<DestConnection>","<fileType>" ,"<TopicName>" and click add
    Then Destination with "<DestinationName>" should get created
    Examples:
      | ProjectName | Description          | Tag           | Pipeline | Icon         | SourceName | SourceType  | SourceConnection             | fileType | FilePath | Separator | sourceSchema  | SchemaValue | DestinationName | DestinationType | DestConnection | TopicName |
      | AutoDIL     | ProjectForAutomation | Test_Pipeline | PipeLIne | Add a Source | DemoSource | File System | AUTOMATION_DONOTDELETE | CSV      | .csv     | ,         | Manual Schema | H_JSON      |                       |                 |                |            |

