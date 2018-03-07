package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {

	/**
	 * 	Will read Excel file for test data
	 * @throws IOException
	 */
	/*public static void getexceldata() throws IOException
    {
   	 FileInputStream fis = new FileInputStream(new File("E:\\Amita_system\\backup\\Testing\\TestData.xlsx"));  
   	 XSSFWorkbook wb = new XSSFWorkbook(fis);
   	 XSSFSheet sh = wb.getSheet("Data");
   
   	
   		
   		String fi = sh.getRow(1).getCell(1).getStringCellValue();
   		System.out.println(fi); 
   		GMethods.clickidd("firtsmem", fi);
   		String la = sh.getRow(1).getCell(2).getStringCellValue();
   		System.out.println(la); 
   		GMethods.clickidd("lastname", la);
     
   
    }*/

	/**
	 * 	Will read Excel file for test data
	 * @throws IOException
	 */
	public static String getexceldata(int r, int c) throws IOException
    {
	
   	 FileInputStream fis = new FileInputStream(new File("E:\\Amita_system\\backup\\Testing\\TestData.xlsx"));  
   	 XSSFWorkbook wb = new XSSFWorkbook(fis);
   	 XSSFSheet sh = wb.getSheet("Data");
   	 XSSFCell cell = sh.getRow(r).getCell(c);
   	 cell.setCellType(cell.CELL_TYPE_STRING); 
      		
   	//	String cellData = sh.getRow(r).getCell(c).getStringCellValue();
   		String cellData = cell.getStringCellValue();
   		
   		return cellData;
    }

}
