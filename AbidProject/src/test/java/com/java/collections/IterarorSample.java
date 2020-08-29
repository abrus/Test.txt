package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class IterarorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List x= new ArrayList();
	    x.add(10);
	    x.add(20);
	    x.add(30);
	   System.out.println(x);
	   
	   Iterator  itr= x.iterator();
	   while(itr.hasNext())
	   {
	   System.out.println(itr.next());
	   }
	}
//why is iterator declaration like this ?? and why it is x.iterator ?
}
