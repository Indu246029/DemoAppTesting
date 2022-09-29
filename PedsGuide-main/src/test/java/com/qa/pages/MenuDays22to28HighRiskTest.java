package com.qa.pages;

import com.microsoft.appcenter.appium.Factory;
import com.qa.core.BasePageTest;
import com.qa.utils.TestUtilsTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestWatcher;

public class MenuDays22to28HighRiskTest extends BasePageTest {

    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    TestUtilsTest utils = new TestUtilsTest();


    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"22-28Days\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"22 - 28 Days\"]")
    public MobileElement menu22to28days;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Evaluation for Infants 22-28 Days Old']")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeStaticText[@name=\"Evaluation for Infants 22-28 Days Old\"]")
    private MobileElement page1title;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"DiagnosticTests\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Diagnostic Tests\"])[2]")
    private MobileElement diagnosticBtn;


    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"ProceedtoHSVRiskAssessment\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Proceed to HSV Risk Assessment\"])[2]")
    private  MobileElement hsvRiskAssBtn;


    @AndroidFindBy (xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")
    @iOSXCUITFindBy (xpath = "//XCUIElementTypeOther[@name=\"Maternal history of HSV lesions or fever from 48 hours before delivery to 48 hours after delivery?\"]/XCUIElementTypeOther")
    private  MobileElement checkboxCheck;

    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"HSVHighRiskRecommendations\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"HSV High Risk Recommendations\"])[2]")
    private  MobileElement hsvHighRiskAssBtn;


    @AndroidFindBy (xpath = "//android.widget.TextView[@content-desc=\"RestartGuideline\"]")
    @iOSXCUITFindBy (xpath = "(//XCUIElementTypeOther[@name=\"Restart Guideline\"])[2]")
    private  MobileElement restartGuidelineBtn;




    public void clickMenu()
    {
        click(menu22to28days,"Click menu 22 to 28 Days");
    }

    public void setPage1title()
    {

        String title = page1title.getText();
        Assert.assertEquals(title,"Evaluation for Infants 22-28 Days Old");

    }

    public void setDiagnosticBtn()
    {
        click(diagnosticBtn,"Click on button Diagnostic Tests");
    }

    public void setHsvRiskAssBtn()
    {
        click(hsvRiskAssBtn,"Click in button Proceed to HSV Risk Assessment");
    }


    public void setCheckboxCheck1()
    {

        click(checkboxCheck,"Checkbox check-in");
    }

    public void setHsvHighRiskAssBtn() throws InterruptedException {

        Thread.sleep(100);
        click(hsvHighRiskAssBtn,"HSV High Risk Assessment button click");
    }

    public void setRestartGuidelineBtn()
    {

        click(restartGuidelineBtn,"Restart Guideline button click");
    }



}
