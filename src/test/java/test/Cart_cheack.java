package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cart_cheack {

	public static void main(String[] args) throws Exception {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/?tag=msndeskabkin-21&hvadid=72705384568099&hvqmt=e&hvbmt=be&hvdev=c&ref=pd_sl_5twasf2d2w_e");
     driver.manage().window().maximize();
     WebElement search_Bx=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
     search_Bx.sendKeys("NikeShoes");
     Thread.sleep(1000);
	 System.out.println("xus");
      WebElement sub=driver.findElement(By.xpath("//input[@type='submit']"));
      sub.click();
     WebElement first_opt= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
     first_opt.click();
// List<WebElement> drp=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
   
//   
//
//   for(WebElement opt:drp) {
//   
// 
//    System.out.println(opt.getText()); 	 
//   }
//    
	}

}
