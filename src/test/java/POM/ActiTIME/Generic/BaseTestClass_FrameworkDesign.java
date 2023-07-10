package POM.ActiTIME.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestClass_FrameworkDesign implements AutoConstant
{
	public static WebDriver driver;
	
	 @BeforeSuite
	 public void ExecutionStart()
	 {
		 System.out.println("Execution Started");
	 }
	 
	 @BeforeClass
	 public void setup()
	 {
		 System.setProperty("webdriver.chrome.silentOutput", "true");
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
	 }
	 
	 @AfterClass
	 public void teardown()
	 {
		 //driver.quit();
	 }
	 
	 @AfterSuite
	 public void ExecutionComplete()
	 {
		 System.out.println("Execution completed");
	 }
}


//---inside this class we have stored all the reusable lines of code using "AutoConstant" interface




