package com.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.IOException;
import java.net.URL;

public class DriverManagerTest {
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    TestUtilsTest utils = new TestUtilsTest();

    public AppiumDriver getDriver(){
        return driver.get();
    }

    public void setDriver(AppiumDriver driver2){
        driver.set(driver2);
    }

    public void initializeDriver() throws Exception {
        AppiumDriver driver = null;
        GlobalParamsTest params = new GlobalParamsTest();
        PropertyManagerTest props = new PropertyManagerTest();

        if(driver == null){
            try{
                utils.log().info("initializing Appium driver");
                switch(params.getPlatformName()){
                    case "Android":
                        driver = new AndroidDriver(new URL(props.getProps().getProperty("appiumURL")), new CapabilitiesManagerTest().getCaps());
                        break;
                    case "iOS":
                        driver = new IOSDriver(new URL(props.getProps().getProperty("appiumURL")), new CapabilitiesManagerTest().getCaps());
                        break;
                }
                if(driver == null){
                    throw new Exception("driver is null. ABORT!!!");
                }
                utils.log().info("Driver is initialized");
                this.driver.set(driver);
            } catch (IOException e) {
                e.printStackTrace();
                utils.log().fatal("Driver initialization failure. ABORT !!!!" + e.toString());
                throw e;
            }
        }

    }

}
