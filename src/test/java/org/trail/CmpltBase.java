package org.trail;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.inst2xsd.util.Element;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CmpltBase {


	
		 public static  WebDriver  driver;
		public static void getDriver(String url) {
		WebDriverManager.chromedriver().setup();
			 driver= new ChromeDriver();
			driver.get(url);
			
		}
		public static void maximize() {
			driver.manage().window().maximize();
		}
		public static void implicityWait(long time) {
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		}
		public static WebElement  Locator(String type,String path) {
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
		public static String excelRead(int rownum, int cellnum) throws IOException {
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
		
		
		public static void sendkeys(WebElement element,String data) {
			element.sendKeys(data);
		}
		public static void click(WebElement element) {
			element.click();
		}
		public  String getTitle() {
			String title = driver.getTitle();
			return title;
		}
		public static String getText(WebElement element) {
			String text = element.getText();
			return text;
		}
		public  String getcurrenturl() {
			 String currentUrl = driver.getCurrentUrl();
			return currentUrl;
			 
		}
		
		public static void closetab() {
			driver.close();
		}
		public static  void closeAlltab() {
			driver.quit();
		}
		public  void actionsBymovetoelement(WebElement element) {
			Actions a = new Actions(driver);
			a.moveToElement(element).perform();
		}
		public  void actionsByclick(WebElement element) {
			Actions a = new Actions(driver);
			a.click(element).perform();
		}
		public  void actionsBycontextclick(WebElement element) {
			Actions a = new Actions(driver);
			a.contextClick(element).perform();
		}
		public  void actionsBydoubleclick(WebElement element) {
			Actions a = new Actions(driver);
			a.doubleClick(element).perform();
		}
		public  void actionsBydraganddrop(WebElement element,WebElement element1) {
			Actions a = new Actions(driver);
			a.dragAndDrop(element, element1).perform();
		}
		
		public  void alertByAccept() {
			Alert a= driver.switchTo().alert();
			a.accept();
		}
		public  void alertByDismiss() {
			Alert a= driver.switchTo().alert();
			a.dismiss();
		}
		
		public  void alertBySendkeys(String data) {
			Alert a= driver.switchTo().alert();
			a.sendKeys(data);
		}
		
			
		public  void getScreenShot(String path) throws Exception {
			
			TakesScreenshot ts =(TakesScreenshot)driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File f= new File(path);
			FileUtils.copyFile(screenshotAs, f);
			
		}
		public static  void selectByIndex(WebElement element,int a) {
			Select s= new Select(element);
			s.selectByIndex(a);
		}
		public  void selectByVisibleText(WebElement element,String data) {
			Select s= new Select(element);
			s.selectByVisibleText(data);
		}
		public  void selectByValue(WebElement element,String data) {
			Select s= new Select(element);
			s.selectByValue(data);
		}
		public  void deselectByIndex(WebElement element,int a) {
			Select s= new Select(element);
			s.deselectByIndex(a);
		}
		public  void deselectByVisibleText(WebElement element,String data) {
			Select s= new Select(element);
			s.deselectByVisibleText(data);
		}
		public  void deselectByValue(WebElement element,String data) {
			Select s= new Select(element);
			s.deselectByValue(data);
		}
		public  void deselectAll(WebElement element) {
			Select s= new Select(element);
			s.deselectAll();
		}
		public void getFirstSelectedOptions(WebElement element) {
			Select s= new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
		}
		public  void isMultiple(WebElement element) {
			Select s= new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
		}
		
		
		public  void frameByIndex(int a) {
			driver.switchTo().frame(a);
		}
		public  void frame(WebElement element) {
			driver.switchTo().frame(element);
		
		
		}
		
		public  void windowSwitch(String s) {
			driver.switchTo().window(s);
		
}
		 public static String getattribute(WebElement element,String atname) {
			 String attribute = element.getAttribute(atname);
			return attribute;
			
		 }
	
			
		}

