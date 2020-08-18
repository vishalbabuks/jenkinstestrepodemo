package com.hrmbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hrmbasetest {
public static WebDriver driver;
	
	public static void launchbrowser(String url) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\hrmsproduct\\drivers\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);		
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	public static void closebrowser() {
		driver.close();
	}
	
	public static void selectoption(WebElement ele,String visibletext) {
		Select sop=new Select(ele);
		sop.selectByVisibleText(visibletext);
	}
	public static void selectoptionbyid(WebElement ele,int indexvalue) {
		Select sop=new Select(ele);
		sop.selectByIndex(indexvalue);
	}

}

