package org.trail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Gokul2109");
		driver.findElement(By.id("password")).sendKeys("gokul@2109");
		driver.findElement(By.id("login")).click();
		Robot robot = new Robot();
		driver.findElement(By.id("location")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("hotels")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("room_nos")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("adult_room")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("child_room")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_1")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("qwerty");
		driver.findElement(By.id("last_name")).sendKeys("dfghj");
		driver.findElement(By.id("address")).sendKeys("wertyuiopasdfghj");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
		driver.findElement(By.id("cc_type")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("cc_exp_month")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("cc_exp_year")).click();
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		WebElement order = driver.findElement(By.id("order_no"));
		Thread.sleep(6000);
		String text = order.getText();
		System.out.println(text);
		
		 
	}

}
