package com.java.selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
driver.get("http://localhost/product/login.php");

driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id=\"f1\"]/div[4]/input")).click();
String x= driver.getWindowHandle();
System.out.println(x);
//driver.quit();
		}

}
