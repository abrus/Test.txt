package com.product.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
	WebDriver driver;
	public AddCategoryPage(WebDriver driver) {
	this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}

		@FindBy(xpath="//*[@id=\"passwordid\"]/form/table/tbody/tr[5]/td[3]/input")
		WebElement AddCategoryPage;
		
		
		@FindBy(xpath="//*[@id=\"passwordid\"]/form/table/tbody/tr[7]/td[3]/input")
		WebElement PostCategoryPage;
		
		public void AddNewCategoryPage() {
			
			AddCategoryPage.clear();
			AddCategoryPage.sendKeys("Cateogory");
			
			PostCategoryPage.click();
				
			}
			
		
			

}
