package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataJava {

public static void main(String[] args) throws IOException {
	
	
	File f=new File ("C:\\Users\\partha.hp\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\Excel\\Adactin Hotel.xlsx");
FileInputStream st=new FileInputStream(f);
 Workbook w=new XSSFWorkbook(st);
 
 Sheet s = w.getSheet("Sheet1");
 Row r = s.getRow(1);
 Cell cell = r.getCell(2);
 int type = cell.getCellType();
 System.out.println(type);
 
 if(type==1) {
 String stringCellValue = cell.getStringCellValue();
 System.out.println(stringCellValue);
 }
 else {
	 if(DateUtil.isCellDateFormatted(cell)) {
		 Date dateCellValue = cell.getDateCellValue();
		 SimpleDateFormat sd=new SimpleDateFormat("dd-MMM=yyyy");
		 String format = sd.format(dateCellValue);
		 System.out.println(format);
	 }
	 else {
		 double numericCellValue = cell.getNumericCellValue();
		 long l=(long)numericCellValue;
		 String valueOf = String.valueOf(l);
		 System.out.println(valueOf);
	 }
 }
}
 
}	
 

