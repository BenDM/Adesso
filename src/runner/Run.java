package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/features",
		glue = {"stepdefinitions","utility"},
		plugin = {
				"json:target/cucumber.json",
				"pretty:target/cucumber-pretty.json",
				"junit:target/cucumber.xml"
		},
		monochrome = true
		)

public class Run {

}
