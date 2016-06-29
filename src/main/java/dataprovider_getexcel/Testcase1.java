package dataprovider_getexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wrapper.LinkedInWrapper;

public class Testcase1 extends LinkedInWrapper {

    public String[][] readExcel(String FileName) throws FileNotFoundException
    {
    	FileInputStream fis= new FileInputStream(new File("./data/Login.xlsx"));
    	
    	XSSFWorkbook workbook = new XSSFWorkbook();
    	
    	XSSFSheet sheet = workbook.getSheetAt(0);
    	
    	int rowCount= sheet.getLastRowNum();
    	int columnCount = sheet.getRow(0).getLastCellNum();
    	
    	String [][] data = new String [rowCount][columnCount];
    	
    	for(int i=1; i< rowCount;i++)
    	
    		
    	{
    		XSSFRow row = sheet.getRow(i);
    		
    		for(int j=0; j<columnCount;j++)
    			
    		{
    			String value="";
    			try{
    			XSSFCell cell = row.getCell(j);
    			value = cell.getStringCellValue();
    			}
    			
    			catch(Exception e)
    			{
    				System.out.println(e);
    				
    			}
   			
    			data[i-1][j]= value;    			
    		}
   
    	}
    	
    	return data;
    	    	
    }
    
    @DataProvider(name="excelData")
	public Object[][] getData() throws FileNotFoundException
	{
    	   	   	
    	return new Testcase1().readExcel("Login.xlsx");
     	
    	
	}
	
		
	@Test(dataProvider="excelData")
    public void case1() throws InterruptedException {
        
    	clickByLink("Advanced");
        Thread.sleep(6000);
        enterById("advs-keywords", "key");
        Thread.sleep(6000);
        clickByClassName("submit-advs");
        Thread.sleep(2000);
        String count = removeComa("//*[@id='results_count']/div/p/strong[1]");
        System.out.println("The search count is :" + count);
        String name = getTextByXpath("//*[@id='results']/li[1]/div/h3/a");
        System.out.println("The First connection in the search result : " + name);
        //String actualConnection = getTextByXpath("//*[@id='results']/li[1]/div/h3/span/span/abbr");
        //System.out.println(actualConnection);
//        String connectionOne = "1st";
  //      String ConnectionTwo = "2nd";
        //if (actualConnection.contentEquals(connectionOne)) {
          //  System.out.println("The Connection is 1st connection");
        //} else if (actualConnection.contentEquals(ConnectionTwo)) {
          //  System.out.println("The Connection is 2nd connection");
        }

}
