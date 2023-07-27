package Framework_Design_Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Facebook_Framework_BaseTest implements AutoConstant
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
		 System.setProperty(chrome_keys, chrome_value);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url2);
	 }
	 
	 @AfterClass
	 public void teardown()
	 {
		 driver.quit();
	 }
	 
	 @AfterSuite
	 public void ExecutionComplete()
	 {
		 System.out.println("Execution completed");
	 }

}
