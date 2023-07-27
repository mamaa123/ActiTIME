package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_CreateLeaveTypes 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private WebElement CreateLeaveTypeLink;
	
	@FindBy(xpath = "//span[.='ashis']/../../../../../..//td[@class=\"leaveTypeDeleteCell last\"]")
	private WebElement DeleteLeaveTypeLink;
	
	@FindBy(xpath = "//input[@placeholder=\"Leave Type Name\"]")
	private WebElement LeaveTypeNameTextField;
	
	@FindBy(xpath = "//div[@id=\"leaveTypeLightBox\"]//div[@class=\"leaveTypeIconDiv\"]")
	private WebElement LeaveTypeIconDropdownList;
	
	@FindBy(xpath = "//button[@id=\"ext-gen16\"]")
	private WebElement StatusDropdownList;
	
	@FindBy(xpath = "//input[@id=\"leaveTypeLightBox_rateCoefficient\"]")
	private WebElement LeaveHourRateTextField;
	
	@FindBy(xpath = "//input[@id=\"processLeaveTimeCheckbox_createPopup\"]")
	private WebElement ProcessLeaveTimeCheckBox;
	
	@FindBy(xpath = "//label[@for=\"asPtoRadioButton_createPopup\"]")
	private WebElement asPTORadioButton;
	
	@FindBy(xpath = "//label[@for=\"asSickDaysRadioButton_createPopup\"]")
	private WebElement AsSickDaysRadioButton;
	
	@FindBy(xpath = "//input[@id=\"ptoCoefficientInput_createPopup\"]")
	private WebElement TimeToSubtractTextField;
	
	@FindBy(xpath = "//div[@id=\"leaveTypeLightBox_commitBtn\"]")
	private WebElement CreateLeaveTypeButton;
	
	@FindBy(xpath = "leaveTypeLightBox_cancelBtn")
	private WebElement CancelButton;
	
	@FindBy(xpath = "//div[@id=\"closeLeaveTypeLightBoxBtn\"]")
	private WebElement CloseButton;


	
	
	public ActiTIME_CreateLeaveTypes(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void CreateLeaveTypeMethod()
	{
		CreateLeaveTypeLink.click();
	}
	
	public void DeleteLeaveTypeMethod() throws InterruptedException
	{
		DeleteLeaveTypeLink.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void LeaveTypeNameTextFieldMethod()
	{
		LeaveTypeNameTextField.sendKeys("ashis");
	}
	
	public void LeaveTypeIconDropdownMethod()
	{
		LeaveTypeIconDropdownList.click();
	}
	
	public void StatusDropdownMethod()
	{
		StatusDropdownList.click();
	}
	
	public void LeaveHourRateTextFieldMethod()
	{
		LeaveHourRateTextField.sendKeys("10");
	}
	
	public void ProcessLeaveTimeCheckBoxMethod()
	{
		ProcessLeaveTimeCheckBox.click();
	}
	
	public void asPTORadioButtonMethod()
	{
		asPTORadioButton.click();
	}
	
	public void AsSickDaysRadioButtonMethod()
	{
		AsSickDaysRadioButton.click();
	}
	
	public void TimeToSubtractTextFieldMethod()
	{
		TimeToSubtractTextField.sendKeys("4");
	}
	
	public void CreateLeaveTypeButtonMethod() throws InterruptedException
	{
		CreateLeaveTypeButton.click();
		Thread.sleep(3000);
	}
	
	public void CancelButtonMethod() throws InterruptedException
	{
		CancelButton.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	
	public void CloseButtonMethod()
	{
		CloseButton.click();
		driver.switchTo().alert().accept();
	}

}
