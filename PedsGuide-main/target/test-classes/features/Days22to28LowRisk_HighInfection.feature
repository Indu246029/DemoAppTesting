Feature: To Verify 22-28 Days Low Risk and High Bacterial Infection Flow

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

  Scenario Outline: Page title and Proceed To High Risk Assessment button click
    When The bacterial infection page title"<bacterial infection assessment>"
    And  Check in the checkbox
    Then I should display button High Risk Recommendations
    And  I click on button High Risk Recommendations
    Then I should redirect to High Risk Recommendations Page
    Examples:
      |bacterial infection assessment | |
      |Bacterial Infection Assessment | |

  Scenario Outline: Page title and Disposition Recommendations button click
    When The page disposition recommendation title"<high risk recommendations>"
    And  I click on button Disposition Recommendations
    Then I should redirect to Disposition Recommendations Page
    Examples:
      |high risk recommendations | |
      |High Risk Recommendations | |

  Scenario Outline: To verify UrinalysisPositive:Yes, CSF:Yes and LPorCSF:Yes
    When I click obtained urinalysis positive? Yes
    And  I click Was CSF obtained? Yes
    And I click Was LP traumatic or is CSF pleocytosis present? Yes
    Then I should display button Admission Recommendation
    Examples:
      | | |
      | | |

  Scenario Outline: To verify UrinalysisPositive:Yes, CSF:Yes and LPorCSF:No
    When I click obtained Urinalysis positive? as Yes
    And  I click Was CSF Obtained? as Yes
    And I click Was LP traumatic or is CSF pleocytosis present? as No
    Then I should display the button Admission Recommendation
    Examples:
      | | |
      | | |

  Scenario Outline: To verify UrinalysisPositive:Yes, CSF:No
    When I click obtained Urinalysis positive as YES
    And  I click Was CSF Obtained? as NO
    Then I should display Admission Recommendation button
    Examples:
      | | |
      | | |

  Scenario Outline: To verify UrinalysisPositive:No, CSF:Yes and LPorCSF:Yes
    When I click obtained urinalysis positive? No
    And  I click Was CSF obtained? YES
    And I click Was LP traumatic or is CSF pleocytosis present? YES
    Then I should display button Admission Recommendation

    Examples:
      | | |
      | | |

  Scenario Outline: To verify UrinalysisPositive:No, CSF:Yes, LPorCSF:No and Patient Observation:Yes
    When I click obtained urinalysis positive? NO
    And  I click on Was CSF obtained? YES
    And I click Was LP traumatic or is CSF pleocytosis present No
    And  I click Will Patient Observation Home Yes
    Then I should display button Discharge Checklist button
    When On click Discharge Checklist button it should redirect to Discharge Checklist Page
    Then Click Checkbox
    Then Click button Proceed To Hospital Admission Recommendation
    Then Click Back
    And Click all checkbox
    Then Click Back
    Examples:
      | | |
      | | |


  Scenario Outline: To verify UrinalysisPositive:No, CSF:Yes, LPorCSF:No and Patient Observation:No
    When I click on obtained urinalysis positive? NO
    And  I click on Was CSF obtained? Yes
    And I click on Was LP traumatic or is CSF pleocytosis present No
    And  I click Will Patient Observation Home No
    Then I should display button Discharge Checklist Admission Recommendation button
    When On click Admission Recommendation button it should redirect to  Admission Recommendation Page
    When On click Restart Guideline button
    Then It should redirect to the HomePage
    Examples:
      |  |
      |  |