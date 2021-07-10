package hbStepdef;

import org.openqa.selenium.WebDriver;

import baseclass.BaseClass;
import cucumber.api.java.en.*;
import pom.LoginPOM;
import property.PageObjectManager;
import runner.Runner;

public class LoginPage extends BaseClass{
	
	public static WebDriver driver = Runner.driver;
	
    PageObjectManager pom = new PageObjectManager(driver);
    
	
	@Given("^: launch url$")
	public void launch_url() throws Throwable {
	url("https://adactinhotelapp.com/");
	}

	@When("^: enter user id$")
	public void enter_user_id() throws Throwable {
		inputOfElement(pom.login().getUsername(), "SowmiyaSri");
	 
	}

	@When("^: enter password$")
	public void enter_password() throws Throwable {
	 inputOfElement(pom.login().getPassword(),"Sowmiya05" );
	}

	@Then("^: click login button$")
	public void click_login_button() throws Throwable {
		clickOnElement(pom.login().getLogin());
	    
	}


}
