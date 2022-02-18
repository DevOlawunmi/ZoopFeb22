Feature: Search

  Background:
    Given I navigate to Zoopla homepage


  Scenario Outline: User can Search For Properties
   # And I accept all cookies
    When I enter "<location>" in the search field
    And I select "<minBed>" as minimum bed
    And I select "<maxBed>" as maximum bed
    And I select "<minPrice>" as minimum price
    And I select "<maxPrice>" as maximum price
    And I choose "<propertyType>" as property type
    And I click on search button
    Then search result page is displayed

    Examples:
    |location|minBed|maxBed|minPrice|maxPrice|propertyType|
    | London       |  3    |   5   |     £300,000   |    £500,000    |     Houses       |
   ## | Leeds        |  2    |   4   |     £200,000   |    £400,000    |     Flat          |
   ## | Luton       |    |     |       |        |     Farms/land         |








