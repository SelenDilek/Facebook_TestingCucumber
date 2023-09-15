Feature: Login on the Facebook web page
  Scenario Outline: Creating new accounts and enter Login
    Given User go to facebook page
    And User verify title
    And user click the create new account
    And user enter informations as
    Examples:
      |name|surname|phone        |password|
      |Selen|Dilek |+905359630122|0123SS..!|
      |Samet|Alica |+905388430122|0888SS..!|
    And user select date of birth
    And user select gender
    And user click the sign in button
    And close the app
