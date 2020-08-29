package com.java.oops;

public class Polymorphisim2 {
	public void m1()
	{
		System.out.println("Kishore 111111");
	}
	public void m1(int x)
	{
		System.out.println("Kishore 222222");
	}
	public void m1(int y, int z)
	{
		System.out.println("Kishore 33333");
	}
	public void m1(boolean x) {
		System.out.println("Kishore 444444");
	}
	public void assertEqual(String x, String y) {
		if(x.equals(y)) 
			System.out.println("Pass");
		else {
			System.out.println("fail");
		}}
		public void assertEqual(int x, int y) {
			if(x==y) 
				System.out.println("Pass");
			else {
				System.out.println("fail");
			}
	}
	
	
	}

