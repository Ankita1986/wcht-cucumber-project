@AboutUs
Feature: About Us functionality
  As a user I want to visit www.wcht.org.uk website


  Scenario: User should navigate to abous us page successfully
    Given I am on home page
    When I click on close button
    And I click on about us link
    Then I should navigate to abous us page successfully


  Scenario: User should navigate to jobs and careers page successfully
    Given I am on home page
    When I click on close button
    And I click on about us link
    And I click on jobs and careers link
    Then I should navigate to jobs and careers page successfully
