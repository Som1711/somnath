package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_04 {

	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
           driver.get("https://demo.guru99.com/test/newtours/register.php");
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.manage().window().maximize();
        
           driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Automation");
           driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Testing");
           driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9765262463");
           driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("xyz@abc.com");
           driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Selenium");
           driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Java");
           driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Bugspoter");
           driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("411222");
           driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bugspotter");
           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Som@17");
           driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Som@17");
          WebElement drp_country= driver.findElement(By.xpath("//select[@name='country']"));
           Select sr=new Select(drp_country);
           sr.selectByVisibleText("INDIA");
           System.out.println(sr.getFirstSelectedOption().getText());
           WebElement submit_button=  driver.findElement(By.xpath("//input[@name='submit']"));
           if(submit_button.isEnabled()) {
        	   submit_button.click();
           }
           else {
        	   System.out.println("Enter correct info");
           }
         WebElement sign_in= driver.findElement(By.xpath("//a[text()=' sign-in ']"));
         sign_in.click();
          Thread.sleep(2000);
   
         
         String rm=RandomString.make(5);
         String path="C:\\Users\\Altaf\\eclipse-workspace\\Batch_11\\Screenshot";
        TakesScreenshot tc=(TakesScreenshot) driver;
        
       File src= tc.getScreenshotAs(OutputType.FILE);
       File dest=new File(path+"//"+rm+".png");
        FileUtils.copyFile(src, dest);
       
	}

}
