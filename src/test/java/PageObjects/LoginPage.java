package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author NILESH SHUKLA
 *
 */
public class LoginPage {

	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By GuestLoginBtn= By.className("material-icons");
	By LoginBtn= By.linkText("/account/my-account");

	
	public void ClickGuestLoginBtn() {
		driver.findElement(GuestLoginBtn).click();
	}
	
	public void ClickLoginBtn() {
		driver.findElement(LoginBtn).click();
	}
	
	
}
