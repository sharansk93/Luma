package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Singletendesignpattern {
	
public static WebDriver driver;

private Checkout c;
private Homepage hp;
private Productpage p;
	
	public Singletendesignpattern(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	public Checkout getcheckout() {
		c= new Checkout(driver);
		return c;
	}
	
	public Homepage getHomepage() {
		hp= new Homepage(driver);
		return hp;
	}
	
	public Productpage getProductpage() {
		p= new Productpage(driver);
		return p;
	}

}
