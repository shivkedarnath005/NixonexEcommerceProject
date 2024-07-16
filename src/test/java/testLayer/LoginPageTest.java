package testLayer;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import baseLayer.Baseclass;
import baseLayer.Util;
import pageLayer.LoginPage;

public class LoginPageTest extends Baseclass 
{
	
  @Test
  public void logintest() throws Exception  
  {
	    LoginPage obj=PageFactory.initElements(driver, LoginPage.class);//login class call when we use @FindBy annotation
		obj.loginixon(ex.getStringData("sheet1", 0, 0),ex.getStringData("sheet1", 0, 1));
		Thread.sleep(1000);
		Util.capture(driver, "loginpg.png");
		test=extent.createTest("test1", "testcase1");
		
  }
}
