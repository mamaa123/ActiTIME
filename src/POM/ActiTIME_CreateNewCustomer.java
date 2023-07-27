package POM;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ActiTIME_CreateNewCustomer 
{
	public WebDriver driver;
	
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement AddnewDropdownButton;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement NewcustomerButton;
	
	@FindBy(xpath = "//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
	private WebElement EnterCustomerNameTextField;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Enter Customer Description\"]")
	private WebElement EnterCustomerDescriptionTextField;
	
	@FindBy(xpath = "//div[@class=\"emptySelection\"]")
	private WebElement SelectCustomerDropdownList;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement CreateCustomerButton;
	
	@FindBy(xpath = "//div[@class=\"greyButton cancelBtn\"]")
	private WebElement CancelButton;
	
	@FindBy(xpath = "(//div[.='ashis123'])[1]/../..//div[@class=\"editButton\"]")
	private WebElement CustomerEditButton;
	
	@FindBy(xpath = "//div[@class=\"editCustomerPanelHeader\"]//div[.='ACTIONS']")
	private WebElement ActionButton;
	
	@FindBy(xpath = "//div[@class=\"taskManagement_customerPanel\"]//div[.='Delete']")
	private WebElement DeleteCustomerButton;
	
	@FindBy(xpath = "//span[.='Delete permanently']")
	private WebElement DeletePermanentlyButton;
	
	@FindBy(xpath = "//div[@class=\"nameDuplicateError inlineErrorMessage leftInlineErrorMessage\"]")
	private WebElement SameNameCreateCustomerErrorMessage;
	
	@FindBy(xpath = "//div[contains(text(),'already exists')]")
	private WebElement CreateCustomerErrorMessage;
	
	
	public ActiTIME_CreateNewCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}
	
	
	public void AddnewDropdownButtonmethod() throws InterruptedException
	{
		Thread.sleep(3000);
		AddnewDropdownButton.click();
	}
	
	public void NewcustomerButtonMethod() throws InterruptedException
	{
		NewcustomerButton.click();
		Thread.sleep(4000);
	}
	
	public void EnterCustomerNameTextFieldMethod()
	{
		EnterCustomerNameTextField.sendKeys("ashis123");
	}
	
	public void EnterCustomerDescriptionTextFieldMethod()
	{
		EnterCustomerDescriptionTextField.sendKeys("i am fine");
	}
	
	public void SelectCustomerDropdownListMethod()
	{
		SelectCustomerDropdownList.click();
	}
	
	public void CreateCustomerButtonMethod() throws InterruptedException
	{
		CreateCustomerButton.click();
		Thread.sleep(4000);
	}
	
	public void CancelButtonMethod()
	{
		CancelButton.click();
	}
	
	public void CustomerEditButtonMethod() throws InterruptedException
	{
		CustomerEditButton.click();
		Thread.sleep(4000);
	}
	
	public void ActionButtonMethod()
	{
		ActionButton.click();
	}
	
	public void DeleteCustomerButtonMethod() throws InterruptedException
	{
		DeleteCustomerButton.click();
		Thread.sleep(3000);
	}
	
	public void DeletePermanentlyButtonMethod() throws InterruptedException
	{
//		DeletePermanentlyButton.click();
//		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", DeletePermanentlyButton);
		Thread.sleep(4000);
	}
	
	public void SameNameCreateCustomerErrorMessageMethod() throws InterruptedException
	{
		Thread.sleep(6000);
		String errormsgtext=SameNameCreateCustomerErrorMessage.getText();
		
		if(errormsgtext.equals("Customer with the specified name already exists"))
		{
			System.out.println("error message text is matching :");
		}
		else
		{
			System.out.println("error message text is not matching");
		}	
	}
	
	public void CreateCustomerErrorMessageMethod()
	{
		String actualTitle=CreateCustomerErrorMessage.getText();
		String expectedTitle="AshisSenapaty";
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("both title are matching");
		s.assertAll();
		System.out.println("getting executed");
	}
}
