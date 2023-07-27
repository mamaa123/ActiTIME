package String_2D_Array_Assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.ActiTIME_HomePage;

public class ActiTIME_LoginUsing_5Credential_String2D extends ActiTIME_CommonLinesOfCodeUsingDifferentAnnotation_BaseTest
{
	@Test(dataProvider = "LoginDataString2D")
	public void setup(String[] str) throws InterruptedException
	{		 
		 driver.findElement(By.id("username")).sendKeys(str[0]);
		 driver.findElement(By.name("pwd")).sendKeys(str[1]);
		 driver.findElement(By.id("loginButton")).click();
		 
		 Thread.sleep(3000);
		 String homepage=driver.getTitle();
		 System.out.println(homepage);
		 
		 if(homepage.equals("actiTIME - Enter Time-Track"))
		 {
			 System.out.println("homepage is displayed");
			 
			 ActiTIME_HomePage logout=new ActiTIME_HomePage(driver);
			 logout.LogOutMethod();
			 driver.quit();
		 }
		 else
		 {
			 System.out.println("Username or Password is invalid. Please try again.");
			 driver.quit();
		 }
	}
}




//Qus--->By using 'BaseTest Class' and 'data provider'login the 'actitime' using 5 different credential and verify whether home page is 
//       displayed or not and then quit the browser