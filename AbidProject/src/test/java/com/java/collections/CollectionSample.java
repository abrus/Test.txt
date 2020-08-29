package com.java.collections;

import java.util.*;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List x= new ArrayList();
    x.add(10);
    x.add(20);
    x.add(30);
    x.remove(2);
    System.out.println(x);
    
    
    List y= new LinkedList();
    y.add(10);
    y.add(20);
    y.add(30);
    y.add(10);
    y.add(20);
    y.add(30);
    System.out.println(y.size());
    
    Set x1= new HashSet();
    x1.add(10);
    x1.add(20);
    x1.add(30);
    x1.add(10);
    x1.add(20);
    x1.add(30);
    System.out.println(x1);
    
    Map z1= new HashMap();
    z1.put("Ram age", 10);
    z1.put("shyam age", 20);
    z1.put("Geroge age", 30);
    System.out.println(z1);
    System.out.println(z1.get("Ram age"));
    System.out.println(z1.get("shyam age"));
    System.out.println(z1.get("Geroge age"));
    
	}

}
