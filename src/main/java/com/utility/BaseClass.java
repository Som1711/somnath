package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ExcelDataProvoider e1;
	public static ConfigDataProvoider confi;
	@BeforeSuite
	public void bs() {
		e1=new ExcelDataProvoider();
		confi=new ConfigDataProvoider();
	}
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	} 
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
