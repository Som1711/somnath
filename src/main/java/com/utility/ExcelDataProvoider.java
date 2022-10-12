package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvoider {

	public static XSSFWorkbook wb;
	public static FileInputStream fis;
	
	
	public  ExcelDataProvoider() {
		String path="C:\\Users\\Altaf\\eclipse-workspace\\Batch_11\\testdata\\data.xlsx";
		try {
			 fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getStringData(String sheet1,int row,int cell) {
		return wb.getSheet(sheet1).getRow(row).getCell(cell).getStringCellValue();
		
	}
}
