package org.trail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\DEEPAK M\\eclipse-workspace\\TrailMaven\\TestData\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook excel = new XSSFWorkbook(stream);
	Sheet sheet = excel.getSheet("trail1");
	int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
	//System.out.println(physicalNumberOfRows);
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		System.out.println("\n");
		Row row = sheet.getRow(i);
	
		for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
	
			Cell cell = row.getCell(j);
			
		int cellType = cell.getCellType();
		if (cellType==1) {
			String stringCellValue = cell.getStringCellValue();
			
			System.out.print(stringCellValue);
			System.out.print("\t");
		}
		
		else {
			double numericCellValue = cell.getNumericCellValue();
		
			System.out.print(numericCellValue);
			System.out.print("\t");
		}
			
			
			
		}
		
	}
	
	
}
}
