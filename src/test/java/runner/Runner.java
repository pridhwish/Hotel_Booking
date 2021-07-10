package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features = "src/test/java/hotelbook/hotelbook.feature",glue="hbStepdef")


public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = BaseClass.browserLaunch("chrome");

	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();

	}

}
