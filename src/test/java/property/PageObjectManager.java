package property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.LoginPOM;

public class PageObjectManager {
	public static WebDriver  driver;
	
	private LoginPOM login;
	
	public PageObjectManager(WebDriver pdriver) {
		this .driver = pdriver;
		PageFactory.initElements(pdriver, this);
	}

	public LoginPOM login() {
	 login = new LoginPOM(driver);
	 return login;

	}
	

}
