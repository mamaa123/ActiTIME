package Object_2D_Array_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UseDataProviderWith_ThreadCount 
{
public WebDriver driver;
	
	@DataProvider(name="LoginData")
	public Object[][] passdata()
	{
		Object[][] data = {
				             {"admin" , "manager"},
				             {"ashis" , "senapaty"},        
				             {"subhrajit" , "dash"},
				             {"subhashree" , "mohanty"}
		                  };
		return data;
	 }
	
	@Test(dataProvider = "LoginData")
	public void setup(String username , String password)
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/");
		 
		 driver.findElement(By.id("username")).sendKeys(username);
		 driver.findElement(By.name("pwd")).sendKeys(password);
	}
}


//(qus.-how to use data provider with a thread count?)
//---->for use data provider with thread count, we write in 'testng.xml'
              //   <suite name="Suite" data-provider-thread-count="2">
              //   <test name="Test">





