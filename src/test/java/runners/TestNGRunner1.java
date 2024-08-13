package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
@CucumberOptions(
        features = "src/test/resources/features", // Feature file-lar ucun path
        glue = "stepDefinition", // Step definitionlar olan package qeyd olunur
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/CucumberTestReportPositive.json", // JSON report
                "html:target/cucumber-reports/html/CucumberTestReportPositive.html" // HTML report
        },
        monochrome = false, // False console-daki output-u daha oxunaqli edir
        tags = "@Positive or @Negative" // Qeyd olunan tag-lere uygun feature file-lar run olur
)

public class TestNGRunner1 extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false) // Her iki senari step-step paralel sekilde run olur
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
