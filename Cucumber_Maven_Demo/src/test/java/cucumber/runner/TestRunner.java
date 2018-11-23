package cucumber.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith (Cucumber.class)
@CucumberOptions(
		strict = true,
		features = {"src/test/feature/demo.feature"}
		,plugin = {"pretty:STDOUT",
					"html:Reports/cucumber-pretty",
					"json:Reports/cucumber-json/cucumber.json",
					"com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-extent/cucumber.html"
					}
		,tags = {"@Registration, @Registration2"}
		, monochrome = true
		,glue = {"cucumber.test"}
		,dryRun = false
		)

public class TestRunner {

		 @AfterClass
		    public static void reportSetup() 
		 	{
		        Reporter.loadXMLConfig(new File("src/extent-config.xml"));
		        /*Properties p = System.getProperties();
		        p.list(System.out);*/
		        
		        Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		        Reporter.setSystemInfo("64 Bit", 	"Windows 10");
		        Reporter.setSystemInfo("2.53.0", "Selenium");
		        Reporter.setSystemInfo("3.3.9", "Maven");
		        Reporter.setSystemInfo("1.8.0_66", "Java Version");
		        Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
		 	}

}

//public class TestRunnerDemo extends AbstractTestNGCucumberTests {}





