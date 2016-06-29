package getexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ToRead_MultipleRows_MultipleColumns {

	@Test
	public void readExcelData() throws IOException
	{
		FileInputStream input = new FileInputStream("./data/TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int countRow = sheet.getLastRowNum();
		
		for (int i=1; i<= countRow;i++)
		{
		
		XSSFRow row = sheet.getRow(i);
		
		int countColumn = row.getLastCellNum();
		
		for (int j=0;j<countColumn;j++)
		{
		XSSFCell cell = row.getCell(j);
		
		System.out.println(cell.getStringCellValue());
		}
		
		}

		
	}

	
	
}
