package runnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureFiles",
glue = "stepDefinitions")
public class RunTestNGTest extends AbstractTestNGCucumberTests{

	
}
