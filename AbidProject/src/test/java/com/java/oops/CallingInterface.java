package com.java.oops;

public class CallingInterface implements Interface {

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("kishore is great ");
	}

	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("kishore is macho ");
	}

	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("kishore is super ");
	}

	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("kishore is intresting ");
	}
public static void main (String args[])
{
	CallingInterface obj= new CallingInterface();
	obj.m1();
	obj.m2();
	obj.m3();
	obj.m4();
}
}
