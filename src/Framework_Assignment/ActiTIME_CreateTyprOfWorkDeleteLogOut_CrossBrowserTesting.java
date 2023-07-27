package Framework_Assignment;

import java.io.IOException;

import org.testng.annotations.Test;

import Framework_Design_Generic.BaseTest_CrossBrowserTesting;
import Framework_Design_Generic.POM_for_FrameworkImplementation;

public class ActiTIME_CreateTyprOfWorkDeleteLogOut_CrossBrowserTesting extends BaseTest_CrossBrowserTesting
{
	@Test
	public void customermethod() throws IOException, InterruptedException
	{
	    POM_for_FrameworkImplementation type=new POM_for_FrameworkImplementation(driver);
	    type.loginMethod();
	    type.CreateTypeOfWorkMethod();
	    type.TypeOfWorkButtomMethod();
	    type.CreateTypeOfWorkButtomMethod();
	    type.TypeOfWorkNameMethod();
	    type.CreateTypeOfWorkSummitMethod();
	    type.DeleteTypeOfWorkMethod();
	    type.LogoutMethod();
	}
}



//-----login to actitime then create type of work then delete and logout by using cross browser testing



//----after convert to 'testng.xml' file then write as below


//<suite name="Suite" parallel="tests">
//<test name="ChromeTest">
//	  <parameter name="browser" value="chrome"></parameter>
//  <classes>
//    <class name="Framework_Assignment.ActiTIME_CreateTyprOfWorkDeleteLogOut_CrossBrowserTesting"/>
//  </classes>
//</test> <!-- Test -->
//<test name="EdgeTest">
//	  <parameter name="browser" value="edge"></parameter>
//	  <classes>
//		  <class name="Framework_Assignment.ActiTIME_CreateTyprOfWorkDeleteLogOut_CrossBrowserTesting"></class>
//	  </classes>
//</test>
//<test name="GeckoTest">
//	  <parameter name="browser" value="gecko"></parameter>
//	  <classes>
//		  <class name="Framework_Assignment.ActiTIME_CreateTyprOfWorkDeleteLogOut_CrossBrowserTesting"></class>
//	  </classes>
//</test>
//</suite> <!-- Suite -->