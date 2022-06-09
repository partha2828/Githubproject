package org.base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public static WebDriver chromebrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver browserlaunch(String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (bname.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (bname.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		return driver;
	}

	public static void urlLaunch(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement a, String value) {
		a.sendKeys(value);

	}

	public static void click(WebElement e) {
		e.click();

	}

	public static void quit() {
		driver.quit();
	}

	public static String getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getText(WebElement c) {
		String text2 = c.getText();
		return text2;
	}

	public static String geturl(String d) {
		driver.get("");
		return d;
	}

	public static void implicity(int e) {
		driver.manage().timeouts().implicitlyWait(e, TimeUnit.SECONDS);
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void close() {
		driver.close();
	}

	public static String getAttribute(WebElement f,String b) {
		String attribute = f.getAttribute("value");
		return attribute;

	}

	public static void MoveToElement(WebElement tar) {
		Actions a = new Actions(driver);
		a.moveToElement(tar).perform();
	}

	public static void dragAnddrop(WebElement src, WebElement tar) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tar);
	}

	public static void contextclick() {
		Actions a = new Actions(driver);
		a.contextClick();

	}

	public static void doubleclick() {
		Actions a = new Actions(driver);
		a.doubleClick();
	}

	public static void Selectbyindex(WebElement h, int a) {
		Select s = new Select(h);
		s.selectByIndex(a);
	}

	public static void deselectbyindex(WebElement i, int a) {
		Select s = new Select(i);
		s.deselectByIndex(a);
	}

	public static void SelectbyValue(WebElement j, String b) {
		Select s = new Select(j);
		s.selectByValue(b);

	}

	public static void deselectbyvalue(WebElement k, String b) {
		Select s = new Select(k);
		s.deselectByValue(b);
	}

	public static void SelectbyVisibleText(WebElement l, String c) {
		Select s = new Select(l);
		s.selectByVisibleText(c);
	}

	public static void deselectByVisibleText(WebElement m, String c) {
		Select s = new Select(m);
		s.deselectByValue(c);
	}

	public static void getwindows(int a) {
		Set<String> allid = driver.getWindowHandles();
		List<String> li = new LinkedList<String>();
		li.addAll(allid);
		driver.switchTo().window(li.get(a));
	}

	public static void JSE(WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", a);
	}
	
	public static  String readexcel(String filename,String sheet,int row,int cel) throws IOException {
	File f=new File ("C:\\Users\\partha.hp\\eclipse-workspace\\Maven_Project\\src\\test\\resources\\Excel\\"+filename+".xlsx");
		FileInputStream st=new FileInputStream(f);
		 Workbook w=new XSSFWorkbook(st);
		 
		 Sheet s = w.getSheet(sheet);
		 Row r = s.getRow(row);
		 Cell cell = r.getCell(cel);
		 int type = cell.getCellType();
		 
		 String Value=null;
		 
		 if(type==1) {
		  Value = cell.getStringCellValue();

		 }
		 else {
			 if(DateUtil.isCellDateFormatted(cell)) {
				 Date dateCellValue = cell.getDateCellValue();
				 SimpleDateFormat sd=new SimpleDateFormat("dd-MMM=yyyy");
				  Value = sd.format(dateCellValue);

			 }
			 else {
				 double numericCellValue = cell.getNumericCellValue();
				 long l=(long)numericCellValue;
				  Value= String.valueOf(l);

			 }
		 
		 }
		return Value;
	
	}
	public static void keyEnter( ) throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void keyDown() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
	public static  void thread(int a) throws InterruptedException {
		Thread.sleep(0);

	}
}
		
	








