package TestReader;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadXLSX {
	
	public void display() throws IOException
	{
		FileInputStream fi= new FileInputStream("C:\\Users\\Hussain\\eclipse-workspace\\Sample_Maven_Project\\src\\main\\resources\\TestData\\TestData.xls");
	    HSSFWorkbook wb = new HSSFWorkbook(fi);
	    HSSFSheet ws= wb.getSheet("Sheet1");
	    HSSFRow row= ws.getRow(1);
	    HSSFCell cell1=row.getCell(0);
	    HSSFCell cell2=row.getCell(1);
	    HSSFCell cell3=row.getCell(2);
	    
	    System.out.println(cell1);
	    System.out.println(cell2);
	    System.out.println(cell3);
	}
	
	public static void main(String[] args) throws IOException
	{
		ReadXLSX obj = new ReadXLSX();
		obj.display();
	}

}
