package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {
	
public static WebDriver driver;
	
	public Checkout(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//input[@id='customer-email'])[1]")
	private WebElement mail;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement first;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement last;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='street[0]']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//select[@name='region_id']")
	private WebElement reg;
	
	@FindBy(xpath="//input[@name='postcode']")
	private WebElement postcode;
	
	@FindBy(xpath="//select[@name='country_id']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='telephone']")
	private WebElement telephone;
	
	@FindBy(xpath="//input[@value='flatrate_flatrate']")
	private WebElement flatrate;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement Next;
	
	
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement Placeorder;
	
	@FindBy(xpath="//p//span")
	private WebElement orderid;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getStreet() {
		return street;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getReg() {
		return reg;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getTelephone() {
		return telephone;
	}

	public WebElement getFlatrate() {
		return flatrate;
	}

	public WebElement getNext() {
		return Next;
	}

	public WebElement getPlaceorder() {
		return Placeorder;
	}

	public WebElement getOrderid() {
		return orderid;
	}
	
	
	
	

}
