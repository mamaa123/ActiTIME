package Framework_Design_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseTest_CrossBrowserTesting implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeSuite
	public void execution()
	{
		System.out.println("execution started");
	}
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty(chrome_keys, chrome_value);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty(edge_keys, edge_value);
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("gecko"))
		{
			System.setProperty("webdriver.chrome.silentOutput", "true");
			System.setProperty(gecko_keys, gecko_value);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		//driver.quit();
//	}
	
	@AfterSuite
	public void executioncomplete()
	{
		System.out.println("execution completed");
	}
}


//------constant data saving on base test class for cross browser testing
//------which browser through we want perform cross browser testing, in 'testng.xml' we need to write browser name as per our basetest class
//     example:-
//              in basetest class if we write "gecko" then in "testng.xml" we must write "gecko"


//--for cross browser testing we execute through "testng.xml" file and also write as per below



//<suite name="Suite" parallel="tests">
//<test name="ChromeTest">
//	  <parameter name="browser" value="chrome"></parameter>
//  <classes>
//    <class name="Framework_Assignment.ActiTIME_LoginLogout_CrossBrowseTesting"/>
//  </classes>
//</test> <!-- Test -->
//<test name="EdgeTest">
//	  <parameter name="browser" value="edge"></parameter>
//	  <classes>
//		  <class name="Framework_Assignment.ActiTIME_LoginLogout_CrossBrowseTesting"></class>
//	  </classes>
//</test>
//<test name="GeckoTest">
//	  <parameter name="browser" value="gecko"></parameter>
//	  <classes>
//		  <class name="Framework_Assignment.ActiTIME_LoginLogout_CrossBrowseTesting"></class>
//	  </classes>
//</test>
//</suite> <!-- Suite -->


