package Object_2D_Array_assignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchDataFrom_JaggedArray 
{
    @Test(dataProvider = "data")
    public void login(Object[] obj)
    {
    	for(int i=0;i<obj.length;i++)
    	{
    		System.out.println(obj[i]+ " ");
    	}
    	System.out.println();
    	System.out.println("____________");
    }
    
    @DataProvider(name = "data")
    public Object[][] passdata()
    {
    	Object[][] data= {
    			            {"admin" , "manager"},
    			            {"samprati"},
    			            {"ashis" , "kumar" , "senapaty"}
                         };
		return data;
    }
}



//(qus.-fetching data from jagged array)
//-------> jagged array means in data provider different size arrguments passed 
