package POM.ActiTIME.ElementStored;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM.ActiTIME.Generic.AutoConstant;
import POM.ActiTIME.Generic.ExcelLibrary;
import POM.ActiTIME.Generic.HighlightingElement_Hepler;
import POM.ActiTIME.Generic.Method_Stored_BasePage;

public class POM_for_FrameworkImplementation extends Method_Stored_BasePage implements AutoConstant
{
    public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	public POM_for_FrameworkImplementation(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginMethod() throws IOException, InterruptedException
	{
		HighlightingElement_Hepler.helper(driver, usernameTextfield);
		usernameTextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name, 2, 1));
		HighlightingElement_Hepler.helper(driver, passwordTextfield);
		passwordTextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name, 3, 1));
		javascriptclick(driver, loginButton);
		Thread.sleep(3000);
		gettitle(driver, "Time-Track");
	}		
}


//In framework design we will inherit classes, interfaces in POM class




