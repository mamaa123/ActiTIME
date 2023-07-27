package String_2D_Array_Assignment;

import org.testng.annotations.DataProvider;

public class ActiTIME_DataProvider 
{
	
	@DataProvider(name = "LoginDataString2D")
	public String[][] passdata()
	{
		String[][] data = {
			                 {"admin" , "manager"},
			                 {"ashis" , "senapaty"},
			                 {"subhashree" , "mohanty"},
			                 {"yasobant" , "babu"},
			                 {"subhrajit" , "sir"}
		                  };
		return data;
	}
	
	
//------>5 different credential for actiTIME login text field ,saved by "DataProvider" using 'string 2D array'
	
	
	@DataProvider(name = "LoginDataObject2D")
	public Object[][] passdata1()
	{
		Object[][] data = {
                             {"admin" , "manager"},
                             {"ashis" , "senapaty"},
                             {"subhashree" , "mohanty"},
                             {"yasobant" , "babu"},
                             {"subhrajit" , "sir"}
                          };
		return data;
	}
	
//------>5 different credential for actiTIME login text field ,saved by "DataProvider" using 'object 2D array'
	
	
	@DataProvider(name = "CustomerAndDescriptionString2D")
	public String[][] passdata2()
	{
		String[][] data = {
			                 {"ashis" , "good boy"},
			                 {"senapaty" , "good boy"},
			                 {"subhashree" , "good girl"},
			                 {"yasobant" , "good boy"},
			                 {"subhrajit" , "nice boy"}
		                  };
		return data;
	}
	
	
//------>Create 5 different set of customer and description ,saved by "DataProvider" using 'string 2D array'
	

	
	@DataProvider(name = "CustomerAndDescriptionObject2D")
	public Object[][] passdata3()
	{
		Object[][] data = {
			                 {"ashis" , "good boy"},
			                 {"senapaty" , "good boy"},
			                 {"subhashree" , "good girl"},
			                 {"yasobant" , "good boy"},
			                 {"subhrajit" , "nice boy"}
		                  };
		return data;
	}
	
	
//------>Create 5 different set of customer and description ,saved by "DataProvider" using 'object 2D array'
	
	
	@DataProvider(name = "FacebookSignupString2D")
	public String[][] passdata4()
	{
		String[][] data = {
			                 {"ashis" , "senapaty" , "1234567890" , "gotit"},
			                 {"senapaty" , "good boy" , "5342385667" , "fhfjj"},
			                 {"subhashree" , "good girl", "6765367887" , "fyyhfg"},
			                 {"yasobant" , "good boy" , "4596360959" , "sssseee"},
			                 {"subhrajit" , "nice boy" , "9876543267" , "qaqaqe"}
		                  };
		return data;
	}

	
//------>Create 5 different set of firstname,surname,mobile no and new password of facebook signup page, 
// saved by "DataProvider" using 'string 2D array'
	
}



