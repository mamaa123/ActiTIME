package Framework_Assignment;

import java.io.IOException;
import org.testng.annotations.Test;
import Framework_Design_Generic.Facebook_Framework_BaseTest;
import Framework_Design_Generic.POM_Facebook_For_Framework;

public class Facebook_Signup_Framework extends Facebook_Framework_BaseTest
{
	@Test
	public void signup() throws InterruptedException, IOException
	{
		POM_Facebook_For_Framework signuppage=new POM_Facebook_For_Framework(driver);
		signuppage.CreateNewAccountMethod();
		signuppage.SignupMethod();
		signuppage.BirthDayMethod();
		signuppage.BirthMonthMethod();
		signuppage.BirthYearMethod();
		signuppage.GenderMethod();
		signuppage.SignUpButtomMethod();
	}
}



//----facebook signup using framework