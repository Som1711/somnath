package test;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TekchandTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.osc.ca/en/investors/investor-warnings-and-alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int count=0;
		driver.findElement(By.xpath("//button[@class='agree-button eu-cookie-compliance-default-button primary-light']")).click();
		List<WebElement> name;
		try {
		 name=driver.findElements(By.xpath("//div[@class='table-listings__content']//a"));
		}
		catch(StaleElementReferenceException e) {
			name=driver.findElements(By.xpath("//div[@class='table-listings__content']//a"));
		}
		List<String> urls;
		
		for(WebElement companies:name)
		
		{
	
			System.out.println(companies.getText());
			System.out.println(companies.getAttribute("href"));
			String url=companies.getAttribute("href");
			driver.get(url);
			//driver.findElement(By.xpath("//button[@class='agree-button eu-cookie-compliance-default-button primary-light']")).click();
			WebElement ele1=driver.findElement(By.xpath("//div[@class='info-card__table__row__value']//time[@class='datetime']"));
			System.out.println(ele1.getText());
			List <WebElement> addre=driver.findElements(By.xpath("//div[@class='addresses container mt-1 mb-4']//div[@class='my-1 font-weight-normal']"));
		
			for(WebElement add:addre) {
				System.out.println(add.getText());
				List <WebElement> city=driver.findElements(By.xpath("//div[@class='addresses container mt-1 mb-4']//span[@class='font-weight-normal']"));
				int i=0;
				for(WebElement cit:city) {
					
					if(i<2) {
					System.out.println(cit.getText());
					
					
					}
					
					if(i>=2) {
						System.out.println(cit.getText());
						System.out.println(i);
					}
					
				}
				i++;
			}
			driver.navigate().back();
			count++;
		}

		
		WebElement next_btn=driver.findElement(By.xpath("//a[@title='Go to next page']"));
		
		try{
			next_btn.isEnabled();
			}
		catch(StaleElementReferenceException e) {
			next_btn=driver.findElement(By.xpath("//a[@title='Go to next page']"));
		}
		
		
		while(next_btn.isEnabled()) {
			next_btn.click();
			
			List<WebElement> com_name=driver.findElements(By.xpath("//div[@class='table-listings__content']//a[@aria-label]"));
			for(WebElement companies:com_name) {
				System.out.println(companies.getText());
				System.out.println(companies.getAttribute("href"));
				count++;
			
			}
			try {
			next_btn=driver.findElement(By.xpath("//a[@title='Go to next page']"));
			}
			catch(NoSuchElementException e) {
				
			}
		}
		System.out.println(count);
	}
	

}
