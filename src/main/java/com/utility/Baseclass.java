package com.utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.property.Config_Helper;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver BrowserLaunch(String s) throws IOException {
		if(s.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions op= new ChromeOptions();
			op.addArguments("start-maximized");
			driver= new ChromeDriver(op);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		return driver;
		
	}
	
	public void click(WebElement e) {
		e.click();
		
	}
	
	public void sendkeys(WebElement e, String s) {
		e.sendKeys(s);
	}

}
