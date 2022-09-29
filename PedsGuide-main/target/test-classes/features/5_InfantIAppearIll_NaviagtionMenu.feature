Feature: To verify Infant Appears ill Navigation Menu
  Scenario Outline: Click on Disclaimer menu tab
    Given I should be on febrile infant page with title"<febrileInfant>"
    When I click on "<infantAppearsIll>" button
    And I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Disclaimers tab
    Then  I should see page with "<disclaimers>" title
    Examples:
      | dialogTitle | febrileInfant | infantAppearsIll | disclaimers |
      | Febrile - Infant Appears Ill | Febrile Infant | Infant appears ill | Disclaimers |

  Scenario Outline: Click on Diagnostic Tests menu tab
    Given I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Diagnostic Tests tab
    And I should see page with "<diagnosticTests>" title
    When I click back
    Then I should see page with "<disclaimers>" title
    Examples:
      | dialogTitle | disclaimers |diagnosticTests|
      | Febrile - Infant Appears Ill | Disclaimers | Diagnostic Tests |


  Scenario Outline: Click on Antibiotic Options after Admission menu tab
    Given I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on Antibiotic Options after Admission tab
    Then I should see page with "<antibioticOptions>" title
    When I click back
    Then I should see page with "<disclaimers>" title
    Examples:
      | dialogTitle |disclaimers| antibioticOptions |
      | Febrile - Infant Appears Ill  | Disclaimers | Antibiotic Options after Admission |

  Scenario Outline: Click on return to beginning menu tab
    Given I should see page with "<disclaimers>" title
    When I click on Infant appears ill menu icon
    And I see dialog with title "<dialogTitle>"
    When I click on return to beginning tab
    And  I should see page with "<disclaimers>" title
    When I click back
    Then I should go back with page "<febrileInfant>"
    Examples:
      | dialogTitle | febrileInfant |  disclaimers |
      | Febrile - Infant Appears Ill | Febrile Infant | Disclaimers |

