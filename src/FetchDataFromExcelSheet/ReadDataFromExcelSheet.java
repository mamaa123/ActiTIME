package FetchDataFromExcelSheet;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcelSheet 
{
	@Test
	public void data() throws IOException
	{
		FileInputStream fis=new FileInputStream("./Excel File/excel data.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);     //or we can also write  "Workbook wb=new XSSFWorkbook(fis);" because Apache POI provide "Workbook" as  super interface of all class         
		
//		Sheet s=wb.getSheet("ashis");	              //-----}	
//		Row r=s.getRow(5);                            //-----}   way of to print the data inside the excel sheet
//		Cell c=r.getCell(2);                          //-----}
//		System.out.println(c.getStringCellValue());   //-----}
		
//		System.out.println(wb.getSheet("ashis").getRow(5).getCell(2).getStringCellValue());      //-----} another way to print the data inside the excel sheet
		
		System.out.println(wb.getSheet("ashis").getRow(5).getCell(2).toString());               //------} another way to print the data inside the excel sheet
	}
}


//------->to read and print the data inside the excel sheet





