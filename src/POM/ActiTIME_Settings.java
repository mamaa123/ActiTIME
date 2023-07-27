package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_Settings 
{
	@FindBy(xpath = "(//div[@class=\"popup_menu_title\"])[2]/../..//div[.='Turn Features On / Off']")
	private WebElement TurnFeaturesOnOrOffLink;
	
	@FindBy(xpath = "//div[contains(text(),'configure actiTIME')]")
	private WebElement GeneralSettingsLink;
	
	@FindBy(xpath = "//a[.='Workflow Settings']")
	private WebElement WorkflowSettingsLink;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement TypesOfWorkLink;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement LeaveTypesLink;
	
	@FindBy(xpath = "//a[.='Notifications']")
	private WebElement NotificationsLink;
	
	@FindBy(xpath = "//a[.='Logo Settings']")
	private WebElement LogoSettingsLink;
	
	@FindBy(xpath = "//div[.='Licenses']")
	private WebElement LicensesLink;
	
	
	public ActiTIME_Settings(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void TurnFeaturesOnOrOffMethod()
	{
		TurnFeaturesOnOrOffLink.click();
	}
	
	public void GeneralSettingsMethod()
	{
		GeneralSettingsLink.click();
	}
	
	public void WorkflowSettingsMethod()
	{
		WorkflowSettingsLink.click();
	}
	
	public void TypesOfWorkMethod() throws InterruptedException
	{
		TypesOfWorkLink.click();
		Thread.sleep(2000);
	}
	
	public void LeaveTypesMethod() throws InterruptedException
	{
		LeaveTypesLink.click();
		Thread.sleep(2000);
	}
	
	public void NotificationsMethod()
	{
		NotificationsLink.click();
	}
	
	public void LogoSettingsMethod()
	{
		LogoSettingsLink.click();
	}
	
	public void LicensesMethod()
	{
		LicensesLink.click();
	}
}
