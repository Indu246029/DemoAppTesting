@test
Feature: To Verify 22-28 Days Low Risk and Low Bacterial Infection Flow

  Scenario Outline: To verify on click menu 22-28 days
    When I click on the menu
    Then I should redirect to the menu page
    Examples:
      |  |
      |  |

  Scenario Outline: To verify page title and Diagnostic Tests button click
    When The page title "<title>"
    And I click on button DiagnosticTest
    Then I should redirect to the Diagnostic Tests page
    Examples:
      |title  |
      |Evaluation for Infants 22-28 Days Old |

  Scenario Outline: To verify page title and HSV Risk Assessment button click
    When The diagnostic page title "<diagnostic tests>"
    And I click on button Proceed to HSV Risk Assessment
    Then I should redirect HSV Checklist page
    Examples:
      |diagnostic tests|
      |Diagnostic Tests|

  Scenario Outline: Page title and Proceed To HSV High Low  button click
    When The hsv checklist page title"<hSV checklist>"
    And I click on button HSV Low Risk Assessment
    Then I should redirect to HSV Low Recommendations Page
    Examples:
      |hSV checklist |
      |HSV Checklist |

  Scenario Outline: Page title and Proceed To Bacterial Infection Risk Assessment button click
    When The hsv low risk page title"<hSV low risk recommendations>"
    And  I click on button Proceed To Bacterial Infection Risk Assessment
    Then I should redirect to Bacterial Infection Assessment Page
    Examples:
      |hSV low risk recommendations | |
      |HSV Low Risk Recommendations | |


  Scenario Outline: Page title and Low Risk Bacterial Infection Recommendations button click
    When The bacterial infection page title"<title>"
    And  I click on the button Low Risk Bacterial Infection Recommendations
    Then I should redirect to the Disposition Recommendations Page
    Examples:
      |title | |
      |Bacterial Infection Assessment | |

  Scenario Outline: To verify LP Performed:Yes, CSF:Yes, LPorCSF:Yes
    When I Click LP Performed Yes
    And  I click CSF Obtained No
    And I click LPorCSF Yes
    Then I should displayed button Admission Recommendation
    Examples:
      | | |
      | | |

  Scenario Outline: To verify LP Performed:Yes, CSF:Yes, LPorCSF:No and Patient Observation:Yes
    When I Click LP Performed Yes
    And  I click CSF Obtained No
    And I click LPorCSF No
    And I click PatientObservation Yes
    Then I should displayed button Discharge Checklist
    And On click Discharge Checklist
    Then I should redirect to Proceed To Hospital Admission Page
    Examples:
      | | |
      | | |

  Scenario Outline: To verify Discharge Checklist Checkbox
    When I am on Discharge Checklist
    And  I click Single checkbox
    Then I should displayed button Proceed to Hospital Admission button
    And I click  Proceed to Hospital Admission button
    Then It should redirect to Admission Recommendation
    Then I click on back
    And I click on all checkbox
    Then I should display Restart Guildeline button
    And Click Back

    Examples:
      | | |
      | | |

  Scenario Outline: To verify LP Performed:Yes, CSF:Yes, LPorCSF:No and Patient Observation:No
    When I Click on LP Performed Yes
    And  I click on CSF Obtained Yes
    And I click on LPorCSF No
    And I click PatientObservation No
    Then I should displayed button Admission Recommendation
    And On Click on button Admission Recommendation
    Then I should redirect to Admission Recommendations Page
    And Click on Back
    Examples:
      | | |
      | | |

  Scenario Outline: To verify LP Performed:Yes, CSF:No
    When I Click LP Performed as Yes
    And  I click CSF Obtained as No
    Then I should displayed button Admission Recommendation
    Then On Click on the button Admission Recommendation
    Then Click Back button
    Examples:
      | | |
      | | |

  Scenario Outline: To verify LP Performed:No
    When I Click LP Performed as No
    Then I should displayed button Admission Recommendation
    And I click on Admission Recommendations button
    And I click on the Restart Guideline button
    Examples:
      | | |
      | | |

