package Framework_Assignment;

import java.io.IOException;

import org.testng.annotations.Test;

import Framework_Design_Generic.BaseTestClass_FrameworkDesign;
import Framework_Design_Generic.POM_for_FrameworkImplementation;

public class ActiTIME_CreateCustomerAndLogOut_Framework extends BaseTestClass_FrameworkDesign
{
	@Test
	public void CreateCustomer() throws IOException, InterruptedException
	{
		POM_for_FrameworkImplementation loginPage=new POM_for_FrameworkImplementation(driver);
		loginPage.loginMethod();
		loginPage.TaskButtomMethod();
		loginPage.AddnewDropdownButtom();
		loginPage.NewCustomerButtomMethod();
		loginPage.EnterCustomerFieldMethod();
		loginPage.LogoutMethod();
	}
}



//------login to actitime then create customer then logout using framework