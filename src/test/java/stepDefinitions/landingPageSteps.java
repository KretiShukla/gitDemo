package stepDefinitions;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PageObjects.LandingPage;
import Utils.TestBase;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class landingPageSteps extends TestBase {
	TestContextSetup testContextSetup;
	public LandingPage landingPage;
	public TestBase testBase;

public landingPageSteps(TestContextSetup testContextSetup) {
	this.testContextSetup= testContextSetup;
}

	@Given("User is on landing page")
	public void user_is_on_landing_page() throws IOException {
	 
		testBase.DriverManager();
		testContextSetup.Driver.get("URL");
		testContextSetup.Driver.manage().window().maximize();
		
	}
	@When("User select the category")
	public void User_select_the_category() {
	    // Write code here that turns the phrase above" into concrete actions
		
		landingPage.SelectOccCate();
		landingPage.SelectProCate();
		
	}
	@When("select the product")
	public void select_the_product() {
	    // Write code here that turns the phrase above into concrete actions
		
		landingPage.SelectProduct();
		
	}
	@Then("User should checkout")
	public void user_should_checkout() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
	  
	    
	    Actions action = new Actions(testContextSetup.Driver); 
	    WebElement element = testContextSetup.Driver.findElement(By.id("pincode-search"));
	    element.sendKeys("713325");
	    Thread.sleep(4000);
	   element.click();
	   
	   
	  testContextSetup.Driver.quit();
	   

	
}}
