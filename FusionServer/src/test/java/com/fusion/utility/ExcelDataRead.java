package com.fusion.utility;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) {
		
		
		// Specify the path of file
		String xlspath="C:\\Users\\Administrator\\eclipse-workspace\\FusionServer\\loginData.xlsx";

		//	ExcelDataConfig xlsdata=new ExcelDataConfig(xlspath);

		//String demodata=xlsdata.getData(1,1,1);
		//System.out.println(demodata);


		try {

			//Load the file
			FileInputStream fis=new FileInputStream(xlspath);

			//load the workbook
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			//get the sheet which u want to modify

			XSSFSheet sheet1=wb.getSheetAt(0);

			//get the required row/column
			System.out.println(sheet1.getRow(0).getCell(0).getStringCellValue());
			System.out.println(sheet1.getRow(1).getCell(1).getStringCellValue());	

			//set value on required row and column 
			sheet1.getRow(0).createCell(2).setCellValue("FAIL");

			sheet1.getRow(1).createCell(2).setCellValue("PASS");

			sheet1.getRow(2).createCell(2).setCellValue("FAIL");

			sheet1.getRow(3).createCell(2).setCellValue("PASS");

			// here we need to specify where you want to save file
			FileOutputStream fout=new FileOutputStream(xlspath);

			// finally write content 
			wb.write(fout);
			//close the file
			wb.close();

		} 
		catch (Exception e) {
			System.out.println(e.getMessage());

		}


	}

}
