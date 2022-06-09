package stepDefinitions;

import java.io.IOException;

import Utils.TestBase;
import Utils.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	TestContextSetup testContextSetup;
	public TestBase testBase;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup= testContextSetup;
	}

	@After
	public void AfterScenario() throws IOException {
		testContextSetup.testBase.DriverManager().quit();
	}
	
	@Before
	public void BeforeScenario() throws IOException {
		testBase.DriverManager();
		testContextSetup.Driver.get("URL");
		testContextSetup.Driver.manage().window().maximize();
	}
}
