package test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_02 {

	public static void main(String[] args) throws Exception {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.getCurrentUrl();
      driver.getTitle();

      driver.manage().window().maximize();
      Thread.sleep(1000);
      driver.navigate().to("https://www.makemytrip.com/");
      driver.navigate().back();
      Thread.sleep(1000);
    
      driver.findElement(By.name("email")).sendKeys("9989898990");
      driver.getTitle();
      driver.findElement(By.name("pass")).sendKeys("232323");
      driver.findElement(By.name("login")).click();
     
	}

}
