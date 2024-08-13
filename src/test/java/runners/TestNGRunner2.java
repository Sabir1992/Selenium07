package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src/test/resources/features", // Feature file-lar ucun path
        glue = "stepDefinition", // Step definitionlar olan package qeyd olunur
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/CucumberTestReportNegative.json", // JSON report
                "html:target/cucumber-reports/html/CucumberTestReportNegative.html" // HTML report
        },
        monochrome = true, // False console-daki output-u daha oxunaqli edir
        tags = "@Negative" // Qeyd olunan tag-lere uygun feature file-lar run olur
)

public class TestNGRunner2 extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false) // Her iki senari step-step paralel sekilde run olur
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
