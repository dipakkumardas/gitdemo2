package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FatchDataExcel {

	public static void main(String[] args) throws IOException {
		
		
		// How to Read Data From the Excel Sheet By Using Apache POI
		
		// Below option is not Required we can directly pass the File path on File Input Stream 
		//File f = new File("D:\\OfficeProject\\YouTube\\TestData.xlsx");
		//FileInputStream fs = new FileInputStream(f);

		FileInputStream fs = new FileInputStream("D:\\OfficeProject\\YouTube\\TestData\\TestData.xlsx");
		
		// Create A WorkBook Class Object
		// XSLX - Class name will start from XSSF and in case of XLS , Class name start with HSSF.
			
		XSSFWorkbook wk = new XSSFWorkbook(fs); 
		XSSFSheet s1 = wk.getSheet("Sheet1");
		XSSFRow r1 = s1.getRow(0);
		XSSFCell c1 = r1.getCell(0);
		System.out.println(c1.getStringCellValue());
		// To Get No of Row From The Excel sheet
		//System.out.println("The Total Physical No of Row is :"+s1.getPhysicalNumberOfRows());
		// Find the Last index
		//System.out.println("Last Index of the Row is :"+s1.getLastRowNum());
		
		XSSFRow r11 = s1.getRow(2);
		System.out.println(r11.getPhysicalNumberOfCells());
		
		
		

	}

}
