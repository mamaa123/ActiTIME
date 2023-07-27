package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_HomePage 
{
	//Declaration
	
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@class=\"logoSwitcherText\"]")
	private WebElement SwitchToActiPLANSLink;
	
	@FindBy(xpath = "//a[.='View Time-Track']")
	private WebElement ViewTimeTrackLink;
	
	@FindBy(xpath = "//a[.='Lock Time-Track']")
	private WebElement LockTimeTrackLink;
	
	@FindBy(xpath = "//a[.='Approve Time-Track']")
	private WebElement ApproveTimeTrackLink;
	
	@FindBy(xpath = "//div[.='Tasks']/../..//div[@id=\"container_tasks\"]")
	private WebElement TasksLink;
	
	@FindBy(xpath = "//div[@id=\"container_reports\"]")
	private WebElement ReportsLink;
	
	@FindBy(xpath = "//div[@id=\"container_users\"]")
	private WebElement UsersLink;
	
	@FindBy(xpath = "(//div[@class=\"popup_menu_icon\"])[1]")
	private WebElement CalendarMenuLink;
	
	@FindBy(xpath = "(//div[@class=\"popup_menu_icon\"])[2]")
	private WebElement SettingsMenuLink;
	
	@FindBy(xpath = "(//div[@class=\"popup_menu_icon\"])[3]")
	private WebElement AddonsMenuLink;
	
	@FindBy(xpath = "(//div[@class=\"popup_menu_icon\"])[4]")
	private WebElement SupportMenuLink;
	
	@FindBy(xpath = "(//div[@class=\"popup_menu_icon\"])[5]")
	private WebElement TipsMenuLink;
	
	@FindBy(xpath = "//td[@class=\"profileCell preventPanelsHiding\"]")
	private WebElement UserProfileNameLink;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement LogOutLink;
	
	@FindBy(xpath = "//span[contains(text(),'Me')]")
	private WebElement MeDropdownList;
	
	@FindBy(xpath = "//button[@id=\"ext-gen23\"]")
	private WebElement CalenderPopUpLink;
	
	@FindBy(xpath = "(//td[@class='switcherCell switcherImageCell'])[1]")
	private WebElement NotReadyRadioButton;
//	
//	@FindBy(xpath = "//div[.='Save']")
//	private WebElement NotReadyRadioButtonSave;
//	
//	@FindBy(xpath = "//span[@class=\"cancelTTEditingButton customLink cancelButton\"]")
//	private WebElement NotReadyRadioButtonCancel;
	
//	@FindBy(xpath = "(//div[@class=\"ttaHistoryButton\"])[1]")
//	private WebElement ReadyForApprovalMenu;

	
	//Initialization
	
	public ActiTIME_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void SwitchToActiPLANSMethod()
	{
		SwitchToActiPLANSLink.click();
	}
	
	public void ViewTimeTrackMethod()
	{
		ViewTimeTrackLink.click();
	}
	
	public void LockTimeTrackMethod()
	{
		LockTimeTrackLink.click();
	}
	
	public void ApproveTimeTrackMethod()
	{
		ApproveTimeTrackLink.click();
	}
	
	public void TasksMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		TasksLink.click();
		Thread.sleep(3000);
	}
	
	public void ReportsMethod()
	{
		ReportsLink.click();
	}
	
	public void UsersMethod()
	{
		UsersLink.click();
	}
	
	public void CalendarMenuMethod()
	{
		CalendarMenuLink.click();
	}
	
	public void SettingsMenuMethod() throws InterruptedException
	{
		SettingsMenuLink.click();
		Thread.sleep(3000);
	}
	
	public void AddonsMenuMethod()
	{
		AddonsMenuLink.click();
	}
	
	public void SupportMenuMethod()
	{
		SupportMenuLink.click();
	}
	
	public void TipsMenuMethod()
	{
		TipsMenuLink.click();
	}
	
	public void UserProfileNameMethod()
	{
		UserProfileNameLink.click();
	}
	
	public void LogOutMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		LogOutLink.click();
	}
	
	public void MeDropdownMethod()
	{
		MeDropdownList.click();
	}
	
	public void CalenderPopUpMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		CalenderPopUpLink.click();
	}
	
	public void NotReadyRadioButtonMethod() throws InterruptedException
	{
		NotReadyRadioButton.click();
		//NotReadyRadioButtonCancel.click();
	}
	
//	public void ReadyForApprovalMethod() throws InterruptedException
//	{
//		Thread.sleep(3000);
//		ReadyForApprovalMenu.click();
//	}

}
