@test
Feature:To verify Home Page

  Scenario Outline: To verify Tracheostomy menu click
    When I click on menu "<Tracheostomy Menu>"
    Then It should open popup model and i click button "<accept>"
    Then I should redirect to Tracheostomy Emergency Airway Management page

    Examples:
      | Tracheostomy Menu | accept |
      | Tracheostomy Emergency Airway Management | I Accept |