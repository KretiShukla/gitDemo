package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;

	public WebDriver DriverManager() throws IOException {
		
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\resources\\global.properties");
		Properties prop= new Properties();
		prop.load(fis);
		String URL= System.getProperty("URL");
		String ChromePath= System.getProperty("C:\\Users\\NILESH SHUKLA\\OneDrive\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		if (driver== null) {
			
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "ChromePath");
		 driver= new ChromeDriver();
		 }
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				
			}
		 
		} 
		 return driver;
	}
}
