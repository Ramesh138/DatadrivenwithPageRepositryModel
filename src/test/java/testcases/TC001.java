package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC001 extends OpentapsWrappers{

	@Parameters("browser")
	@BeforeClass
	public void setValues(String browser) {
		browserName=browser;
		testCaseName="TC001";
		testDescription="Login and Logout from Opentaps(Positive)";
		category="smoke";
		dataSheetName="Sheet1";
	}
	
	@Test(dataProvider="fetchData")
	public void loginOpentaps(String username, String password,String snumber, String odeteref,String code, String duplicatecode) {
		System.out.println(username	+password+	snumber	+odeteref+	code	+duplicatecode);

	new LoginPage(driver,test)
	.enterUserName(username)
	.enterPassword(password)
	.clickLoginForFailure();		
	}

	
}










