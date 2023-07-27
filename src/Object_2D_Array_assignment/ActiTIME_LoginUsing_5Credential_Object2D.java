package Object_2D_Array_assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import POM.ActiTIME_HomePage;
import String_2D_Array_Assignment.ActiTIME_CommonLinesOfCodeUsingDifferentAnnotation_BaseTest;

public class ActiTIME_LoginUsing_5Credential_Object2D extends ActiTIME_CommonLinesOfCodeUsingDifferentAnnotation_BaseTest
{
	
	@Test(dataProvider = "LoginDataObject2D")
	public void setup(String username , String password) throws InterruptedException
	{		 
		 driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys(username);
		 driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys(password);
		 driver.findElement(By.xpath("//a[.='Login ']")).click();
		 
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
