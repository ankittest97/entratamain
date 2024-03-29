package MyTestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\features", //the path of the feature files
		glue={"stepDefinition"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:report_json/cucumber.json", "junit:report_xml/cucumber.xml"},
		dryRun = false,
		//monochrome = true,
		//strict = true
		
		tags = {"@Regression_TC_01"}
		)


public class TestRunner {

}