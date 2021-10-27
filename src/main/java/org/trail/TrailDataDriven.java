package org.trail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TrailDataDriven {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\DEEPAK M\\eclipse-workspace\\TrailMaven\\TestData\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook excel =new XSSFWorkbook(stream);
	Sheet sheet = excel.getSheet("trail1");
	 for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		 Row row = sheet.getRow(i);
		System.out.print("\n");
		 for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			 Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			
			if (cellType==1) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println("\t");
				System.out.print(stringCellValue);
				
			}
			else {
				double numericCellValue = cell.getNumericCellValue();
				long l = (long)numericCellValue;
				System.out.println("\t");
				System.out.print(l);
			}
			 
			
		}
		
	}
	
	
	
	
		
}
}
