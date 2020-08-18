package com.pageshrm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpage {
	
	
	
	
	
	@FindBy(how = How.XPATH,using = "//input[@id='username']")
	 
	 @CacheLookup
	 
	 WebElement username;
	
	@FindBy(how = How.XPATH,using = "//input[@id='password']")
	 
	 @CacheLookup
	 
	 WebElement password;
	
	@FindBy(how = How.XPATH,using = "//input[@id='loginsubmit']")
	 
	 @CacheLookup
	 
	 WebElement loginsub;

	public void login(String un,String pass) {
		
		username.sendKeys(un);
		password.sendKeys(pass);
		loginsub.click();
	}
}
