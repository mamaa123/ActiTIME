package PropertiesFileData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FetchDataFromPropertiesFile 
{
	public WebDriver driver;
	@Test
	public void PropertiesFile() throws IOException
	{
	     FileInputStream fis=new FileInputStream("./Property File/configuration.properties");
	     Properties properties=new Properties();
	     properties.load(fis);
	     
	     ChromeOptions option=new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
		 System.setProperty("webdriver.chrome.silentOutput" , "true");
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver(option);
		 driver.manage().window().maximize();
		 
		 driver.get(properties.getProperty("url"));
		 
		 driver.findElement(By.id(properties.getProperty("UsernameLocator"))).sendKeys(properties.getProperty("Username"));
	}
}


//-------->fetch data from properties file 










