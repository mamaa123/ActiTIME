package Framework_Design_Generic;

import java.io.IOException;

import org.testng.annotations.Test;

public class Execution_CrossBrowserTesting extends BaseTest_CrossBrowserTesting
{
	@Test
	public void loginlogout() throws IOException, InterruptedException
	{
		POM_for_FrameworkImplementation loginPage=new POM_for_FrameworkImplementation(driver);
		loginPage.loginMethod();
	}
}


//-----cross browser testing exeution
