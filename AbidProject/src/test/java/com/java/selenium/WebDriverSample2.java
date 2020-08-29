package com.java.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
        driver.get("http://demo.automationtesting.in/Register.html");
        String title= driver.getTitle();
        System.out.println(title);
        
driver.findElement((By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"))).click();
driver.findElement(By.className("ng-scope")).click();

//driver.quit();
		}

}
