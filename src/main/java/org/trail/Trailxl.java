package org.trail;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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

public class Trailxl {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
	
	File f = new File("C:\\Users\\DEEPAK M\\eclipse-workspace\\TrailMaven\\TestData\\Book1.xlsx");
	FileInputStream stream = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(stream);

	Sheet sheet = w.getSheet("trail1");
Row row = sheet.getRow(0);	
Cell cell = row.getCell(0);

String data = cell.getStringCellValue();
WebElement findEleme = driver.findElement(By.id("username"));
findEleme.sendKeys(data);
Cell cell2 = row.getCell(1);
String data1 = cell2.getStringCellValue();
WebElement findElement = driver.findElement(By.id("password"));
findElement.sendKeys(data1);
driver.findElement(By.id("login")).click();

}
}
