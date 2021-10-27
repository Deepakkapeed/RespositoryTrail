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

public class Datarewrite {
	public static void main(String[] args) throws IOException {
		File f =  new File("C:\\Users\\DEEPAK M\\eclipse-workspace\\TrailMaven\\TestData\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("trail1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String cellvalue = cell.getStringCellValue();
		if (cellvalue.equals("Gokul2109")) {
			cell.setCellValue("JavaProgram");
		
			FileOutputStream stream1= new FileOutputStream(f);
			w.write(stream1);
					
		}
		}
	
		
		
	}


