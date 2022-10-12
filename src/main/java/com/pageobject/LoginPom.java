package com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
	
	@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement tex_email;
    @FindBy(how=How.XPATH,using="//input[@id='pass']") private WebElement tex_pass;
    @FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement tex_lgn;
	public WebElement getTex_email() {
		return tex_email;
	}
	public WebElement getTex_pass() {
		return tex_pass;
	}
	public WebElement getTex_lgn() {
		return tex_lgn;
	}
	
	

}
