package POM.ActiTIME.Execution;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.ActiTIME.ElementStored.POM_for_FrameworkImplementation;
import POM.ActiTIME.Generic.BaseTestClass_FrameworkDesign;

public class FrameworkExecution extends BaseTestClass_FrameworkDesign
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		POM_for_FrameworkImplementation loginPage=new POM_for_FrameworkImplementation(driver);
		loginPage.loginMethod();
	}
}


//----framework execution of actitime login
