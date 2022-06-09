package org.junit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JunitSample {
	
	static WebDriver driver;
@BeforeClass
public static void beforeclass() {
System.out.println("Before class");
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http://adactinhotelapp.com/");
}
	
@Before
public void before() {
	System.out.println("before");
Date d=new Date();
System.out.println("Test start time "+d);
}
@After
public void after() {
System.out.println("after");
Date d= new Date();
}
@Test
public void test1() {
  driver.findElement(By.name("username")).sendKeys("parthaaaa");;
  driver.findElement(By.name("password")).sendKeys("9790048935");;
	
}
@Test
public void test2() {

	driver.findElement(By.name("login")).click();
}
	@AfterClass
	public static void afterclass() {
driver.quit();
	}
}
