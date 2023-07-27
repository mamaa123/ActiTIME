package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.manage().window().maximize();
		
		ActiTIMELoginPage loginpage=new ActiTIMELoginPage(driver);
		loginpage.LoginMethod();
		
		ActiTIME_HomePage homepage=new ActiTIME_HomePage(driver);
		//homepage.SettingsMenuMethod();
		homepage.NotReadyRadioButtonMethod();
		
		//ActiTIME_Settings settingpopup=new ActiTIME_Settings(driver);
		//settingpopup.TurnFeaturesOnOrOffMethod();
	}
}