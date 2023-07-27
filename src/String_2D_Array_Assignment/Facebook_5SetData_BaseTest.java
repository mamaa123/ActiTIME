package String_2D_Array_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Facebook_5SetData_BaseTest extends ActiTIME_DataProvider
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
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void ExecutionComplete()
	{
		System.out.println("execution completed");
	}

}
