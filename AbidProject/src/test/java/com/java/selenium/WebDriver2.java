package com.java.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.extra.BaseConfig;

public class WebDriver2 extends BaseConfig {
	public static void main (String args[]) {
BaseConfig obj= new BaseConfig();
obj.launchBrowser();
	
driver.get("http://freshtohome.com");
driver.findElement(By.className("level-top")).click();
String actual= driver.getCurrentUrl();
String expected= "https://ae.freshtohome.com/fish";
Assert.assertEquals(expected, actual);
System.out.println("BALAN IS A BENGALI"); 
driver.quit();
		}

}