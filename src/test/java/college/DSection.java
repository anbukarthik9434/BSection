package college;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DSection {
	public static void main (String []args) throws Throwable  {
     File f= new File ("C:\\Users\\Anbuabhi\\Desktop\\ExcelWrite.xlsx");
     Workbook w= new XSSFWorkbook();
     Sheet s= w.createSheet("Excel");
     Row r = s.createRow(0);
     for (int i= 0;i<5;i++) {
    	 Cell cell = r.createCell(i);
    	 cell.setCellValue("Anbu");
    	 
     }		
     FileOutputStream f2= new FileOutputStream(f);
     w.write(f2);
     f2.close();
    		 
    		 
    	 
    	 
     
	 
	  

		
		
		
		
		
		
		
    	 
     	
		
}
}