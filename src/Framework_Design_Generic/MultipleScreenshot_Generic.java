package Framework_Design_Generic;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MultipleScreenshot_Generic implements ITestListener
{
	public void onTestFailure(ITestResult result)             
	{
		TakesScreenshot ts=(TakesScreenshot)BaseTestClass_FrameworkDesign.driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		
		String name=result.getName();      //----fetch the test method that get failed
		Date date=Calendar.getInstance().getTime();      //-----fetch the date and time of the failure
		String today=date.toString().replaceAll(":", "-");
		
		File destfile=new File("./FailedScreenshot/" +name+today+ ".png");
		
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
