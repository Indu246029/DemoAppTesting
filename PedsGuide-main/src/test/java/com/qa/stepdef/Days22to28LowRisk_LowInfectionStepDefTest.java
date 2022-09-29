package com.qa.stepdef;

import com.qa.core.BasePageTest;
import com.qa.pages.MenuDays22to28HighRiskTest;
import com.qa.pages.MenuDays22to28LowRisk_HighInfection;
import com.qa.pages.MenuDays22to28LowRisk_LowInfection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Days22to28LowRisk_LowInfectionStepDefTest extends BasePageTest {

    @And("I click on the button Low Risk Bacterial Infection Recommendations")
    public void iClickOnTheButtonLowRiskBacterialInfectionRecommendations() {

        new MenuDays22to28LowRisk_LowInfection().setLowRiskBacteriaBtn();
    }

    @Then("I should redirect to the Disposition Recommendations Page")
    public void iShouldRedirectToTheDispositionRecommendationsPage() {


    }

    @When("I Click LP Performed Yes")
    public void iClickLPPerformedYes() {

        new MenuDays22to28LowRisk_LowInfection().setLPYes();
    }

    @And("I click CSF Obtained No")
    public void iClickCSFObtainedNo() {

        new MenuDays22to28LowRisk_LowInfection().setCSFYes();
    }

    @And("I click LPorCSF Yes")
    public void iClickLPorCSFYes() {
        new MenuDays22to28LowRisk_LowInfection().setLPorCSFYes1();
    }

    @Then("I should displayed button Admission Recommendation")
    public void iShouldDisplayedButtonAdmissionRecommendation() {

    }

    @And("I click LPorCSF No")
    public void iClickLPorCSFNo() {

        new MenuDays22to28LowRisk_LowInfection().setLPorCSFNo1();
    }

    @And("I click PatientObservation Yes")
    public void iClickPatientObservationYes() {

        new MenuDays22to28LowRisk_LowInfection().setPatientOYes();
    }

    @Then("I should displayed button Discharge Checklist")
    public void iShouldDisplayedButtonDischargeChecklist() {


    }

    @And("On click Discharge Checklist")
    public void onClickDischargeChecklist() {

        new MenuDays22to28LowRisk_HighInfection().setDischargeChecklistBtn();
    }

    @Then("I should redirect to Proceed To Hospital Admission Page")
    public void iShouldRedirectToProceedToHospitalAdmissionPage() {
    }

    @When("I am on Discharge Checklist")
    public void iAmOnDischargeChecklist() {

    }

    @And("I click Single checkbox")
    public void iClickSingleCheckbox() {

        new MenuDays22to28LowRisk_LowInfection().setCheckbox1();
    }

    @Then("I should displayed button Proceed to Hospital Admission button")
    public void iShouldDisplayedButtonProceedToHospitalAdmissionButton() {
    }

    @And("I click  Proceed to Hospital Admission button")
    public void iClickProceedToHospitalAdmissionButton() {

        new MenuDays22to28LowRisk_HighInfection().setHospitalAdmissionBtn();
    }

    @Then("It should redirect to Admission Recommendation")
    public void itShouldRedirectToAdmissionRecommendation() {
    }

    @Then("I click on back")
    public void iClickOnBack() {

        new MenuDays22to28LowRisk_LowInfection().back();
    }

    @And("I click on all checkbox")
    public void iClickOnAllCheckbox() {
        new MenuDays22to28LowRisk_LowInfection().setCheckbox1();
        new MenuDays22to28LowRisk_LowInfection().setCheckbox2();
        new MenuDays22to28LowRisk_LowInfection().setCheckbox3();
        new MenuDays22to28LowRisk_LowInfection().setCheckbox4();

    }

    @Then("I should display Restart Guildeline button")
    public void iShouldDisplayRestartGuildelineButton() {


    }

    @And("Click on Back")
    public void clickOnBack() {
        new MenuDays22to28LowRisk_LowInfection().back();
    }


    @When("I Click on LP Performed Yes")
    public void iClickOnLPPerformedYes() {

        new MenuDays22to28LowRisk_LowInfection().setLPYes();
    }

    @And("I click on CSF Obtained Yes")
    public void iClickOnCSFObtainedYes() {
        new MenuDays22to28LowRisk_LowInfection().setCSFYes();
    }

    @And("I click on LPorCSF No")
    public void iClickOnLPorCSFNo() {
        new MenuDays22to28LowRisk_LowInfection().setLPorCSFNo1();
    }

    @And("I click PatientObservation No")
    public void iClickPatientObservationNo() {
        new MenuDays22to28LowRisk_LowInfection().setPatientONo();
    }

    @And("On Click on button Admission Recommendation")
    public void onClickOnButtonAdmissionRecommendation() {
        new MenuDays22to28LowRisk_HighInfection().setAdmissionRBtn();
    }

    @Then("I should redirect to Admission Recommendations Page")
    public void iShouldRedirectToAdmissionRecommendationsPage() {
    }

    @When("I Click LP Performed as Yes")
    public void iClickLPPerformedAsYes() {
        new MenuDays22to28LowRisk_LowInfection().setLPYes();
    }

    @And("I click CSF Obtained as No")
    public void iClickCSFObtainedAsNo() {
        new MenuDays22to28LowRisk_LowInfection().setCSFNo();
    }

    @Then("On Click on the button Admission Recommendation")
    public void onClickOnTheButtonAdmissionRecommendation() {
        new MenuDays22to28LowRisk_HighInfection().setAdmissionRBtn();
    }
    @Then("Click Back button")
    public void clickBackButton() {
        new MenuDays22to28LowRisk_LowInfection().back();

    }

    @When("I Click LP Performed as No")
    public void iClickLPPerformedAsNo() {
        new MenuDays22to28LowRisk_LowInfection().setLPNo();
    }

    @And("I click on Admission Recommendations button")
    public void iClickOnAdmissionRecommendationsButton() {
        new MenuDays22to28LowRisk_HighInfection().setAdmissionRBtn();
    }


    @And("I click on the Restart Guideline button")
    public void iClickOnTheRestartGuidelineButton() {
        new MenuDays22to28HighRiskTest().setRestartGuidelineBtn();

    }

}
