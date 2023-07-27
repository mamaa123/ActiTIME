package Framework_Design_Generic;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.ActiTIMELoginPage;

@Listeners(Framework_Design_Generic.ScreenShot_Generic.class)  //--------only single screenshot   //implements "@Listeners" at class label  
//@Listeners(Framework_Design_Generic.MultipleScreenshot_Generic.class)       //------only multiple screenshot    //implements "@Listeners" at class label 
public class TakingScreenshot_Execution extends BaseTestClass_FrameworkDesign
{
	@Test
	public void LoginLogout() throws IOException, InterruptedException
	{
		ActiTIMELoginPage login=new ActiTIMELoginPage(driver);
   	    login.LoginMethod();
	}
}



//---if any error/mistakes in POM class then screenshot can be taken  