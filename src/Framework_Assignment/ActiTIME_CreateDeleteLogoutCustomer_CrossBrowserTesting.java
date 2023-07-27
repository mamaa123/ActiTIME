package Framework_Assignment;

import java.io.IOException;

import org.testng.annotations.Test;

import Framework_Design_Generic.BaseTest_CrossBrowserTesting;
import Framework_Design_Generic.POM_for_FrameworkImplementation;

public class ActiTIME_CreateDeleteLogoutCustomer_CrossBrowserTesting extends BaseTest_CrossBrowserTesting
{
	@Test
	public void customermethod() throws IOException, InterruptedException
	{
		POM_for_FrameworkImplementation loginPage=new POM_for_FrameworkImplementation(driver);
		loginPage.loginMethod();
		loginPage.TaskButtomMethod();
		loginPage.AddnewDropdownButtom();
		loginPage.NewCustomerButtomMethod();
		loginPage.EnterCustomerFieldMethod();
		loginPage.CustomerEditMethod();
		loginPage.ActionMethod();
		loginPage.deleteMethod();
		loginPage.PermanentDeleteMethod();
		loginPage.LogoutMethod();
	}
}

//---login to actitime,create ,delete customer and logout by using cross browser testing


//---after convert to 'testng.xml' file then we write below on 'testng.xml' file

//<suite name="Suite" parallel="tests">
//<test name="ChromeTest">
//	  <parameter name="browser" value="chrome"></parameter>
//  <classes>
//    <class name="Framework_Assignment.ActiTIME_CreateDeleteLogoutCustomer_CrossBrowserTesting"/>
//  </classes>
//</test> <!-- Test -->
//<test name="EdgeTest">
//	  <parameter name="browser" value="edge"></parameter>
//	  <classes>
//		  <class name="Framework_Assignment.ActiTIME_CreateDeleteLogoutCustomer_CrossBrowserTesting"></class>
//	  </classes>
//</test>
//<test name="GeckoTest">
//	  <parameter name="browser" value="gecko"></parameter>
//	  <classes>
//		  <class name="Framework_Assignment.ActiTIME_CreateDeleteLogoutCustomer_CrossBrowserTesting"></class>
//	  </classes>
//</test>
//</suite> <!-- Suite -->