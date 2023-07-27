package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIMELoginPage 
{
	//Declaration
	
	@FindBy(id = "username")//
	private WebElement UsernameTextField;
	
	@FindBy(name = "pwd")//
	private WebElement PasswordTextField;
	
	@FindBy(id = "keepLoggedInCheckBox")//
	private WebElement KeepMeLoggedInCheckBox;
	
	@FindBy(id = "loginButton")//
	private WebElement Loginbutton;
	
	@FindBy(xpath = "//a[.='Forgot your password?']")//
	private WebElement ForgotYourPasswordLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")//
	private WebElement actitimeIncLink;
	
	@FindBy(xpath = "//nobr[contains(text(),'Online')]")//
	private WebElement actitime2020Online;
	
//	@FindBy(className = "atLogoImg")
//	private WebElement ActitimeLogoImage;
	
//	@FindBy(className = "productNameContainer")
//	private WebElement ProductName;
	
	@FindBy(xpath = "//td[contains(text(),'identify')]")//
	private WebElement PleaseIdentifyYourselfText;
	
	@FindBy(xpath = "//div[@class=\"tooltip-content\"]")//
	private WebElement AdministratorAndRegularUserDetails;
	
	//Initialization
	
	public ActiTIMELoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utlization
	
	public void LoginMethod() throws InterruptedException
	{
		UsernameTextField.sendKeys("admin");
		PasswordTextField.sendKeys("manager");
		KeepMeLoggedInCheckBox.click();
		Loginbutton.click();
		Thread.sleep(5000);
	}
		
	public void ForgotPasswordMethod()
	{
		ForgotYourPasswordLink.click();
	}
		
	public void ActitimeIncMethod()
	{
		actitimeIncLink.click();
	}
	
	public void actitime2020OnlineMethod()
	{
		System.out.println(actitime2020Online.getText());
	}
	
//	public void ActitimeLogoMethod()
//	{
//		System.out.println(ActitimeLogoImage.getText());
//	}
	
//	public void ProductNameMethod()
//	{
//		System.out.println(ProductName.getText());
//	}
	
	public void PleaseIdentifyYourselfMethod()
	{
		System.out.println(PleaseIdentifyYourselfText.getText());
	}
	
	public void AdministratorAndRegularUser()
	{
		System.out.println(AdministratorAndRegularUserDetails.getText());
	}

}
