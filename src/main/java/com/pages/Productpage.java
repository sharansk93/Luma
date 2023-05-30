package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	
public static WebDriver driver;
	
	public Productpage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Proteus Fitness Jackshirt ')]")
	private WebElement pro;
	
	
	@FindBy(xpath="//div[@option-label='XS']")
	private WebElement xs;
	
	
	
	@FindBy(xpath="//div[@option-label='Blue']")
	private WebElement colour;
	
	
	

	@FindBy(xpath="//span[text()='Add to Cart']")
	private WebElement add;

	@FindBy(xpath="//a//span[text()='My Cart']")
	private WebElement cart;


	@FindBy(xpath="//button[text()='Proceed to Checkout']")
	private WebElement checkout;
	
	
	public WebElement getCart() {
		return cart;
	}




	public WebElement getCheckout() {
		return checkout;
	}




	public static WebDriver getDriver() {
		return driver;
	}




	public WebElement getPro() {
		return pro;
	}




	public WebElement getXs() {
		return xs;
	}




	public WebElement getColour() {
		return colour;
	}




	public WebElement getAdd() {
		return add;
	}


}
