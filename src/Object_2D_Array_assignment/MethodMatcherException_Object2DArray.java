package Object_2D_Array_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MethodMatcherException_Object2DArray 
{
	public WebDriver driver;
	
	@DataProvider(name="LoginData")
	public Object[][] passdata()
	{
		Object[][] data = {
				             {"admin" , "manager"},
				                       //----------->MethodMatcherException
				             {"subhrajit" , "dash"},
				             {"ashis"}
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
		driver.quit();
	}
}




//----->if we are not providing mandatory data/sufficient data then we get "MethodMatcherException"

