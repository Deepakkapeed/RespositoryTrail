package org.trail;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

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

public class TableToXl {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		WebElement table = driver.findElement(By.tagName("table"));
		File f = new File("C:\\Users\\DEEPAK M\\OneDrive\\Documents\\task\\datatableh.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet("trail1");
		WebElement head = table.findElement(By.tagName("thead"));
		WebElement hrow = head.findElement(By.tagName("tr"));
		Row Row1 = sheet.createRow(0);
		List<WebElement> hdata = hrow.findElements(By.tagName("th"));
		
		for (int i = 0; i <hdata.size(); i++) {
			WebElement data = hdata.get(i);
			String text1 = data.getText();
			
			
			Cell Cell1 = Row1.createCell(i);
			Cell1.setCellValue(text1);
			
			
		}
		
	
	
	   WebElement tablebody = table.findElement(By.tagName("tbody"));
			List<WebElement> rowbody = tablebody.findElements(By.tagName("tr"));
			for (int i =0; i<rowbody.size(); i++) {
				WebElement echrowdata = rowbody.get(i);
				
				Row row = sheet.createRow(i+1);
			List<WebElement> datas = echrowdata.findElements(By.tagName("td"));
			for (int j = 0; j < datas.size(); j++) {
				WebElement datavalue = datas.get(j);
			String text = datavalue.getText();
			
			
			Cell cell = row.createCell(j);
			
			
			cell.setCellValue(text);
			
			}	
			
			}
			FileOutputStream stream = new FileOutputStream(f);
			w.write(stream);
				
				driver.quit();
				
			}
		}

	

	
	
	
	
			
		
	