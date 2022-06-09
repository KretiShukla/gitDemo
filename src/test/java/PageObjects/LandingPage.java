package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author NILESH SHUKLA
 *
 */
public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By OccassionCategory= By.id("#fathersday");
	By ProductCategory= By.cssSelector("span.c-name.padding-bottom-0");
	By ProductSelection= By.cssSelector("img.product-card_prod-img__2K5WE");
	By PincodeBox= By.id("pincode-search");
	
	public void SelectOccCate() {
		driver.findElement(OccassionCategory).click();
	}
	
	public void SelectProCate() {
		driver.findElement(ProductCategory).click();
	}
	
	public void EnterPin() {
		driver.findElement(PincodeBox).click();
	}
	
	public void SelectProduct() {
		driver.findElement(ProductSelection).click();
	}
}
