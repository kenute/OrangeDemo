package com.Orange_Demo_Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class XLUtils_Orange {
	
	public static FileOutputStream fo;
	public static FileInputStream fi;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	static String ProjectPath1=System.getProperty("user.dir");
	static String xlfile = ProjectPath1+"\\src\\test\\java\\com\\Demo_TestData\\selenium data sheet.xlsx";
	static String xlfile1= ProjectPath1+"\\src\\test\\java\\com\\Demo_TestData\\Write.xlsx";
	static String xlsheet="Style example";
	static String xlsheet1="Sheet1";
	public  int getRowCount(String xlsheet) throws IOException 
	{
		
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		int rowcount=ws.getLastRowNum();
		wb.close();
		fi.close();
		return rowcount;		
	}
	
	
	public  int getCellCount(String xlsheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		row=ws.getRow(rownum);
		int cellcount=row.getLastCellNum();
		wb.close();
		fi.close();
		return cellcount;
	}

	public void  writeIO(int rownum,int colnum,String data) throws IOException,NullPointerException, InterruptedException {
	
		try {
			FileInputStream file = new FileInputStream(new File("C:\\Users\\91897\\eclipse-workspace\\Demo_Orange_Application\\src\\test\\java\\com\\Demo_TestData\\Write.xlsx")); 
			  XSSFWorkbook workbook = new XSSFWorkbook(file);

		//	XSSFSheet sheet = workbook.getSheet(xlsheet1);
			  
			  
 XSSFSheet sheet = workbook.getSheetAt(0);
			  
			  Cell searchText3 = sheet.getRow(rownum).createCell(colnum);
	
			searchText3.setCellValue(data);
		
			  System.out.println(data);
			  
			  
			  
			  
			  
			  

			  file.close();
			  FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\91897\\eclipse-workspace\\Demo_Orange_Application\\src\\test\\java\\com\\Demo_TestData\\Write.xlsx"));
			  workbook.write(outFile);
			  outFile.close();

			 } catch (FileNotFoundException fnfe) {
			  fnfe.printStackTrace();
			 } catch (IOException ioe) {
			  ioe.printStackTrace();
			 }
		catch (NullPointerException op){
			op.printStackTrace();	}
		}



	public  String getCellData(int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		
		String data;
		try 
		{
			String cellData= ws.getRow(rownum).getCell(colnum).getStringCellValue();
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		wb.close();
		fi.close();
		return data;
}
	public  Object[][] getexcelalldata(int Row2) throws IOException
	{
		String data[][]=null;
		fi=new FileInputStream(xlfile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlsheet);
		XSSFRow row = ws.getRow(1);
		//int	lastrow = 1;
	int	lastrow=ws.getPhysicalNumberOfRows();
	System.out.println(lastrow);
	int lastcol=row.getPhysicalNumberOfCells();
	System.out.println(lastcol);
	data = new String[lastrow-1][lastcol];
		
		try 
		{
			for(int i=1;i<lastrow-2;i++) {
				for(int j=0;j<lastcol;j++) {
					data[i-1][j]= ws.getRow(i).getCell(j).getStringCellValue();
		            
				}}}
			
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		wb.close();
		fi.close();
		return data;
	}}
