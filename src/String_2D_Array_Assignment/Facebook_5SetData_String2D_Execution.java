package String_2D_Array_Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import POM.Facebook_SignUp;

public class Facebook_5SetData_String2D_Execution extends Facebook_5SetData_BaseTest
{
	@Test(dataProvider = "FacebookSignupString2D")
	public void setup(String[] str) throws InterruptedException
	{		 		 
		 Facebook_SignUp login=new Facebook_SignUp(driver);
		 login.CreateNewAccountButtom();
		 
		 driver.findElement(By.xpath("//input[@placeholder=\"First name\"]")).sendKeys(str[0]);
		 driver.findElement(By.xpath("//input[@aria-label=\"Surname\"]")).sendKeys(str[1]);
		 driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]")).sendKeys(str[2]);
		 driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys(str[3]);
		 //driver.quit();
	}
}


//----open facebook and create 5 set data of firstname,surname,mobile no,new password in signup page by using string2d array