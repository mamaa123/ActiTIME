package Framework_Design_Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightingElement_Hepler 
{
	public static void helper(WebDriver driver , WebElement element) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('style' , 'background:red')", element);
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style' , 'background:white')", element);
	}
}



//------highlighting element of a webpage