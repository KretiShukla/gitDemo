package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver Driver;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	public genericUtils GenericUtils;
	
	public TestContextSetup() throws IOException {
		testBase= new TestBase();
		pageObjectManager= new PageObjectManager(testBase.DriverManager());
		GenericUtils= new genericUtils(testBase.DriverManager());
	}

}
