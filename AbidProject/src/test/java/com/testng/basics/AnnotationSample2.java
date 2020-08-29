package com.testng.basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSample2 {
	@Test 
	public void m1() {
		System.out.print("33333");
	}
		@BeforeTest
		public void m3()
		{
			System.out.println("111111");
			}
		
		@AfterTest
		public void m2()
		{
			System.out.println("222222");
			}
	}
