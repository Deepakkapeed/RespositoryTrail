package org.trail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatareadXl {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\DEEPAK M\\OneDrive\\Documents\\task\\dataread.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("trail1");
		Row row = sheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("JavaProgramm");
		FileOutputStream stream = new FileOutputStream(f);
		w.write(stream);
		
		
		
		
		
		
	}

}
