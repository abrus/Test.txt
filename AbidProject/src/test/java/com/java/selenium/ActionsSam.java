package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://localhost/product/");
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"categories\"]/div[1]/ul/li[1]/a"))).build().perform();
		
		
	}

}
