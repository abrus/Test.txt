package com.java.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
driver.get("http://freshtohome.com");
driver.findElement(By.className("level-top")).click();
String actual= driver.getCurrentUrl();
String expected= "https://ae.freshtohome.com/fish";
Assert.assertEquals(expected, actual);
driver.quit();
		}

}
