package com.qa.runners;

import com.qa.utils.DriverManagerTest;
import com.qa.utils.GlobalParamsTest;
import com.qa.utils.ServerManagerTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.apache.logging.log4j.ThreadContext;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"
                , "html:target/cucumber/report.html"
                , "me.jvt.cucumber.report.PrettyReports:target/Pixel3/cucumber-html-reports"}
        ,features = {"src/test/resources/features" }
        ,glue = {"com.qa.stepdef"}
        ,snippets = CAMELCASE
        ,dryRun=false
        ,monochrome=true
        //,tags = "@test"
)

public class MyRunnerTest {



    @BeforeClass
    public static void initialize() throws Exception {
        GlobalParamsTest params = new GlobalParamsTest();
        params.initializeGlobalParams();

        ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
                + params.getDeviceName());

        new ServerManagerTest().startServer();
        new DriverManagerTest().initializeDriver();
    }

    @AfterClass
    public static void quit(){
        DriverManagerTest driverManager = new DriverManagerTest();
        if(driverManager.getDriver() != null){
            driverManager.getDriver().quit();
            driverManager.setDriver(null);
        }
        ServerManagerTest serverManager = new ServerManagerTest();
        if(serverManager.getServer() != null){
            serverManager.getServer().stop();
        }
    }
}
