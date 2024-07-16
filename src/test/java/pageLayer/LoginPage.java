package pageLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	WebDriver dr;
	public LoginPage(WebDriver dr)
	{
		this.dr=dr;
	}
	@FindBy(name="Email")WebElement user;
	@FindBy(name="Password")WebElement password;
	@FindBy(xpath="//input[@value='Log in']")WebElement loginbutton;
	
	
	public void loginixon(String un, String pass) throws Exception
	{
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		user.sendKeys(un);
		password.sendKeys(pass);
		loginbutton.click();
			
	}

}
