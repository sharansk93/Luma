package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public static WebDriver driver;
	
	public Homepage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a//span[text()='Men']")
	private WebElement Men;

	public static WebDriver getDriver() {
		return driver;
	}


	public WebElement getMen() {
		return Men;
	}
	
	@FindBy(xpath="//span[text()='Men']//parent::a//following-sibling::ul//span[text()='Tops']//parent::a//following-sibling::ul//span[text()='Jackets']")
	private WebElement Jackets;
	
	
	
	@FindBy(xpath="//span[text()='Men']//parent::a//following-sibling::ul//span[text()='Tops']")
	private WebElement Tops;
	
	public WebElement getTops() {
		return Tops;
	}
	
	public WebElement getJackets() {
		return Jackets;
	}

}
