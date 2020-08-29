package com.java.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSam{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
        driver.get("http://demo.automationtesting.in/Alerts.html");
        //driver.findElement(By.id("header")).click();
        Alert D= driver.switchTo().alert();
        System.out.println(D);
        D.accept();
        // Why not able to identify the page using locators 
        //Why I am not able to click on Switchto and select alerts 
	}

}
