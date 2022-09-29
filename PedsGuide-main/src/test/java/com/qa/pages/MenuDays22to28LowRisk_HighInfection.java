package com.qa.pages;

import com.microsoft.appcenter.appium.Factory;
import com.qa.core.BasePageTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Rule;
import org.junit.rules.TestWatcher;

public class MenuDays22to28LowRisk_HighInfection extends BasePageTest {

    @Rule
    public TestWatcher watcher = Factory.createWatcher();

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"HSVLowRiskRecommendations\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Low Risk Recommendations\"]")
    private MobileElement hsvLowRiskRecommendationBtn;


    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"ProceedtoBacterialInfectionRiskAssessment\"]")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Bacterial Infection Assesment\"]")
    private MobileElement bacterialRiskInfectionBtn;


    @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Historical or Documented Fever > 38.5C (101.3F)\"]/XCUIElementTypeOther")
    private MobileElement bacterialInfectionCheckbox;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"HighRiskRecommendations\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"High Risk Recommendations\"])[2]")
    private MobileElement highRiskRecommendationBtn;


    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"DispositionRecommendations\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Disposition Recommendations\"])[2]")
    private MobileElement dispositionRecommendationBtn;


    @AndroidFindBy (xpath = "(//*[@text=\"Yes\"])[1]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[1]")
    private MobileElement urinalysisPYes;

    @AndroidFindBy (xpath = "(//*[@text=\"No\"])[1]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"No\"])[1]")
    private MobileElement urinalysisPNo;

    @AndroidFindBy (xpath = "(//*[@text=\"Yes\"])[2]")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Yes\"][2]")
    private MobileElement csfYes;

    @AndroidFindBy (xpath = "(//*[@text=\"No\"])[2]")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"No\"][2]")
    private MobileElement csfNo;

    @AndroidFindBy (xpath = "(//*[@text=\"Yes\"])[3]")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Yes\"][3]")
    private MobileElement lporcsfYes;

    @AndroidFindBy (xpath = "(//*[@text=\"No\"])[3]")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"No\"][3]")
    private MobileElement lporcsfNo;

    @AndroidFindBy (xpath = "(//*[@text=\"Yes\"])[4]")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Yes\"][4]")
    private  MobileElement patientOYes;

    @AndroidFindBy (xpath = "(//*[@text=\"No\"])[4]")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"No\"][4]")
    private  MobileElement patientONo;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"AdmissionRecommendations\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Admission Recommendations\"])[2]")
    private MobileElement admissionRBtn;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"DischargeChecklist\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Discharge Checklist\"])[2]")
    private MobileElement dischargeChecklistBtn;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"go_back_btn\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"BACK\"])[2]")
    private MobileElement backBtn;

    @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Are the parents comfortable with monitoring their child at home?\"]/XCUIElementTypeOther")
    private MobileElement dischargeCheckbox1;

    @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Do the parents have reliable means of receiving communication from the hospital/ED?\"]/XCUIElementTypeOther")
    private MobileElement dischargeCheckbox2;

    @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Can bacterial culture results be followed daily by the hospital/ED?\"]/XCUIElementTypeOther")
    private MobileElement dischargeCheckbox3;

    @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Can the patient follow-up with their PCP in 24H?\"]/XCUIElementTypeOther")
    private MobileElement dischargeCheckbox4;
    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"ProceedtoHospitalAdmissionRecommendations\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Proceed to Hospital Admission Recommendations\"])[2]")
    private MobileElement hospitalAdmissionBtn;

    //Low Risk-High Bacterial Infection Flow

    public void setHsvLowRecommendationBtn()
    {
        click(hsvLowRiskRecommendationBtn,"Click HSV Low Risk Recommendations");
    }

    public void setBacterialRiskInfectionBtn()
    {
        click(bacterialRiskInfectionBtn,"Click button Proceed to Bacterial Infection Risk Assessment");
    }


    public void setCheckboxCheck()
    {
        click(bacterialInfectionCheckbox,"Click Checkbox");
    }

    public void setHighRiskRecommendationBtn()
    {
        click(highRiskRecommendationBtn,"High Risk Recommendations");
    }

    public void setDispositionRecommendationBtn()
    {
        click(dispositionRecommendationBtn,"Disposition Recommendations button click");

    }

    public void setUrinalysisPYes()
    {
        click(urinalysisPYes,"Click Urinalysis Positive : Yes");
    }

    public void setUrinalysisPNo()
    {

        click(urinalysisPNo,"Click Urinalysis Positive : No");

    }

    public void setCsfYes()
    {
        click(csfYes,"Click CSF Obtained : Yes");
    }
    public void setCsfNo()
    {
        click(csfNo,"Click CSF Obtained : No");
    }
    public void setLporcsfYes()
    {
        click(lporcsfYes,"Click LP or CSF Obtained : Yes");
    }

    public void setLporcsfNo()
    {
        click(lporcsfNo,"Click LP or CSF Obtained : No");
    }

    public void setPatientOYes()
    {
        click(patientOYes,"Click Patient Observation Yes");
    }

    public void setPatientONo()
    {
        click(patientONo,"Patient Observation No");
    }

    public void setAdmissionRBtn()
    {
        click(admissionRBtn,"Click Admission Recommendation button");
    }


    public  void setBackBtn()
    {
        click(backBtn);
    }
    public void setDischargeChecklistBtn()
    {
        click(dischargeChecklistBtn);
    }

    public void setDischargeCheckbox()
    {
        click(dischargeCheckbox1);
    }

    public void setAllCheckboxClick()
    {
        click(dischargeCheckbox1);
        click(dischargeCheckbox2);
        click(dischargeCheckbox3);
        click(dischargeCheckbox4);
    }

    public void setHospitalAdmissionBtn()
    {
        click(hospitalAdmissionBtn);
    }

}
