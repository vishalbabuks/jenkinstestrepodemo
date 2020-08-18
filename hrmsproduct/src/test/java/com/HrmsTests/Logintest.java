package com.HrmsTests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrmbase.hrmbasetest;
import com.pageshrm.Loginpage;




public class Logintest {

	Loginpage lp;
	
	@BeforeMethod
	public void openbrowser() {
		
		hrmbasetest.launchbrowser("http://demo.sentrifugo.com/");
		
	}
	
	@Test
	public void getlogin() {
		lp = PageFactory.initElements(hrmbasetest.driver, Loginpage.class);
		lp.login("harris@example.com", "sentrifugo");
	}

}
