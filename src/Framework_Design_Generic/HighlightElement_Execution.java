package Framework_Design_Generic;

import java.io.IOException;

import org.testng.annotations.Test;

public class HighlightElement_Execution extends BaseTestClass_FrameworkDesign
{
     @Test
     public void hightlight() throws IOException, InterruptedException
     {
    	 POM_for_FrameworkImplementation high=new POM_for_FrameworkImplementation(driver);
    	 high.loginMethod();
     }
}



//------highlight the actitime login text field
