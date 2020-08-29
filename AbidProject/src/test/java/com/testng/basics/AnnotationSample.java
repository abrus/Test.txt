package com.testng.basics;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.product.admin.pages.AddCategoryPage;
import com.product.admin.pages.CateogoryListPage;
import com.product.admin.pages.Dashboard;
import com.product.admin.pages.LoginPage;

public class AnnotationSample {
	
ExtentHtmlReporter htmlReporter;
    
    ExtentReports extent;
    //helps to generate the logs in test report.
    ExtentTest test;
    
	WebDriver driver;

	@BeforeTest
	public void m1() {
		test = extent.createTest("Test Case m1");
htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		 driver = new ChromeDriver(); 
		driver.get("http://localhost/product/admin/login.php");
		
	}
		@Test
		public void m2() {
			test = extent.createTest("Test Case m2");
		LoginPage Login = new LoginPage(driver); //how do we  know how to import which method
		
		Dashboard DsObj = new Dashboard(driver);
		
		CateogoryListPage CatpageObj= new CateogoryListPage(driver);
		
		AddCategoryPage AddNewObj = new AddCategoryPage(driver);
		
		Login.UserDetails();
		DsObj.ClickCategory();
		
		CatpageObj.ClickCategory(); 
		AddNewObj.AddNewCategoryPage();
		}	


@AfterMethod
public void getResult(ITestResult result) {
    if(result.getStatus() == ITestResult.FAILURE) {
        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
        test.fail(result.getThrowable());
    }
    else if(result.getStatus() == ITestResult.SUCCESS) {
        test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
    }
    else {
        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
        test.skip(result.getThrowable());
    }
}

@AfterTest
public void tearDown() {
	//to write or update test information to reporter
    extent.flush();
}
}