Feature: Animal parameterized test navigation

  Scenario: Animal Navigation Test
    Given I navigated to twy crosszoo website
    When I click on "menu-item-25"
    Then I check page title is "Animals | Twycross Zoo"
    And I close the browser

  Scenario: Visitus Test
    Given I navigated to twy crosszoo website
    When I click on "menu-item-24"
    Then I check page title is "Visit Us | Twycross Zoo"
    And I close the browser

  Scenario: Aboutus Test
    Given I navigated to twy crosszoo website
    When I click on "menu-item-29"
    Then I check page title is "About Us | Twycross Zoo"
    And I close the browser
