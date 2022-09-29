package com.qa.pages;

import com.microsoft.appcenter.appium.Factory;
import com.qa.core.BasePageTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Rule;
import org.junit.rules.TestWatcher;

public class MenuDays22to28LowRisk_LowInfection extends BasePageTest {

    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"LowRiskforBacterialInfectionRecommendations\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Low Risk for Bacterial Infection Recommendations\"])[2]")
    private MobileElement lowRiskBacteriaBtn;

    @AndroidFindBy(xpath = "(//*[@text=\"Yes\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[1]")
    private MobileElement LPYes;

    @AndroidFindBy(xpath = "(//*[@text=\"No\"])[1]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[1]")
    private MobileElement LPNo;

    @AndroidFindBy(xpath = "(//*[@text=\"Yes\"])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[2]")
    private MobileElement CSFYes;


    @AndroidFindBy(xpath = "(//*[@text=\"No\"])[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[2]")
    private MobileElement CSFNo;

    @AndroidFindBy(xpath = "(//*[@text=\"Yes\"])[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[3]")
    private MobileElement LPorCSFYes1;

    @AndroidFindBy(xpath = "(//*[@text=\"No\"])[3]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[3]")
    private MobileElement LPorCSFNo1;

    @AndroidFindBy(xpath = "(//*[@text=\"Yes\"])[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Yes\"])[4]")
    private MobileElement PatientOYes;

    @AndroidFindBy(xpath = "(//*[@text=\"No\"])[4]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"No\"])[4]")
    private MobileElement PatientONo;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Are the parents comfortable with monitoring their child at home?\"]/XCUIElementTypeOther")
    private MobileElement checkbox1;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Do the parents have reliable means of receiving communication from the hospital/ED?\"]/XCUIElementTypeOther")
    private MobileElement checkbox2;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Can bacterial culture results be followed daily by the hospital/ED?\"]/XCUIElementTypeOther")
    private MobileElement checkbox3;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.ImageView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Can the patient follow-up with their PCP in 24H?\"]/XCUIElementTypeOther")
    private MobileElement checkbox4;

    public void setLowRiskBacteriaBtn()
    {
        click(lowRiskBacteriaBtn);
    }

    public void setCSFYes()
    {
        click(CSFYes);
    }

    public void setCSFNo()
    {
        click(CSFNo);
    }

    public void setLPYes()
    {
        click(LPYes);

    }
    public void setLPNo()
    {
        click(LPNo);
    }

    public void setLPorCSFYes1()
    {
        click(LPorCSFYes1);

    }

    public void setLPorCSFNo1()
    {
        click(LPorCSFNo1);
    }

    public void setPatientOYes()
    {
        click(PatientOYes);

    }
    public void setPatientONo()
    {
        click(PatientONo);
    }

    public void setCheckbox1()
    {
        click(checkbox1);
    }

    public void setCheckbox2()
    {
        click(checkbox2);
    }

    public void setCheckbox3()
    {
        click(checkbox3);
    }

    public void setCheckbox4()
    {
        click(checkbox4);
    }
}
