Feature: To search an item and validate first visible result on Search Engines

  @Smoke @Reg
  Scenario Outline: User is able to search a term and verify the first result on Search engine
    Given user launches "<url>" for SearchEngine
    When  enters "<Term>" to "<SearchEngine>" search  box
    Then "<FirstItemInSearchResult>" should be validated in Search result for "<SearchEngine>"
    Examples:
      | SearchEngine | url                     | Term                | FirstItemInSearchResult                                   |
      | Google       | https://www.google.com/ | Fiserv              | Fiserv: Financial Services Technology, Mobile Banking ... |
