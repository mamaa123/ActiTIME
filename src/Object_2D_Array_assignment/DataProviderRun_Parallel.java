package Object_2D_Array_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRun_Parallel 
{
	public WebDriver driver;

	@DataProvider(name="LoginData" , parallel = true)
	public Object[][] passdata()
	{
		Object[][] data = {
				{"admin" , "manager"},
				{"ashis" , "senapaty"},        
				{"subhrajit" , "dash"}
		};
		return data;
	}

	@Test(dataProvider = "LoginData")
	public void setup(String username , String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		WebElement logout=driver.findElement(By.id("logoutLink"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", logout);
	}
}

//(qus.-how to run data provider in parallel)



