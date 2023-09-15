package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/test/java/Feature/facebook.feature",
        glue = {"StepDefinitions"},
        dryRun = false


)

public class Run extends AbstractTestNGCucumberTests {
}
