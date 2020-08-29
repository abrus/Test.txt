package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
driver.get("http://localhost/product/admin/login.php");
driver.findElement(By.xpath("//*[@id=\"txtusername\"]")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id=\"txtpassword\"]")).sendKeys("admin");
driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

String A= driver.getWindowHandle();
System.out.println(A);
//pls explain for statement gettwindowHandles
for(String child:driver.getWindowHandles()) {
driver.switchTo().window(child);

}
	}
}

