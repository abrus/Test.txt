package com.product.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	WebDriver driver;
	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//*[@id=\"page\"]/div[2]/div[1]/a[2]")
	WebElement Category;
	
	@FindBy(xpath="//*[@id=\"page\"]/div[2]/div[1]/a[3]/img")
	WebElement RegisteredList;
	
	
	public void ClickCategory() {
		
		
		Category.click();}
		
		public void Registerlink() {
			
			
			RegisteredList.click();
			
	}

}
