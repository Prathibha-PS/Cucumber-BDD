package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featureFiles", glue="stepDefinitions", plugin={"pretty", "html:target/cucumber-reports/htmlreport.html", "json:target/cucumber-reports/jsonreport.json",
"junit:target/cucumber-reports/junitreport.xml" })

public class RunnerClass {

}