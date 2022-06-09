package stepDefinitions;

import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Utils.TestBase;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends TestBase {
	
	TestContextSetup testContextSetup;
	public LoginPage loginPage;

public LoginPageSteps(TestContextSetup testContextSetup) {
	this.testContextSetup= testContextSetup;
}
	@Given("User is on landing Page")
	public void user_is_on_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User redirected to login page")
	public void user_redirected_to_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    loginPage.ClickGuestLoginBtn();
	    loginPage.ClickLoginBtn();
	}
	@Then("User should be able to enter the credential")
	public void user_should_be_able_to_enter_the_credential() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
