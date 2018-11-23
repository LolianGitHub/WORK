Feature: Registration in Flight site

  Background: 
    Given I've a valid set of data and access

  @Registration
  Scenario: Single User Registration process
    When Registration page Display
    Then Enter Valid Data
      | UserName        | aditya |
      | Password        | test12 |
      | ConfirmPassword | test12 |
    Then Click Submit
    Then Click Signoff
		And  Close