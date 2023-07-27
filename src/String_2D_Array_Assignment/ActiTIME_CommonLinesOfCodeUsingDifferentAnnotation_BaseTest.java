package String_2D_Array_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


public class ActiTIME_CommonLinesOfCodeUsingDifferentAnnotation_BaseTest extends ActiTIME_DataProvider
{
	public WebDriver driver;
	
	@BeforeSuite
	public void ExecutionStart()
	{
		System.out.println("execution started");
	}
	
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");       //----------silent output
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");    
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void ExecutionComplete()
	{
		System.out.println("execution completed");
	}
}


//----->store the reusability lines of code using different testng annotation
//-----.using "POM" class we can create "Basetest" class






