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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	WebDriver driver;
	public void browserLaunch(String URL) {
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	driver.get(URL);
	 
}
	public String excelRead(int rownum, int cellnum) throws IOException {
		String data ;
		File f = new File("C:\\Users\\DEEPAK M\\eclipse-workspace\\TrailMaven\\TestData\\asactindata.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook excel =new XSSFWorkbook(stream);
		Sheet sheet = excel.getSheet("Sheet1");
		 Row row = sheet.getRow(rownum);
		 Cell cell = row.getCell(cellnum);
			int cellType = cell.getCellType();
			
			if (cellType==1) {
				data= cell.getStringCellValue();
				}

			else {
				double numericCellValue = cell.getNumericCellValue();
				long l =(long) numericCellValue;
				data = String.valueOf(l);
				
			}
			return data;
			
			
			
				
		
	}
	
	
	public WebElement  Locator(String type,String path) {
	if (type.equals("id")) {
		WebElement findElement = driver.findElement(By.id(path));
		return findElement;
	}
	else if (type.equals("name")) {
		WebElement findElement = driver.findElement(By.name(path));
		return findElement;
	}
	else  {
			WebElement findElement = driver.findElement(By.xpath(path));	
			return findElement;
	}
	

}
	
    public void txtsend(WebElement element,String value) {
    	element.sendKeys(value);
		
	}
	 public void click(WebElement element) {
    	element.click();
		// TODO Auto-generated method stub
}
	
	
	
	public void selectByIndex(WebElement element,int index) {
		 Select select = new Select(element);
		 select.selectByIndex(index);
		 
	}

public void clear(WebElement element) {
element.clear();	

}
public String getattribute(WebElement element,int rownum,int cellnum) {
	File g = new File("C:\\Users\\DEEPAK M\\OneDrive\\Documents\\task\\bookingid.xlsx");
	Workbook ex =new XSSFWorkbook();
	
	Sheet sheet = ex.createSheet("Sheet1");
	Row createRow = sheet.createRow(rownum);
	Cell createCell = createRow.createCell(cellnum);
	 String attribute = element.getAttribute("value");
	createCell.setCellValue(attribute);
	return attribute;
	
	
}

public void toCloseAll() {
	// TODO Auto-generated method stub
driver.quit();
}
}


	

	




