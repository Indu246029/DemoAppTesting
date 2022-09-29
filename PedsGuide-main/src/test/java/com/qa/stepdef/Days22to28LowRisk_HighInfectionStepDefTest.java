package com.qa.stepdef;

import com.qa.core.BaseTest;
import com.qa.pages.MenuDays22to28HighRiskTest;
import com.qa.pages.MenuDays22to28LowRisk_HighInfection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Days22to28LowRisk_HighInfectionStepDefTest {

    @When("I click on the menu")
    public void iClickOnTheMenu() {

        new MenuDays22to28HighRiskTest().clickMenu();
    }

    @Then("I should redirect to the menu page")
    public void iShouldRedirectToTheMenuPage() {

    }

    @When("^The Page title \"([^\"]*)\"$")
    public void thePageTitle(String title) {

    }

    @And("I click on button DiagnosticTest")
    public void iClickOnButtonDiagnosticTest() {

        new MenuDays22to28HighRiskTest().setDiagnosticBtn();
    }

    @Then("I should redirect to the Diagnostic Tests page")
    public void iShouldRedirectToTheDiagnosticTestsPage() {

    }

    @When("^The diagnostic page title \"([^\"]*)\"$")
    public void theDiagnosticPageTitle(String title) throws InterruptedException {
        Assert.assertEquals((new BaseTest()).getTitle(title), title);
    }

    @And("I click on the button Proceed o HSV Risk Assessment")
    public void iClickOnTheButtonProceedOHSVRiskAssessment() {

        new MenuDays22to28HighRiskTest().setHsvRiskAssBtn();
    }

    @Then("I should redirect to the HSV Checklist page")
    public void iShouldRedirectToTheHSVChecklistPage() {

    }

    @When("^The hsv checklist page title\"([^\"]*)\"$")
    public void theHsvChecklistPageTitle(String title) throws InterruptedException {
        Assert.assertEquals((new BaseTest()).getTitle(title), title);

    }

    @Then("It should display the button HSV High Risk Assessment")
    public void itShouldDisplayTheButtonHSVHighRiskAssessment() {

    }

    @When("^I click on button HSV Low Risk Assessment$")
    public void iClickOnButtonHSVLowRiskAssessment() {
        new MenuDays22to28LowRisk_HighInfection().setHsvLowRecommendationBtn();

    }

    @Then("I should redirect to HSV Low Recommendations Page")
    public void iShouldRedirectToHSVLowRecommendationsPage() {
    }
    @When("^The hsv low risk page title\"([^\"]*)\"$")
    public void theHsvLowRiskPageTitle(String title) throws InterruptedException {
        Assert.assertEquals((new BaseTest()).getTitle(title), title);
    }

    @And("I click on button Proceed To Bacterial Infection Risk Assessment")
    public void iClickOnButtonProceedToBacterialInfectionRiskAssessment() {

        new MenuDays22to28LowRisk_HighInfection().setBacterialRiskInfectionBtn();
    }

    @Then("I should redirect to Bacterial Infection Assessment Page")
    public void iShouldRedirectToBacterialInfectionAssessmentPage() {
    }

    @When("^The bacterial infection page title\"([^\"]*)\"$")
    public void theBacterialInfectionPageTitle(String title) throws InterruptedException {

        Assert.assertEquals((new BaseTest()).getTitle(title), title);

    }

    @And("Check in the checkbox")
    public void checkInTheCheckbox() {
        new MenuDays22to28LowRisk_HighInfection().setCheckboxCheck();
    }

    @Then("I should display button High Risk Recommendations")
    public void iShouldDisplayButtonHighRiskRecommendations() {
    }

    @And("I click on button High Risk Recommendations")
    public void iClickOnButtonHighRiskRecommendations() {

        new MenuDays22to28LowRisk_HighInfection().setHighRiskRecommendationBtn();
    }

    @Then("I should redirect to High Risk Recommendations Page")
    public void iShouldRedirectToHighRiskRecommendationsPage() {
    }

    @When("^The page disposition recommendation title\"([^\"]*)\"$")
    public void thePageDispositionRecommendationTitle(String title) throws InterruptedException {
        Assert.assertEquals((new BaseTest()).getTitle(title), title);
    }

    @And("I click on button Disposition Recommendations")
    public void iClickOnButtonDispositionRecommendations() {

        new MenuDays22to28LowRisk_HighInfection().setDispositionRecommendationBtn();
    }

    @Then("I should redirect to Disposition Recommendations Page")
    public void iShouldRedirectToDispositionRecommendationsPage() {

    }


    @When("I click obtained urinalysis positive? Yes")
    public void iClickObtainedUrinalysisPositiveYes() {
        new MenuDays22to28LowRisk_HighInfection().setUrinalysisPYes();
    }

    @And("I click Was CSF obtained? Yes")
    public void iClickWasCSFObtainedYes() {
        new MenuDays22to28LowRisk_HighInfection().setCsfYes();
    }

    @And("I click Was LP traumatic or is CSF pleocytosis present? Yes")
    public void iClickWasLPTraumaticOrIsCSFPleocytosisPresentYes() {
        new MenuDays22to28LowRisk_HighInfection().setLporcsfYes();
    }

    @Then("I should display button Admission Recommendation")
    public void iShouldDisplayButtonAdmissionRecommendation() {
    }

    @And("On Click button Admission Recommendation")
    public void onClickButtonAdmissionRecommendation() {

    }

    @Then("It should redirect to Admission Recommendation Page")
    public void itShouldRedirectToAdmissionRecommendationPage() {
    }

    @When("I click obtained Urinalysis positive? as Yes")
    public void iClickObtainedUrinalysisPositiveAsYes() throws InterruptedException {

        Thread.sleep(100);
        new MenuDays22to28LowRisk_HighInfection().setUrinalysisPYes();
    }

    @And("I click Was CSF Obtained? as Yes")
    public void iClickWasCSFObtainedAsYes() {
        new MenuDays22to28LowRisk_HighInfection().setCsfYes();
    }

    @And("I click Was LP traumatic or is CSF pleocytosis present? as No")
    public void iClickWasLPTraumaticOrIsCSFPleocytosisPresentAsNo() {

        new MenuDays22to28LowRisk_HighInfection().setLporcsfNo();
    }

    @Then("I should display the button Admission Recommendation")
    public void iShouldDisplayTheButtonAdmissionRecommendation() {


    }

    @When("I click obtained Urinalysis positive as YES")
    public void iClickObtainedUrinalysisPositiveAsYES() {
        new MenuDays22to28LowRisk_HighInfection().setUrinalysisPYes();
    }

    @And("I click Was CSF Obtained? as NO")
    public void iClickWasCSFObtainedAsNO() {

        new MenuDays22to28LowRisk_HighInfection().setCsfNo();
    }

    @Then("I should display Admission Recommendation button")
    public void iShouldDisplayAdmissionRecommendationButton() {
    }


    @When("I click obtained urinalysis positive? No")
    public void iClickObtainedUrinalysisPositiveNo() {

        new MenuDays22to28LowRisk_HighInfection().setUrinalysisPNo();
    }

    @And("I click Was CSF obtained? YES")
    public void iClickWasCSFObtainedYES() {

        new MenuDays22to28LowRisk_HighInfection().setCsfYes();
    }

    @And("I click Was LP traumatic or is CSF pleocytosis present? YES")
    public void iClickWasLPTraumaticOrIsCSFPleocytosisPresentYES() {
        new MenuDays22to28LowRisk_HighInfection().setLporcsfYes();


    }

    @When("I click obtained urinalysis positive? NO")
    public void iClickObtainedUrinalysisPositiveNO() {

        new MenuDays22to28LowRisk_HighInfection().setUrinalysisPNo();
    }

    @And("I click on Was CSF obtained? YES")
    public void iClickOnWasCSFObtainedYES() {
        new MenuDays22to28LowRisk_HighInfection().setCsfYes();
    }

    @And("I click Was LP traumatic or is CSF pleocytosis present No")
    public void iClickWasLPTraumaticOrIsCSFPleocytosisPresentNo() {
        new MenuDays22to28LowRisk_HighInfection().setLporcsfNo();
    }

    @And("I click Will Patient Observation Home Yes")
    public void iClickWillPatientObservationHomeYes() {
        new MenuDays22to28LowRisk_HighInfection().setPatientOYes();
    }

    @Then("I should display button Discharge Checklist button")
    public void iShouldDisplayButtonDischargeChecklistButton() {



    }
    @When("On click Discharge Checklist button it should redirect to Discharge Checklist Page")
    public void onClickDischargeChecklistButtonItShouldRedirectToDischargeChecklistPage() {

        new MenuDays22to28LowRisk_HighInfection().setDischargeChecklistBtn();
    }

    @Then("Click Checkbox")
    public void clickCheckbox() {

        new MenuDays22to28LowRisk_HighInfection().setDischargeCheckbox();
    }

    @Then("Click button Proceed To Hospital Admission Recommendation")
    public void clickButtonProceedToHospitalAdmissionRecommendation() {
        new MenuDays22to28LowRisk_HighInfection().setHospitalAdmissionBtn();
    }

    @Then("Click Back")
    public void clickBack() {

        new FebrileInfantStepDefTest().iClickBack();

    }

    @When("I click on obtained urinalysis positive? NO")
    public void iClickOnObtainedUrinalysisPositiveNO() {
        new MenuDays22to28LowRisk_HighInfection().setUrinalysisPNo();
    }

    @And("I click on Was CSF obtained? Yes")
    public void iClickOnWasCSFObtainedYes() {
        new MenuDays22to28LowRisk_HighInfection().setCsfYes();
    }

    @And("I click on Was LP traumatic or is CSF pleocytosis present No")
    public void iClickOnWasLPTraumaticOrIsCSFPleocytosisPresentNo() {
        new MenuDays22to28LowRisk_HighInfection().setLporcsfNo();
    }

    @And("I click Will Patient Observation Home No")
    public void iClickWillPatientObservationHomeNo() {
        new MenuDays22to28LowRisk_HighInfection().setPatientONo();
    }

    @Then("I should display button Discharge Checklist Admission Recommendation button")
    public void iShouldDisplayButtonDischargeChecklistAdmissionRecommendationButton() {


    }

    @When("On click Admission Recommendation button it should redirect to  Admission Recommendation Page")
    public void onClickAdmissionRecommendationButtonItShouldRedirectToAdmissionRecommendationPage() {
        new MenuDays22to28LowRisk_HighInfection().setAdmissionRBtn();
    }

    @When("On click Restart Guideline button")
    public void onClickRestartGuidelineButton() {

        new MenuDays22to28HighRiskTest().setRestartGuidelineBtn();

    }
    @Then("It should redirect to the HomePage")
    public void itShouldRedirectToTheHomePage() {
    }


    @And("Click all checkbox")
    public void clickAllCheckbox() {
        new MenuDays22to28LowRisk_HighInfection().setAllCheckboxClick();

    }
}
