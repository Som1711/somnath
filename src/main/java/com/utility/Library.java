package com.utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import net.bytebuddy.utility.RandomString;

public class Library {
 public static ExtentTest test;
 
 
 
    public static void custom_sendKeys(WebElement element ,String value,String fieldname) {
    	try {
    	element.sendKeys(value);
    	test.log(Status.PASS, fieldname+"value send="+value);
    	}
    	catch(Exception e) {
    		test.log(Status.FAIL, e.getMessage());
    	}
    }
    public static void custom_Click(WebElement element,String fieldname) {
    	try {
    		element.click();
    		test.log(Status.PASS, "cliked"+fieldname);
    	}
    	catch(Exception e) {
    		test.log(Status.FAIL, e.getMessage());
    		
    	}
    	
    }
	
	public static void takeScreenshot(WebDriver driver) throws Exception {
		  String rm=RandomString.make(5);
	         String path="C:\\Users\\Altaf\\eclipse-workspace\\Batch_11\\Screenshot";
	        TakesScreenshot tc=(TakesScreenshot) driver;
	        
	       File src= tc.getScreenshotAs(OutputType.FILE);
	       File dest=new File(path+"//"+rm+".png");
	        FileUtils.copyFile(src, dest);
	       
	}
	public static void getDropdownHandle(WebElement element,String value) {
		Select sle =new Select(element);
		List<WebElement>opt=sle.getOptions();
		for(WebElement elem:opt) {
			System.out.println(elem.getText());
			if(elem.getText().equalsIgnoreCase(value)) {
				elem.click();
			}
			
		}
	}
	public static void scroll_intoelemnt(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].scrollIntoView", element);
	}
	public static void getExplicitWait(WebDriver driver,WebElement element,long time) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void custom_mousemovement(WebDriver driver ,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}
	public static Alert custom_handleAlert(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		return alt;
	}
}
