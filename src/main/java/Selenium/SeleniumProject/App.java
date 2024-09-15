package Selenium.SeleniumProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	@Test
	public void excel() throws IOException {
		
		  String filepath="D://TestData_WithTestcase.xlsx";
		FileInputStream fs =new FileInputStream(filepath);
	Workbook wb=	 WorkbookFactory.create(fs);
	org.apache.poi.ss.usermodel.Sheet s=wb.getSheet("Sheet1");
	int row =s.getLastRowNum();
	
	HashMap<String,String> v =new HashMap<String,String>();
	for(int rownum=1;rownum<=row;rownum++) {
		
		int Cell =s.getRow(rownum).getLastCellNum();
		
		for(int cellnum=0;cellnum<=Cell;cellnum++) {
			Cell c =s.getRow(rownum).getCell(cellnum);
			DataFormatter fmt = new DataFormatter();
			
			Cell data=s.getRow(0).getCell(cellnum);
		String d=	fmt.formatCellValue(data);
		
		Cell Header =s.getRow(0).getCell(cellnum);
		
		
		
			
		}
		
		
	}
  
	   
          
           
           
           
           
	}
	
	
   
}
