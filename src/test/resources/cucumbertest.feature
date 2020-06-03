@tag
Feature: To validate the cutomer registration functionality

  @tag1
  Scenario: To validate the generated customet id
    Given user is in home page and selects add customer option
    When  user enters cutomer details with firstname and lastname
    And user clicks submit button
    Then customer id should be generated
   

