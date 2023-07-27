package String_Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchingObject_2D_Array_ByUsingSplitMethod 
{
	public WebDriver driver; 
	
	@DataProvider(name = "LoginData")
	public Object[][] passdata()
	{
		Object[][] data = {
			                 {"admin" , "manager"},
			                 {"ashis" , "senapaty"},
			                 {"subhashree" , "mohanty"}
		                  };
		return data;
	}
	
	@Test(dataProvider = "LoginData")
	public void setup(CharSequence[] obj)
	{
		ChromeOptions option=new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
		 System.setProperty("webdriver.chrome.silentOutput" , "true");
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver(option);
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/");
		 
		 driver.findElement(By.id("username")).sendKeys((obj[0]));
		 driver.findElement(By.name("pwd")).sendKeys((obj[1]));
	}
}



//----->fetching data from object 2D array(only for multiple text field) by using 'split method'












