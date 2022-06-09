package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public LandingPage landingPage;
	public LoginPage loginPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver= driver;
	}

	public LandingPage getLandingPage() {
		
		landingPage= new LandingPage(driver);
		return landingPage;
	}
	
	public LoginPage getLoginPage() {
		
		loginPage= new LoginPage(driver);
		return loginPage;
	}
}
