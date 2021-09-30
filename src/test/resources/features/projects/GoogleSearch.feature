Feature: To search result in Google Search box

  @SmokeTest
  Scenario Outline: User is able to search a result and verify the same
    Given user passes "<url>" and "<Item>" navigates to Google page
    When enters "<Item>" to Google Search box
    Then "<ItemWithDescription>" should be validated in Search result
    Examples:
     | url| Item |ItemWithDescription|
     |https://www.google.com/ | Fiserv|Fiserv: Financial Services Technology, Mobile Banking ...|
     |https://www.bing.com/ | Shailendra|Fiserv: Financial Services Technology, Mobile Banking ...|