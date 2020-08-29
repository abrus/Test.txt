package com.java.oops;

public class Polymorphisim1 extends Polymorphisim2 {
	public void m1()
	{
		System.out.println("111111");
	}
	public void m1(int x)
	{
		System.out.println("222222");
	}
	public void m1(int y, int z)
	{
		System.out.println("33333");
	}
	public void m1(boolean x) {
		System.out.println("444444");
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
	
	public static void main (String args[]) {
		Polymorphisim1 obj= new Polymorphisim1();
		obj.m1();
		obj.m1(10);
		obj.m1(20,30);
		obj.m1(true);
		obj.assertEqual(10, 10);
		obj.assertEqual("Hai","Heloo");
		Polymorphisim2 obj2= new Polymorphisim2();
		obj2.m1();
		obj2.m1(20);
		obj2.m1(50,70);
		obj2.m1(true);
		
	}
}
