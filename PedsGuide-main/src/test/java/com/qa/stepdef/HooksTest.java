package com.qa.stepdef;

import com.qa.utils.DriverManagerTest;
import com.qa.utils.VideoManagerTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

import java.io.IOException;



public class HooksTest {

    @Before
    public void initialize() {
        new VideoManagerTest().startRecording();
    }

    @After
    public void quit(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            byte[] screenshot = new DriverManagerTest().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        new VideoManagerTest().stopRecording(scenario.getName());
    }
}
