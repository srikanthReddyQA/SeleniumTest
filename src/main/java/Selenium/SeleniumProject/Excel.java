package Selenium.SeleniumProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {

	public List<Map<String, String>> excelread() throws IOException {
		

	FileInputStream fs= new FileInputStream("D://TestData_WithTestcase.xlsx");
	
	XSSFWorkbook w =new XSSFWorkbook(fs);
	XSSFSheet sh =w.getSheet("Sheet1");
  int RoW=   sh.getPhysicalNumberOfRows();
  System.out.println(RoW);
  
  List<Map<String,String>> data=new ArrayList<Map<String,String>>();
  
  for(int i=1;i<RoW;i++) {
	  Row row = sh.getRow(i);
	  int cell =row.getPhysicalNumberOfCells();
	  HashMap<String,String>map= new HashMap<String, String>();
	  String header = null;
	  String value = null;
	//  System.out.println(cell);
	  
	  for(int j=0;j<cell;j++) {
		  DataFormatter df = new DataFormatter();
		  Row row1 = sh.getRow(0);
		  
		   header=  df.formatCellValue(row1.getCell(j));
		   value=  df.formatCellValue(row.getCell(j));
			  //System.out.println(value1 +"---" +value2); 
		   map.put(header, value);
		  
	  }
	 data.add(map);
		  
  }
  return data;
	}
	
	@Test
	public void getdata() throws IOException {
		 Map<String, String>map= new HashMap<String, String>();
		List<Map<String,String>> data=	excelread();
		  List<Map<String,String>> Tdata=new ArrayList<Map<String,String>>();	
		
		for(int i=0;i<data.size();i++) {
			
			map=data.get(i);
			String TC=map.get("Test case");
			//String us=map.get("UserName");
			//String pass=map.get("Password");
			//System.out.println(TC +"----" +us + "--"+pass +"--" +i);
			
			if(TC.equalsIgnoreCase("Test1")) {
				
				Tdata.add(map)	;
				
			}
			
		}
		
		 Map<String, String>map2= new HashMap<String, String>();
		for(int i=0;i<Tdata.size();i++) {
			map2=Tdata.get(i);
			String TC=map2.get("Test case");
			String us=map2.get("UserName");
			String pass=map2.get("Password");
			System.out.println(TC +"----" +us + "--"+pass +"--" +i);
			
			
		}
		
	}
}
