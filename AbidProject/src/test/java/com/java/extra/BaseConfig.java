package com.java.extra;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseConfig {
	public static WebDriver driver;
	public void launchBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver(); 

}
}
