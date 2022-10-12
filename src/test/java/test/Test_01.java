package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test_01 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
        WebDriver w1=new ChromeDriver();
        w1.get("https://www.youtube.com/");
        String rm=RandomString.make(3);
        String path="C:\\Users\\Altaf\\eclipse-workspace\\Batch_11\\Screenshot";
       TakesScreenshot tc=(TakesScreenshot)w1;
       
      File src= tc.getScreenshotAs(OutputType.FILE);
      File dest=new File(path+"//"+rm+".png");
       FileUtils.copyFile(src, dest);
	}

}
