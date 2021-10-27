package org.trail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class XltoXl {
	private static Sheet createSheet;

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DEEPAK M\\eclipse-workspace\\TrailMaven\\TestData\\Book1.xlsx");
		
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		File g = new File("C:\\Users\\DEEPAK M\\OneDrive\\Documents\\task\\xltoxl.xlsx");
		Workbook xl = new XSSFWorkbook();
		Sheet sheet = w.getSheet("trail1");
		createSheet = xl.createSheet("copy");
       
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
        	Row row = sheet.getRow(i);Row createRow =createSheet.createRow(i);
        	for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			if (cellType==1) {
				String stringCellValue = cell.getStringCellValue();
				
				
				Cell createCell = createRow.createCell(j);
				createCell.setCellValue(stringCellValue);
				
			} else {
				double numericCellValue = cell.getNumericCellValue();
				
				Cell cell2 = createRow.getCell(j);
				cell2.setCellValue(numericCellValue);

			}
			
			
			}
			
		}
 
		FileOutputStream stream1 = new FileOutputStream(g);
		xl.write(stream1);
		
	
	
	}

}
