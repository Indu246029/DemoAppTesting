package com.qa.pages;

import com.microsoft.appcenter.appium.Factory;
import com.qa.core.BasePageTest;
import com.qa.utils.TestUtilsTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.junit.Rule;
import org.junit.rules.TestWatcher;

public class HomePageTest extends BasePageTest {
    @Rule
    public TestWatcher watcher = Factory.createWatcher();
    TestUtilsTest utils = new TestUtilsTest();

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"FebrileInfant_btn_title\"]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Febrile Infant Infant Sepsis Evaluation and Risk Stratification\"])[2]")
    private MobileElement febrileInfantTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"module_logo_txt\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"module_logo_txt\"]")
    private MobileElement tabPageTitle;


    public void clickOnFebrileInfant() throws Exception {
        click(scrollToElement(febrileInfantTab,"click on Febrile Infant Tab"));
    }
    public String getTitle(){
        waitForVisibility(tabPageTitle);
        return getText(tabPageTitle, "title");
    }

}
