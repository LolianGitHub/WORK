Feature: Write Shopping Review

  Background: 
    Given I've a valid set of data and access

  @ShoppingWriteReview
  Scenario: Shopping Write Review Process
    When Home page Display
    Then Enter Shopping Page
    Then Select Brands Category
    Then Select Acteon Category
    Then Select Prduct named RISKONTROL Adapter LU INOX
    Then Click Write a Review
    Then Enter Valid Data
      | Name        | aditya			 	|
      | Email       | add@add.com 	|
      | Location    | Acukland 			|
      | Title       | Doctor				|
    Then Click Submit
		And  Close