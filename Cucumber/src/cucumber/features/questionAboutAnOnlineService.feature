Feature: Question about HMRC online service

  Scenario: Submit questionabout form for online service
    Given I am on the online hmrc gov question about form
    When I entered the form with valid data
      | User Field      | Entered Value      |
      | emailAddress    | hmrctest@gov.uk    |
      | ContactName     | Hmrc user          |
      | post code       | TF3 4ER            |
      | position        | Director           |
      | online question | question about vat |
    And I click the form for next
    Then I checked that the form entered data
      | User Field      | Entered Value      |
      | emailAddress    | hmrctest@gov.uk    |
      | ContactName     | Hmrc user          |
      | post code       | TF3 4ER            |
      | position        | Director           |
      | online question | question about vat |
    And close the browser
