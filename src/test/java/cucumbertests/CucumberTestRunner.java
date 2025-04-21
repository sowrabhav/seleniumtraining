package cucumbertests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/scenarios", // Path to the feature file
        glue = {"stepdefinitions"}, // Package containing step definitions
        plugin = {"pretty", "html:results/cucumber-html-report.html", "json:cucumber.json"}, // Report generation
        monochrome = true, // Makes console output more readable
        tags = "@smoke" // Runs scenarios with the specified tag
)
public class CucumberTestRunner {
}
