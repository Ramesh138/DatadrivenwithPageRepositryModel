package wrappers;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import utils.DataInputProvider;

public class OpentapsWrappers extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	

	@BeforeSuite
	public void beforeSuite(){
		loadObjects();
		
	}

	@BeforeTest
	public void beforeTest(){
		startResult();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("I am in ups wrapper");
		test = startTestCase(testCaseName, testDescription);
		test.assignCategory(category);	
		invokeApp(browserName,false);
	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
		endTestcase();
		quitBrowser();
	
	}
	
	@AfterMethod
	public void afterMethod(){

	}
	
	@DataProvider(name="fetchData")
	public Object[][] getData(){
		return DataInputProvider.getSheet(dataSheetName);		
	}	
	
	
}
