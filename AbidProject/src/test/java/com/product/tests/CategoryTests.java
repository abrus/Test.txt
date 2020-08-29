package com.product.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.product.admin.pages.AddCategoryPage;
import com.product.admin.pages.CateogoryListPage;
import com.product.admin.pages.Dashboard;
import com.product.admin.pages.LoginPage;

public class CategoryTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://localhost/product/admin/login.php");
		
		LoginPage Login = new LoginPage(driver); //how do we  know how to import which method
		
		Dashboard DsObj = new Dashboard(driver);
		
		CateogoryListPage CatpageObj= new CateogoryListPage(driver);
		
		AddCategoryPage AddNewObj = new AddCategoryPage(driver);
		
		Login.UserDetails();
		DsObj.ClickCategory();
		
		CatpageObj.ClickCategory(); 
		AddNewObj.AddNewCategoryPage();
		

}}
