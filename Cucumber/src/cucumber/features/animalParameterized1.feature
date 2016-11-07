Feature: Animal parameterized test navigation

  Scenario: Animal Navigation Test
    Given I navigated to twy crosszoo website
    When I click on "//*[@id='menu-main-1']/li[2]/a"
    Then I check page title is "Animals"
    And I close the browser

  Scenario: Visitus Test
    Given I navigated to twy crosszoo website
    When I click on "//*[@id='menu-main-1']/li[3]/a"
    Then I check page title is "Visit Us"
    And I close the browser

  Scenario: Aboutus Test
    Given I navigated to twy crosszoo website
    When I click on "//*[@id='menu-main-1']/li[5]/a"
    Then I check page title is "About Us"
    And I close the browser
