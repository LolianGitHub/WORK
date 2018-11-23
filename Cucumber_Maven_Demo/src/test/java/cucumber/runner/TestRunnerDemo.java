package cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith (Cucumber.class)
@CucumberOptions(
		strict = true,
		features = {"src/test/feature/demo.feature"}
		,plugin = {"pretty:STDOUT",
					"html:Reports/cucumber-pretty",
					"json:Reports/cucumber.json",
					"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-extent/cucumber.html"
					}
		,tags = {"@ShoppingWriteReview"}
		, monochrome = true
		,glue = {"cucumber.test"}
		,dryRun = false
		)

//public class TestRunnerDemo {}

public class TestRunnerDemo extends AbstractTestNGCucumberTests {}





