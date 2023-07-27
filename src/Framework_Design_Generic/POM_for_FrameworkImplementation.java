package Framework_Design_Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POM_for_FrameworkImplementation extends Method_Stored_BasePage implements AutoConstant
{
    public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernameTextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[.='Logout']")
	private WebElement logoutbuttom;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement taskbuttom;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewdropdown;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcustomer;
	
	@FindBy(xpath = "//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
	private WebElement entercustomerfield;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement enterdescriptionfield;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createcustomerbuttom;
	
	@FindBy(xpath = "(//div[@class=\"menu_icon\"])[2]")
	private WebElement settingbuttom;
	
	@FindBy(xpath = "//a[.='Types of Work']")
	private WebElement typeofworkbuttom;
	
	@FindBy(xpath = "//span[.='Create Type of Work']")
	private WebElement createtypeofworkbuttom;
	
	@FindBy(xpath = "//input[@name=\"name\"]")
	private WebElement nametextfield;
	
	@FindBy(xpath = "//input[@value=\"   Create Type of Work   \"]")
	private WebElement createtypeofworksummit;
	
	@FindBy(xpath = "//a[.='Ashis']/../..//a[contains(text(),'delete')]")
	private WebElement deletetypeofwork;
	
	@FindBy(xpath = "(//div[.='Ashis'])[1]/../..//div[@class=\"editButton\"]")  //
	private WebElement CustomerEditButton;
	
	@FindBy(xpath = "//div[@class=\"editCustomerPanelHeader\"]//div[.='ACTIONS']")
	private WebElement ActionButton;
	
	@FindBy(xpath = "//div[@class=\"taskManagement_customerPanel\"]//div[.='Delete']")
	private WebElement DeleteCustomerButton;
	
	@FindBy(xpath = "//span[.='Delete permanently']")
	private WebElement DeletePermanentlyButton;
	
	@FindBy(xpath = "//a[.='Leave Types']")
	private WebElement leavetype;
	
	@FindBy(xpath = "//span[.='Create Leave Type']")
	private WebElement createleavetype;
	
	@FindBy(xpath = "//input[@placeholder=\"Leave Type Name\"]")
	private WebElement leavetypetextfield;
	
	@FindBy(xpath = "//div[@class=\"buttonIcon\"]/..//span[.='Create Leave Type']")
	private WebElement summitleavetype;
	
	@FindBy(xpath = "//span[.='tapi']/../../../../../..//td[@class=\"leaveTypeDeleteCell last\"]")
	private WebElement deleteleave;
	
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
	
	public void LogoutMethod() throws InterruptedException
	{
		Thread.sleep(4000);
		javascriptclick(driver, logoutbuttom);
	}
	
	public void TaskButtomMethod()
	{
		javascriptclick(driver, taskbuttom);
	}
	
	public void AddnewDropdownButtom()
	{
		javascriptclick(driver, addnewdropdown);
	}
	
	public void NewCustomerButtomMethod() throws InterruptedException
	{
		javascriptclick(driver, newcustomer);
		Thread.sleep(4000);
	}
	
	public void EnterCustomerFieldMethod() throws InterruptedException, IOException
	{
		HighlightingElement_Hepler.helper(driver, entercustomerfield);
		entercustomerfield.sendKeys(ExcelLibrary.getCellValue(sheet_name, 6, 0));
//		HighlightingElement_Hepler.helper(driver, enterdescriptionfield);
//		enterdescriptionfield.sendKeys(ExcelLibrary.getCellValue(sheet_name, 7, 0));
		javascriptclick(driver, createcustomerbuttom);
		Thread.sleep(4000);
	}
	
	public void CustomerEditMethod() throws InterruptedException
	{
		javascriptclick(driver, CustomerEditButton);
		Thread.sleep(4000);
	}
	
	public void ActionMethod()
	{
		javascriptclick(driver, ActionButton);
	}
	
	public void deleteMethod()
	{
        javascriptclick(driver, DeleteCustomerButton);
	}
	
	public void PermanentDeleteMethod()
	{
		javascriptclick(driver, DeletePermanentlyButton);
	}
	
	public void CreateTypeOfWorkMethod() throws InterruptedException
	{
		Thread.sleep(3000);
		javascriptclick(driver, settingbuttom);
		Thread.sleep(3000);
	}
	
	public void TypeOfWorkButtomMethod() throws InterruptedException
	{
		javascriptclick(driver, typeofworkbuttom);
		Thread.sleep(3000);
	}
	
	public void CreateTypeOfWorkButtomMethod() throws InterruptedException
	{
		javascriptclick(driver, createtypeofworkbuttom);
		Thread.sleep(3000);
	}
	
	public void TypeOfWorkNameMethod() throws InterruptedException, IOException
	{
		HighlightingElement_Hepler.helper(driver, nametextfield);
		nametextfield.sendKeys(ExcelLibrary.getCellValue(sheet_name, 10, 0));
	}
	
	public void CreateTypeOfWorkSummitMethod() throws InterruptedException
	{
		javascriptclick(driver, createtypeofworksummit);
		Thread.sleep(3000);
	}
	
	public void DeleteTypeOfWorkMethod() throws InterruptedException
	{
		javascriptclick(driver, deletetypeofwork);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void LeaveTypeMethod() throws InterruptedException
	{
		javascriptclick(driver, leavetype);
		Thread.sleep(3000);
	}
	
	public void CreateLeaveTypeMethod() throws InterruptedException
	{
		javascriptclick(driver, createleavetype);
		Thread.sleep(3000);
	}
	
	public void LeaveTypeTextFieldMethod()
	{
		leavetypetextfield.sendKeys("tapi");
	}
	
	public void SummitLeaveTypeMethod() throws InterruptedException
	{
		javascriptclick(driver, summitleavetype);
		Thread.sleep(3000);
	}
	
	public void DeleteLeaveMethod()
	{
		javascriptclick(driver, deleteleave);
		driver.switchTo().alert().accept();
	}
}


//In framework design we will inherit classes, interfaces in POM class




