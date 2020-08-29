package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
driver.get("http://www.w3schools.com");
JavascriptExecutor js = (JavascriptExecutor) driver;  
js.executeScript("window.scrollBy(0,2000)");
WebElement A= driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div[1]/h3"));
js.executeScript("arguments[0].scrollIntoView();", A);
	}

}
