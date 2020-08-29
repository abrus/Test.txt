package com.testng.basics;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

import jxl.Sheet;
import jxl.*;

public class XLSsample{
	
	WebDriver driver;

	@DataProvider(name = "Registeration")
    public Object[][] createData1() throws Exception{
        Object[][] retObjArr=getTableArray("C:\\Users\\abrus\\OneDrive\\Desktop\\Testxls.xls",
                "Sheet1", "Register");
        return(retObjArr);
	}
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		 driver = new ChromeDriver(); 
		driver.get("http://localhost/product/register.php");
	}
	
	//@AfterTest
	//public void Final() {
	//driver.quit();
	
	
	
	
@Test(priority=1, dataProvider="Registeration")
	public void b_m1(String user, String password, String mobile,String email)
	{
		driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys(mobile);
				
	}
        public String[][] getTableArray(String xlFilePath, String sheetName, String tableName) throws Exception{
            String[][] tabArray=null;
            
                Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
                Sheet sheet = workbook.getSheet(sheetName); 
                int startRow,startCol, endRow, endCol,ci,cj;
                Cell tableStart=sheet.findCell(tableName);
                startRow=tableStart.getRow();
                startCol=tableStart.getColumn();

                Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                

                endRow=tableEnd.getRow();
                endCol=tableEnd.getColumn();
                System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                        "startCol="+startCol+", endCol="+endCol);
                tabArray=new String[endRow-startRow-1][endCol-startCol-1];
                ci=0;

                for (int i=startRow+1;i<endRow;i++,ci++){
                    cj=0;
                    for (int j=startCol+1;j<endCol;j++,cj++){
                        tabArray[ci][cj]=sheet.getCell(j,i).getContents();
                    }
                }
                
                return(tabArray);
        }
        
}
