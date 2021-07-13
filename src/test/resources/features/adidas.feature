@smoke1
Feature: Customer navigation through product categories: Phones, Laptops and Monitors
  and selects products that he likes and adds to the card optionally delites  the product

  Scenario: add to the card Sony vaio i5
    Given user i son home page
    When user clicks on laptops
    And selects Sony vaio i5
    Then user should be able to add it to the card

    Scenario: add to the card Dell i7 8gb
      Given user i son home page
      When user clicks on laptops
      And selects Dell i7 8gb
      Then user should be able to add it to the card





      Scenario: Delete item you just bought
        Given user is on card page
        When user click on Delete item
        Then user should be able to delete that item

      Scenario: User puts all of their info
        Given User puts his info
        When Clicks purchase he should see sale id