package Execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="./src/test/resources/Features/LoginToSauceDemo.feature", glue="StepDefinition")
public class RunnerClassTest extends AbstractTestNGCucumberTests
{
	
}
