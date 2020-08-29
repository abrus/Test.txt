package com.java.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://localhost/product/user_product_upload.php");
		TakesScreenshot scrShot= ((TakesScreenshot)driver);
		File ScrFile= scrShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScrFile,new File("C:\\screenshot\\Kishore.jpg"));
		driver.quit();
	}

}
