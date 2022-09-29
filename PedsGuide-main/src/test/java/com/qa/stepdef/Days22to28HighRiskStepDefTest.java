package com.qa.stepdef;

import com.qa.core.BaseTest;
import com.qa.pages.MenuDays22to28HighRiskTest;
import com.qa.pages.MenuDays22to28LowRisk_HighInfection;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Days22to28HighRiskStepDefTest {


    @When("I click on menu")
    public void iClickOnMenu() {
        new MenuDays22to28HighRiskTest().clickMenu();
    }

    @Then("I should redirect to menu page")
    public void iShouldRedirectToMenuPage() {
    }

    @When("^The page title is \"([^\"]*)\"$")
    public void thePageTitleIs(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @And("I click button DiagnosticTest")
    public void iClickButtonDiagnosticTest() {
        new MenuDays22to28HighRiskTest().setDiagnosticBtn();
    }

    @Then("I should redirect to Diagnostic Tests page")
    public void iShouldRedirectToDiagnosticTestsPage() {
    }

    @When("^The diagnostic page title is \"([^\"]*)\"$")
    public void theDiagnosticPageTitleIs(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @And("I click on button Proceed to HSV Risk Assessment")
    public void iClickOnButtonProceedToHSVRiskAssessment() {
        new MenuDays22to28HighRiskTest().setHsvRiskAssBtn();

    }

    @Then("I should redirect HSV Checklist page")
    public void iShouldRedirectHSVChecklistPage() {


    }
    @When("^The HSV Checklist page title is \"([^\"]*)\"$")
    public void theHSVChecklistPageTitleIs(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @And("I Check-in checkbox for HSV Checklist")
    public void iCheckInCheckboxForHSVChecklist() {
        new MenuDays22to28LowRisk_HighInfection().setCheckboxCheck();
    }


    @Then("It should display button HSV High Risk Assessment")
    public void itShouldDisplayButtonHSVHighRiskAssessment() {

    }

    @When("I click on button HSV High Risk Assessment")
    public void iClickOnButtonHSVHighRiskAssessment() throws InterruptedException {
        new MenuDays22to28HighRiskTest().setHsvHighRiskAssBtn();
    }

    @Then("I should redirect to Restart Guideline page")
    public void iShouldRedirectToRestartGuidelinePage() {

    }


    @When("^The page title \"([^\"]*)\"$")
    public void thePageTitle(String title) throws InterruptedException {
        Assert.assertEquals(new BaseTest().getTitle(title),title);
    }

    @And("I click on button Restart Guideline")
    public void iClickOnButtonRestartGuideline() {
        new MenuDays22to28HighRiskTest().setRestartGuidelineBtn();
    }

    @Then("I should redirect Home page")
    public void iShouldRedirectHomePage() {
    }



}
