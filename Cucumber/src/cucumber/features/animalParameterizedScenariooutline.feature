Feature: Animal parameterized scenario outline test

  Scenario Outline: Zoo website parameterized scenario outline
    Given navigate to twy crosszoo website
    When click on "<xpathExpression>"
    Then check page title is "<Title>"
    And browser close

    Examples: 
      | xpathExpression                | Title    |
      | //*[@id='menu-main-1']/li[2]/a | Animals  |
      | //*[@id='menu-main-1']/li[3]/a | Visit Us |
      | //*[@id='menu-main-1']/li[5]/a | About Us |
