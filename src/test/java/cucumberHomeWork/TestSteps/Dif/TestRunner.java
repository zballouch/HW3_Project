package cucumberHomeWork.TestSteps.Dif;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//
@CucumberOptions(features = { "" }
				, glue = { "stepDefinition" }
				, plugin = { "pretty", "html:test-output" }
				, dryRun = false
				, monochrome = true)
public class TestRunner {

}
