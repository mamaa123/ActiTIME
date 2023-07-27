package Framework_Design_Generic;

import java.io.IOException;

import org.testng.annotations.Test;

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
