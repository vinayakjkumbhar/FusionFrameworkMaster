package com.fusion.utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {

	//String excelPath="C:\\Users\\Administrator\\eclipse-workspace\\FusionServer\\loginData.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sheet1;

	public ExcelDataConfig(String excelPath)

	{

		try
		{
			File src=new File(excelPath);
			// load file
			FileInputStream fis=new FileInputStream(src);
			// load workbook
			wb=new XSSFWorkbook(fis);

		}

		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}

	}

	public String getData (int sheetNumber,int row,int column)
	{
		// Load sheet- Here we are loading sheet as per received parameter.
		sheet1= wb.getSheetAt(sheetNumber);

		// getRow() specify which row we want to read.
		// and getCell() specify which column to read.
		// getStringCellValue() specify that we are reading String data.


		String data=sheet1.getRow(row).getCell(column).getStringCellValue();

		return data;

	}
	
	
	
}

