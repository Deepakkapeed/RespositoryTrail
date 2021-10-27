package org.trail;



import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail1 {
	public static void main(String[] args) throws AWTException, InterruptedException, FileNotFoundException {
		
	
	
	File f = new File("C:\\Users\\DEEPAK M\\eclipse-workspace\\TrailMaven\\TestData\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook w = new XSSFWorkbook();

	Sheet sheet = w.getSheet("trail1");
Row row = sheet.getRow(0);	
Cell cell = row.getCell(0);

String data = cell.getStringCellValue();
System.out.println(data);

	
}
}
