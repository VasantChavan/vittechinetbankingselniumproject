package com.vittech.inetbanking.utility;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static Workbook workbook;

	public ExcelDataProvider(String filename) {
		try {

			File fs = new File("./TestData/" + filename + ".xlsx");
			FileInputStream fins = new FileInputStream(fs);
			workbook = new XSSFWorkbook(fins);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getRowCount(String sheetname) {
		int rows = workbook.getSheet(sheetname).getLastRowNum();
		return rows;// total number of rows -1
	}

	public int getRowCount(int shetIndex) {
		return workbook.getSheetAt(shetIndex).getLastRowNum(); // total number of rows -1
	}

	public int getCoulumnCount(String sheetname, int row) {
		return workbook.getSheet(sheetname).getRow(row).getLastCellNum(); // It will return you total column within the
																			// sheet
	}

	public int getCoulumnCount(int shetIndex, int row) {
		return workbook.getSheetAt(shetIndex).getRow(row).getLastCellNum(); // It will return you total column within
																			// the sheet
	}

	public String getCellData(String sheetname, int row, int col) {
		return workbook.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	}

	public String getCellData(int sheetIndex, int row, int col) {
		return workbook.getSheetAt(sheetIndex).getRow(row).getCell(col).getStringCellValue();
	}

	public int getCellData(int row, int col, String sheetname) {
		return (int) workbook.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	}
	
	
	public String[][] getCellTestData(String sheetname)
	{
		int rowCount = getRowCount(sheetname);
		int columnCount = getCoulumnCount(sheetname, 0);
		
		System.out.println(rowCount);
		System.out.println(columnCount);
		
		String [][] data = new String[rowCount][columnCount];
		
		for(int i=0; i<rowCount; i++)
		{
			for(int j=0; j<columnCount ;j++)
			{
				data[i][j]=workbook.getSheet(sheetname).getRow(i+1).getCell(j).toString();
			}
		}
		
		return data;
	}

	
}
