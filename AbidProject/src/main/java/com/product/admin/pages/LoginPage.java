package com.product.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { 
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//*[@id=\"txtusername\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"txtpassword\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	WebElement submit;
	
	public void UserDetails() {
		username.clear();
		username.sendKeys("admin");
		
		password.clear();
		password.sendKeys("admin");
		
		submit.click();
	
	}

}
