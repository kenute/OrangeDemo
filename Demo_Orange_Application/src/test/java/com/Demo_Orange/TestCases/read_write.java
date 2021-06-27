package com.Demo_Orange.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_write {

	public static void main(String[] args) throws IOException,NullPointerException {
		// TODO Auto-generated method stub
		
	//	File src=new File("C:\\Users\\91897\\Documents\\Write.xlsx");
		
		try {
			   
			  FileInputStream file = new FileInputStream(new File("C:\\Users\\91897\\eclipse-workspace\\Demo_Orange_Application\\src\\test\\java\\com\\Demo_TestData\\Write.xlsx")); 
			  XSSFWorkbook workbook = new XSSFWorkbook(file);

			  XSSFSheet sheet = workbook.getSheetAt(0);
			  
			  Cell searchText3 = sheet.createRow(10).createCell(10);
			  searchText3.setCellValue("Test Search Keyword13");
			  Cell searchText4 = sheet.createRow(11).createCell(10);
			  searchText4.setCellValue("Test 1234 Search Keyword");
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
		}}