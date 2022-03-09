package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.OpentapsWrappers;

public class LoginPage extends OpentapsWrappers{

	public LoginPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
	}

	public LoginPage enterUserName(String data) {
		enterByName(prop.getProperty("Login.UserName.Name"), data);
		return this;

	}
	
	public LoginPage enterPassword(String data) {
		enterByName(prop.getProperty("Login.Password.Name"), data);
		return this;
	}
	
	

	public LoginPage clickLoginForFailure() {
		clickByClassName(prop.getProperty("Login.LoginButton.Class"));
		return this;
		
	}

}





