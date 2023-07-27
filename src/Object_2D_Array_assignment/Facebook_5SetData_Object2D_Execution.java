package Object_2D_Array_assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import POM.Facebook_SignUp;
import String_2D_Array_Assignment.Facebook_5SetData_BaseTest;

public class Facebook_5SetData_Object2D_Execution extends Facebook_5SetData_BaseTest
{
	@Test(dataProvider = "FacebookSignupString2D")
	public void setup(String firstname , String surname , String mobileNo , String NewPassword) throws InterruptedException
	{		 		 
		Facebook_SignUp login=new Facebook_SignUp(driver);
		 login.CreateNewAccountButtom();
		 
		 driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys(firstname);
		 driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys(surname);
		 driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys(mobileNo);
		 driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys(NewPassword);
		 driver.quit();
	}
}



//----open facebook and create 5 set data of firstname,surname,mobile no,new password in signup page by using object 2D array