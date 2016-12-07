Feature: Tax outline test

  Scenario Outline: Verification of tax Year Reference and available forms for the selected tax year on the exb landing page
    Given that I am logged into exb "<TaxYear>" app in as "User1"
    Given I am on the EXB landing page
    Then I check the "<taxyearreference>" on the landing page
    Then I check the available forms "<P11DbReference>" and "<P46CarReference>" on the EXB landing page table
    Then I check that There should not be any "<P9D>" reference in the EXB landing page table
    Then I check that P11Db hyperlink visibility is "<P11DbLinkVisibility>" P46Car hyperlink visibility is "<P46CarLinkVisibility>"

    Examples: 
      | TaxYear | taxyearreference | P11DbReference | P46CarReference | P9D        | P11DbLinkVisibility | P46CarLinkVisibility |
      |    1617 | 2016 / 2017      | P11D(b)        | P46(Car) batch  | P9D(Batch) | TRUE                | TRUE                 |
      |    1718 | 2017 / 2018      | P11D(b)        | P46(Car) batch  | P9D(Batch) | FALSE               | TRUE                 |
