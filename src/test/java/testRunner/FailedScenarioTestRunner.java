package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src\\test\\java\\features\\AddtoCart.feature",
		
		glue="stepDefenition",
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenarios.txt"},
		tags="@placeOrder or @SearchProduct",
		monochrome=true,
		dryRun=false
		
		)

//get extentreport plugin from "https://www.extentreports.com/docs/versions/4/java/cucumber4.html"
//add 2 dependency in pom.xml for extent reports

public class FailedScenarioTestRunner extends AbstractTestNGCucumberTests{

	@Override //since method of this class and parent class is same
	@DataProvider(parallel=true) //dataprovider comes from TestNG
	public Object[][] scenarios(){
		return super.scenarios(); //In AbstractTestNGCucumberTests, there is a method present called scenarios
	}
}
