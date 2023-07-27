package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_SignUp 
{
	
		@FindBy(xpath = "//a[.='Create new account']")
		private WebElement CreateNewAccountButtom;
		
		@FindBy(xpath = "//input[@placeholder=\"First name\"]")
		private WebElement FirstnameTextfield;
		
				
		public Facebook_SignUp(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		
		public void CreateNewAccountButtom() throws InterruptedException
		{
			CreateNewAccountButtom.click();
			Thread.sleep(3000);
		}
}
