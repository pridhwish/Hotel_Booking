package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	public static WebDriver driver;
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy (id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	private WebElement login;

	public LoginPOM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
