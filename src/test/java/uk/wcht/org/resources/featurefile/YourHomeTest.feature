@YourHomeTest
Feature: Your home functionality
  As a user I want to go on your home page into wcht website

  Scenario: User should navigate to your home page successfully
    Given I am on wcht home page
    When I click on close button
    And I click on your home link
    Then I should navigate to your home page successfully

  Scenario: User Should navigate to your tenancy page successfully
    Given I am on wcht home page
    When I click on close button
    And I click on your home link
    And I click on your tenancy link
    Then I should navigate to your tenancy page successfully