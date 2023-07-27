package Framework_Design_Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_Facebook_For_Framework extends Method_Stored_BasePage implements AutoConstant
{
	 public WebDriver driver;
		
	 @FindBy(xpath = "//a[.='Create new account']")
	 private WebElement createnewaccount;
	 
	 @FindBy(xpath = "//input[@name=\"firstname\"]")
	 private WebElement firstname;
	 
	 @FindBy(xpath = "//input[@aria-label=\"Surname\"]")
	 private WebElement surname;
	 
	 @FindBy(xpath = "//input[@name=\"reg_email__\"]")
	 private WebElement mobilenumber;
	 
	 @FindBy(xpath = "//input[@aria-label=\"New password\"]")
	 private WebElement newpassword;
	 
	 @FindBy(xpath = "//select[@title=\"Day\"]")
	 private WebElement birthday;
	 
	 @FindBy(xpath = "//select[@title=\"Month\"]")
	 private WebElement birthmonth;
	 
	 @FindBy(xpath = "//select[@title=\"Year\"]")
	 private WebElement birthyear;
	 
	 @FindBy(xpath = "//label[.='Male']")
	 private WebElement gender;
	 
	 @FindBy(xpath = "(//button[contains(text(),'Sign Up')])[1]")
	 private WebElement signupbuttom;
	 
	 
	 public POM_Facebook_For_Framework(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 
	 public void CreateNewAccountMethod() throws InterruptedException
	 {
		 javascriptclick(driver, createnewaccount);
		 Thread.sleep(5000);
		 
	 }
	 
	 public void SignupMethod() throws InterruptedException, IOException
	 {
		 HighlightingElement_Hepler.helper(driver, firstname);
		 firstname.sendKeys(ExcelLibrary.getCellValue(sheet_name2, 4, 0));
		 
		 HighlightingElement_Hepler.helper(driver, surname);
		 surname.sendKeys(ExcelLibrary.getCellValue(sheet_name2, 4, 1));
		 
		 HighlightingElement_Hepler.helper(driver, mobilenumber);
		 mobilenumber.sendKeys(ExcelLibrary.getCellValue(sheet_name2, 5, 0));
		 
		 HighlightingElement_Hepler.helper(driver, newpassword);
		 newpassword.sendKeys(ExcelLibrary.getCellValue(sheet_name2, 6, 0));
	 }
	 
	 public void BirthDayMethod() throws InterruptedException
	 {
		 Select select=new Select(birthday);
		 select.selectByVisibleText("13"); 
	 }
	 
	 public void BirthMonthMethod()
	 {
		 Select select=new Select(birthmonth);
		 select.selectByVisibleText("Apr"); 
	 }
	 
	 public void BirthYearMethod()
	 {
		 Select select=new Select(birthyear);
		 select.selectByVisibleText("1995"); 
	 }
	 
	 public void GenderMethod()
	 {
		 javascriptclick(driver, gender);
	 }
	 
	 public void SignUpButtomMethod()
	 {
		 javascriptclick(driver, signupbuttom);
	 }
	 
	 

}
