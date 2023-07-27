package Framework_Assignment;

import java.io.IOException;

import org.testng.annotations.Test;

import Framework_Design_Generic.BaseTestClass_FrameworkDesign;
import Framework_Design_Generic.POM_for_FrameworkImplementation;

public class ActiTIME_CreateTypeOfWorkAndLogOut_Framework extends BaseTestClass_FrameworkDesign
{
	@Test
	public void TypeOfWork() throws IOException, InterruptedException
	{
		POM_for_FrameworkImplementation Creatework=new POM_for_FrameworkImplementation(driver);
		Creatework.loginMethod();
		Creatework.CreateTypeOfWorkMethod();
		Creatework.TypeOfWorkButtomMethod();
		Creatework.CreateTypeOfWorkButtomMethod();
		Creatework.TypeOfWorkNameMethod();
		Creatework.CreateTypeOfWorkSummitMethod();
		Creatework.DeleteTypeOfWorkMethod();      //------another assignment-->login to actitime, create type of work and delete type of work
		Creatework.LogoutMethod();                                            // and logout using framework
	}
}


//------login to actitime, create type of work and logout using framework