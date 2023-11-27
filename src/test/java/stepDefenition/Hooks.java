package stepDefenition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContext;

public class Hooks {
	
	TestContext testContext;
	WebDriver driver;
		
	public Hooks(TestContext testContext) {
		this.testContext=testContext;
	}
	
	@After
	public void tearDown() throws IOException {
	
		testContext.testBase.WebDriverManager().quit();
		
	}
	
	@AfterStep
	public void takeScreenshot(Scenario  scenario) throws IOException {
		
		driver=testContext.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] filecontent=FileUtils.readFileToByteArray(src);
			scenario.attach(filecontent, "image/png", "image");
		}
	}
}
