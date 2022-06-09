package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericUtils {
	
	public WebDriver driver;

	public genericUtils(WebDriver driver) {
		this.driver= driver;
	}
	
	public void SwitchWindowToChild() {
		Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> i = allWindowHandles.iterator();
        String parentWindow= i.next();
        String childWindow= i.next();
        driver.switchTo().window(childWindow);
	}
}
