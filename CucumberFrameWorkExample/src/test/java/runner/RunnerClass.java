package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(
		features="featurefiles",
		glue = "stepDefinitions",
		dryRun = true,
		monochrome = true,
		plugin = {"html:report/Cucumber_report","json:report/JsonReport.json","junit:report/xmlreport.xml"},
		tags = {"@LoginHRM","@DataTable"}
		
		)

public class RunnerClass {


}