package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to feature files
        glue = "stepDefinition", // Package for step definitions
        plugin = {
                "pretty",
                "json:target/cucumber-reports/json/CucumberTestReportPositive.json", // JSON report
                "html:target/cucumber-reports/html/CucumberTestReportPositive.html" // HTML report
        },
        monochrome = false, // Makes the console output more readable
        tags = "@Positive" // Run scenarios with the specified tag
)

public class JUnitRunner2 {
        //Run ucun JUnit istifade ederken data provider metoduna ehtiyac yoxdur
}
