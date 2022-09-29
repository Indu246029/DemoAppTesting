
  Feature: To Verify 22-28 Days High Risk Flow


      Scenario Outline: To verify on click menu 22-28 days
        When I click on menu
        Then I should redirect to menu page
        Examples:
          |  |
          |  |

        Scenario Outline: To verify page title and Diagnostic Tests button click
          When The page title is "<title>"
          And I click button DiagnosticTest
          Then I should redirect to Diagnostic Tests page
          Examples:
            |title|
            |Evaluation for Infants 22-28 Days Old|

    Scenario Outline: To verify page title and HSV Risk Assessment button click
      When The diagnostic page title is "<diagnostic tests>"
      And I click on button Proceed to HSV Risk Assessment
      Then I should redirect HSV Checklist page
      Examples:
        |diagnostic tests|
        |Diagnostic Tests|

    Scenario Outline: To verify Page title and Proceed To HSV High Risk Assessment button click
      When The HSV Checklist page title is "<hSV checklist>"
      And I Check-in checkbox for HSV Checklist
      Then It should display button HSV High Risk Assessment
      When I click on button HSV High Risk Assessment
      Then I should redirect to Restart Guideline page
      Examples:
        |hSV checklist | |
        |HSV Checklist | |

    Scenario Outline: To verify page title and Restart Guideline button click
      When The page title "<full sepsis evaluation and admission recommendations>"
      And I click on button Restart Guideline
      Then I should redirect Home page
      Examples:
        |full sepsis evaluation and admission recommendations |
        |Full Sepsis Evaluation and Admission Recommendations |
