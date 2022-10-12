package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_03 {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/Altaf/Desktop/loginpage.html");
      driver.manage().window().maximize();
      driver.findElement(By.name("username")).sendKeys("xyz");
      driver.findElement(By.name("PW")).sendKeys("asddf");
      driver.getCurrentUrl();
	}

}
