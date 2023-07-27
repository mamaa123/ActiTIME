package Object_2D_Array_assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.ActiTIMELoginPage;
import POM.ActiTIME_CreateNewCustomer;
import POM.ActiTIME_HomePage;
import String_2D_Array_Assignment.Create5SetCustomerAndDescription_String2DBaseTest;

public class ActiTIME_5SetCustomer_Object2D_Execution extends Create5SetCustomerAndDescription_String2DBaseTest
{
	@Test(dataProvider = "CustomerAndDescriptionObject2D")
	public void setup(String name , String description) throws InterruptedException
	{		 		 
		 ActiTIMELoginPage login=new ActiTIMELoginPage(driver);
		 login.LoginMethod();
		 
		 ActiTIME_HomePage tasklink=new ActiTIME_HomePage(driver);
		 tasklink.TasksMethod();
		 
		 ActiTIME_CreateNewCustomer addnewDropdown=new ActiTIME_CreateNewCustomer(driver);
		 addnewDropdown.AddnewDropdownButtonmethod();
		 addnewDropdown.NewcustomerButtonMethod();
		 
		 driver.findElement(By.xpath("//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")).sendKeys(name);
		 driver.findElement(By.xpath("//textarea[@placeholder=\"Enter Customer Description\"]")).sendKeys(description);
		 driver.findElement(By.xpath("//div[.='Create Customer']")).click();
		 driver.quit();
	}
}



//---By using 'BaseTest Class' and 'data provider'login the 'actitime' and create 5 set of customer and description 
//then quit the browser