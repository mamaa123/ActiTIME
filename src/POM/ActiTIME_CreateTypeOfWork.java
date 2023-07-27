package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTIME_CreateTypeOfWork 
{
	//Declaration
	
	public WebDriver driver;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement CreateTypeOfWorkLink;
	
	@FindBy(xpath = "//label[.='All (active and archived)']")
	private WebElement AllActiveAndArchivedRadioButton;
	
	@FindBy(xpath = "//label[.='Active only']")
	private WebElement ActiveOnlyRadioButton;
	
	@FindBy(xpath = "//label[.='Archived only']")
	private WebElement ArchivedOnlyRadioButton;
	
	@FindBy(xpath = "//label[.='All (billable and non-billable)']")
	private WebElement AllBillableAndNonBillableRadioButton;
	
	@FindBy(xpath = "//label[.='Billable only']")
	private WebElement BillableOnlyRadioButton;
	
	@FindBy(xpath = "//label[.='Non-Billable only']")
	private WebElement NonBillableOnlyRadioButton;
	
	@FindBy(xpath = "//input[@value=\"Show Types of Work\"]")
	private WebElement ShowTypesOfWorkLink;
	
	@FindBy(xpath = "//a[.='senapaty']/../..//a[contains(text(),'delete')]")
	private WebElement DeleteTypeOfWorkLink;
	
	//Initialization
	
	public ActiTIME_CreateTypeOfWork(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public void CreateTypeOfWorkMethod()
	{
		CreateTypeOfWorkLink.click();
	}
	
	public void AllActiveAndArchivedRadioButtonMethod()
	{
		AllActiveAndArchivedRadioButton.click();
	}
	
	public void ActiveOnlyRadioButtonMethod()
	{
		ActiveOnlyRadioButton.click();
	}
	
	public void ArchivedOnlyRadioButtonMethod()
	{
		ArchivedOnlyRadioButton.click();
	}
	
	public void AllBillableAndNonBillableRadioButtonMethod()
	{
		AllBillableAndNonBillableRadioButton.click();
	}
	
	public void BillableOnlyRadioButtonMethod()
	{
		BillableOnlyRadioButton.click();
	}
	
	public void NonBillableOnlyRadioButtonMethod()
	{
		NonBillableOnlyRadioButton.click();
	}
	
	public void ShowTypesOfWorkMethod()
	{
		ShowTypesOfWorkLink.click();
	}
	
	public void DeleteTypeOfWorkMethod() throws InterruptedException
	{
		DeleteTypeOfWorkLink.click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}

}
