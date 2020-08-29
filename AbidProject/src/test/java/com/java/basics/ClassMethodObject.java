package com.java.basics;

public class ClassMethodObject {
	public void m1()
	{
		System.out.println("111111");
	}
	
	public void m2(int x, int y)
	{
		int z= x+y;
		System.out.println(z);
	}
	public int m3()
	{ 
		int z= 30+40; 
		return z;
		
	}
	public static void main (String[] args) {
		System.out.println("hai");
		ClassMethodObject obj= new ClassMethodObject();
		obj.m1();
		
		obj.m2(10, 20);
		obj.m2(59, 69);
		int x= obj.m3();
		System.out.println(x);
	}
	}

