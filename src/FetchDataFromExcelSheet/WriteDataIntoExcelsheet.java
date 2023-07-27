package FetchDataFromExcelSheet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataIntoExcelsheet 
{
	@Test
	public void WriteData() throws IOException 
	{
		FileInputStream fis=new FileInputStream("./Excel File/excel data.xlsx");
		Workbook wb=new XSSFWorkbook(fis);
		Sheet s=wb.createSheet("important");
		Row r=s.createRow(5);
		Cell c=r.createCell(7);
		c.setCellValue("i am done !!!...");
		
		FileOutputStream fos=new FileOutputStream("./Excel File/excel data.xlsx");
		wb.write(fos);		
	}
}




//-------->create a sheet and write the data into excel sheet
