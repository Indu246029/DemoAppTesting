Feature:To verify 29 - 60 Days Low Risk and High Bacteria
  Scenario Outline: Open 29 - 60 Days page
    Given I should be on febrile infant page with title"<febrileInfant>"
    When I click on 29 - 60 Days button
    Then I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    Examples:
      |febrileInfant| urinaryTractInfection |
      | Febrile Infant  | Urinary Tract Infection |

  Scenario Outline: Open Diagnostic Tests page
    Given I should on Page Urinary Tract Infection with "<urinaryTractInfection>" title
    When I click on Diagnostic Tests button
    Then I should on Page Diagnostic Tests with "<diagnosticTests>" title
    Examples:
    |urinaryTractInfection | diagnosticTests |
    | Urinary Tract Infection | Diagnostic Tests |

  Scenario Outline: Open HSV Checklist and Assessment page
    Given I should on Page Diagnostic Tests with "<diagnosticTests>" title
    When I click on Proceed to HSV Risk Assessment button
    Then I should on Page HSV Checklist and Assessment with "<HSVChecklist>" title
    Examples:
      | HSVChecklist | diagnosticTests |
      | HSV Checklist | Diagnostic Tests |

  Scenario Outline: Open Bacterial Infection Assessment page
    Given I should on Page HSV Checklist and Assessment with "<HSVChecklist>" title
    When I click on HSV Low Risk Recommendations button
    Then I should on Page Bacterial Infection Assessment with "<bacterialInfectionAssessment>" title
    Examples:
      | HSVChecklist | bacterialInfectionAssessment |
      | HSV Checklist | Bacterial Infection Assessment |

  Scenario Outline: Open Disposition Recommendations page
    Given I should on Page Bacterial Infection Assessment with "<bacterialInfectionAssessment>" title
    When I check Historical or Documented Fever
    And I click on Proceed to High-Risk Bacterial Infection Recommendations button
    Then I should on Page Disposition Recommendations with "<dispositionRecommendations>" title
    Examples:
      | bacterialInfectionAssessment | dispositionRecommendations |
      | Bacterial Infection Assessment | Disposition Recommendations |

  Scenario Outline: Open Admission Recommendations page
    Given I should on Page Disposition Recommendations with "<dispositionRecommendations>" title
    When I click on question1 yes button
    And I click on question2 yes button
    When I click on question3 yes button
    And I click on question4 yes button
    When I click on Proceed to Hospital Admission Recommendations button
    Then I should on Page Admission Recommendations with "<admissionRecommendations>" title
    Examples:
      | admissionRecommendations |dispositionRecommendations|
      |  Admission Recommendations |Disposition Recommendations |

  Scenario Outline: Open High-Risk Recommendations page
    Given I should on Page Admission Recommendations with "<admissionRecommendations>" title
    When I click back
    And I click on no button
    When I click on Proceed to High-Risk Recommendations button
    Then I should on Page High Risk Recommendations with "<highRiskRecommendations>" title
    Examples:
      | highRiskRecommendations |admissionRecommendations|
      | High Risk Recommendations |  Admission Recommendations |

  Scenario Outline: Open Disposition Recommendations page
    Given I should on Page High Risk Recommendations with "<highRiskRecommendations>" title
    When I click on next button
    Then I should on Page Disposition Recommendations with "<dispositionRecommendations>" title
    Examples:
      |dispositionRecommendations|highRiskRecommendations|
      |Disposition Recommendations |High Risk Recommendations |

  Scenario Outline: Open Admission Recommendations page
    Given I should on Page Disposition Recommendations with "<dispositionRecommendations>" title
    When I click on question1 yes button
    And I click on question2 yes button
    When I click on Proceed to Hospital Admission Recommendations button
    Then I should on Page Admission Recommendations with "<admissionRecommendations>" title
    Examples:
      | admissionRecommendations |dispositionRecommendations|
      |  Admission Recommendations |Disposition Recommendations |

  Scenario Outline: Restart GuideLines
    Given I should on Page Admission Recommendations with "<admissionRecommendations>" title
    When I click on Restart Guideline button
    Then I should be on febrile infant page with title"<febrileInfant>"

    Examples:
      | admissionRecommendations | febrileInfant |
      |  Admission Recommendations | Febrile Infant |
