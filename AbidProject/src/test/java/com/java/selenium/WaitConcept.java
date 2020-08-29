package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.java.extra.BaseConfig;

public class WaitConcept {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://localhost/product/user_product_upload.php");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
Select A= new Select(driver.findElement(By.xpath("//*[@id=\"drop_1\"]")));
A.selectByVisibleText("testing123");

WebDriverWait wait= new WebDriverWait(driver,20);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"f1\\\"]/fieldset/table/tbody/tr[1]/td[8]")));
		Select B= new Select(driver.findElement(By.xpath("//*[@id=\"f1\"]/fieldset/table/tbody/tr[1]/td[8]")));
B.selectByVisibleText("subtesting123");			}

	}
//To check code with Karthick