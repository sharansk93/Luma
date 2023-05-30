package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.Homepage;
import com.pages.Singletendesignpattern;
import com.utility.Baseclass;

import groovyjarjarantlr4.v4.codegen.model.Action;
import hooks.hook;
import io.cucumber.java.en.*;

public class stepdefinition extends Baseclass {
	Singletendesignpattern s;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public static WebDriver driver = hook.driver;
	
	@Given("Launch the URL")
	public void launch_the_url() throws InterruptedException, AWTException {
		s = new Singletendesignpattern(driver);
		

		Thread.sleep(3000);
		Actions a= new Actions(driver);
		a.moveToElement(s.getHomepage().getMen()).build().perform();
		
		Thread.sleep(3000);
		
		
		a.moveToElement(s.getHomepage().getTops()).build().perform();
		

		
		Thread.sleep(2000);
		
		a.moveToElement(s.getHomepage().getJackets()).build().perform();
		a.click().perform();
		

		
	    
	}

	@When("I add a product to the Cart")
	public void i_add_a_product_to_the_cart() {
		
		click(s.getProductpage().getPro());
	   
	}

	@When("I enter the size and colour proceed to check out")
	public void i_enter_the_size_and_colour_proceed_to_check_out() throws InterruptedException {
		
		click(s.getProductpage().getXs());
		click(s.getProductpage().getColour());
		click(s.getProductpage().getAdd());
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].click();", s.getProductpage().getCart());
		js.executeScript("arguments[0].click();", s.getProductpage().getCheckout());
//		click(s.getProductpage().getCart());
//		click(s.getProductpage().getCheckout());
//		
	    
	}

	@When("I enter all the details and place the order")
	public void i_enter_all_the_details_and_place_the_order() throws InterruptedException {
		Thread.sleep(4000);
		sendkeys(s.getcheckout().getMail(), "abc@gmail.com");
		sendkeys(s.getcheckout().getFirst(), "xyz");
		sendkeys(s.getcheckout().getLast(), "aaa");
		sendkeys(s.getcheckout().getCompany(), "zzz");
		sendkeys(s.getcheckout().getStreet(), "www");
		sendkeys(s.getcheckout().getCity(), "newyork");
		
		WebElement reg = s.getcheckout().getReg();
		
		Select sh= new Select(reg); 
		List<WebElement> options = sh.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			if(text.equalsIgnoreCase("Alaska")) {
				webElement.click();
				break;
			}
			
		}
		
		sendkeys(s.getcheckout().getPostcode(), "12345");
		WebElement country = s.getcheckout().getCountry();
		Select cc=new Select(country);
		List<WebElement> options2 = cc.getOptions();
		for (WebElement webElement : options2) {
			String text = webElement.getText();
			if(text.equalsIgnoreCase("Ukraine")) {
				webElement.click();
				break;
			}
		}
		
		sendkeys(s.getcheckout().getTelephone(), "9999999999");
//		click(s.getcheckout().getFlatrate());
		
		Thread.sleep(5000);
		
		
	  
	}

	@Then("I print the order ID")
	public void i_print_the_order_id() throws InterruptedException {
		
//		WebDriverWait wait= new WebDriverWait(driver, 10);
//		WebElement until = wait.until(ExpectedConditions.elementToBeClickable(s.getcheckout().getNext()));
//		until.click();
//		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(s.getcheckout().getNext())));
		click(s.getcheckout().getNext());
		
		Thread.sleep(5000);
		
		click(s.getcheckout().getPlaceorder());
		System.out.println("Order Id is "+ s.getcheckout().getOrderid().getText());
//		WebElement next = s.getcheckout().getNext();
//		next.click();
//		js.executeScript("arguments[0].click();", s.getcheckout().getNext());
	
	}


}
