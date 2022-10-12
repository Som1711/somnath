package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.LoginPom;
import com.utility.BaseClass;
import com.utility.Library;

public class Test_05 extends BaseClass{
@Test
public void tc_01() throws Exception {
	
	LoginPom  login=PageFactory.initElements(driver,LoginPom.class);
	Library.custom_sendKeys(login.getTex_email(), "xyz@gmail.com","email");
	Library.custom_sendKeys(login.getTex_pass(), "12222", "password");
	Library.custom_Click(login.getTex_lgn(), "login button");
	Library.takeScreenshot(driver);
}
}
