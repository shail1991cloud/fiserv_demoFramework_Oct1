

package com.runnerUtilies;

import com.cucumber.listener.Reporter;
import com.managersUtilities.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/resources",
        glue = {"com/steps"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        tags = {"@CRP-Test4"},
        monochrome = true

)

public class TestRunner {

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
    }
}
