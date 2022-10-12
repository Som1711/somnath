package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Custom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

	}
public static void custom_Screenshot(WebDriver driver) throws Exception {
	 String rm=RandomString.make(5);
     String path="C:\\Users\\Altaf\\eclipse-workspace\\Batch_11\\Screenshot";
    TakesScreenshot tc=(TakesScreenshot) driver;
    
   File rc= tc.getScreenshotAs(OutputType.FILE);
   File dest=new File(path+"//"+rm+".png");
    FileUtils.copyFile(rc, dest);
}
public static void getScrollInto_element(WebDriver driver,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0]", element);
	
}
}
