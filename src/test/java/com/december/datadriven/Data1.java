package com.december.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data1 {

	private static void getdata() throws IOException {
		
		File f = new File("C:\\Users\\tmani\\eclipse-workspace\\datadriven\\Excel\\Maran.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(0);
		
		Cell cell = r.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
			
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			
			int value =(int) numericCellValue;
			System.out.println(value);
			
		}
	}
	
	private static void getalldata() throws IOException {
	
		File ff = new File("C:\\Users\\tmani\\eclipse-workspace\\datadriven\\Excel\\Maran.xlsx");
		
		FileInputStream ffs = new FileInputStream(ff);
		
		Workbook ww = new XSSFWorkbook(ffs);
		
		Sheet ss = ww.getSheetAt(0);
		
		int pp = ss.getPhysicalNumberOfRows();
		for (int i = 0; i < pp; i++) {
			Row row = ss.getRow(i);
					
		int cc = row.getPhysicalNumberOfCells();	
				for (int j = 0; j <cc; j++) {
					Cell cell = row.getCell(j);
					CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				
				int value = (int)numericCellValue;
				System.out.println(value);
				}
		}			
		}
	}	
	
	public static void main(String[] args) throws IOException {
		getalldata();
	}
}
