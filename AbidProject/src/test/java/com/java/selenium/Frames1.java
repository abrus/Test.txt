package com.java.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.java.extra.BaseConfig;

public class Frames1 {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		driver.switchTo().frame("iframeResult");
		String A= driver.findElement(By.xpath("/html/body/h1")).getText();
		System.out.println(A);
		driver.switchTo().defaultContent();
		driver.quit();
			}

	}


