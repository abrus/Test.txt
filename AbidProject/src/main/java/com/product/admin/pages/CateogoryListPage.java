package com.product.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CateogoryListPage {
	WebDriver driver;
	public CateogoryListPage(WebDriver driver) {
	this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}

		@FindBy(xpath="//*[@id=\"page\"]/div[2]/div[1]/div[1]/h2")
		WebElement CategoryList;
		
				
		public void ClickCategory() {
			
			
			CategoryList.click();}
			
		

	

}
