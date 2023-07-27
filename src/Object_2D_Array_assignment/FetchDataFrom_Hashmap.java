package Object_2D_Array_assignment;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FetchDataFrom_Hashmap 
{
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.quit();
	}
	
	public static HashMap<String, String> getcredentialmap()
	{
		HashMap<String, String> hash = new HashMap<>();
		hash.put("admin", "admin:manager");
		hash.put("distributor", "ashis:ashis123");
		hash.put("seller", "swastik:swastik123");
		hash.put("delivery", "bapi:bapi123");
		hash.put("user", "asutosh:asutosh123");
		return hash;
	}
	
	@Test
	public void login()
	{
		//driver.findElement(By.id("username")).sendKeys(getcredentialsmap().get("user").split(":")[0]);    //----- different ways
	    //driver.findElement(By.name("pwd")).sendKeys(getcredentialsmap().get("user").split(":")[1]);       //----- different ways
			
		driver.findElement(By.id("username")).sendKeys(getusername("seller"));
		driver.findElement(By.name("pwd")).sendKeys(getpassword("seller"));	
	}
			
	public static String getusername(String role)
	{
		String username=getcredentialmap().get(role);
		return username.split(":")[0];
	}
			
	public static String getpassword(String role)
	{
		String password=getcredentialmap().get(role);
		return password.split(":")[1];
	}
}



//(qus.-fetching data from hashmap)




