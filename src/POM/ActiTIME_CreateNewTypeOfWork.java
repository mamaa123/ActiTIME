package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_CreateNewTypeOfWork 
{
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement NameTextField;
	
	@FindBy(xpath = "//select[@name=\"active\"]")
	private WebElement StatusDropdownList;
	
	@FindBy(xpath = "//label[.='Billable']")
	private WebElement BillableRadiobutton;
	
	@FindBy(xpath = "//label[.='Non-Billable']")
	private WebElement NonBillableRadioButton;
	
	@FindBy(xpath = "//input[@id=\"billingRate_input\"]")
	private WebElement BillingRateTextField;
	
	@FindBy(xpath = "//input[@value=\"   Create Type of Work   \"]")
	private WebElement CreateTypeOfWorkButton;
	
	@FindBy(xpath = "//input[@onclick=\"handleCancel();\"]")
	private WebElement CancelButton;
	
	
	public ActiTIME_CreateNewTypeOfWork(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void NameTextFieldMethod()
	{
		NameTextField.sendKeys("senapaty");
	}
	
	public void StatusDropdownListMethod()
	{
		StatusDropdownList.click();
	}
	
	public void BillableRadiobuttonMethod()
	{
		BillableRadiobutton.click();
	}
	
	public void NonBillableRadioButtonMethod()
	{
		NonBillableRadioButton.click();
	}
	
	public void BillingRateTextFieldMethod()
	{
		BillingRateTextField.click();
	}
	
	public void CreateTypeOfWorkButtonMethod() throws InterruptedException
	{
		CreateTypeOfWorkButton.click();
		Thread.sleep(3000);
	}
	
	public void CancelButtonMethod()
	{
		CancelButton.click();
	}

}
