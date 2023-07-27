package Framework_Design_Generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenShot_Generic implements ITestListener         //-----"ITestListener" is a interface and "ctrl+click" to open that interface
{
	public void onTestFailure(ITestResult result)             
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTestClass_FrameworkDesign.driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./FailedScreenshot/failed1.png");
		
		try
		{
			FileHandler.copy(srcfile, destfile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}


//-----call the method