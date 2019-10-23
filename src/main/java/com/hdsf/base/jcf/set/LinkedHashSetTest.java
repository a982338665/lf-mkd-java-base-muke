package com.hdsf.base.jcf.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(null);
		lhs.add(1000);
		lhs.add(20);
		lhs.add(3);
		lhs.add(40000);
		lhs.add(5000000);
		lhs.add(3);                      //3 �ظ�
		lhs.add(null);                   //null �ظ�
		System.out.println(lhs.size());  //6
		if(!lhs.contains(6))
		{
			lhs.add(6);
		}
		System.out.println(lhs.size());  //7
		lhs.remove(4);
		System.out.println(lhs.size());  //6
		//lhs.clear();
		//System.out.println(lhs.size());  //0
		
		System.out.println("============forѭ������=============="); 
	    for(Integer item : lhs)
	    {
	    	System.out.println(item);
	    }
		
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>();
		for(int i=0;i<100000;i++)
		{
			lhs2.add(i);
		}
		traverseByIterator(lhs2);
		traverseByFor(lhs2);
		
	}
	
	public static void traverseByIterator(LinkedHashSet<Integer> hs)
	{
		long startTime = System.nanoTime();
		System.out.println("============����������=============="); 
	    Iterator<Integer> iter1 = hs.iterator();  
	    while(iter1.hasNext()){  
	        iter1.next();  
	    }
		long endTime = System.nanoTime();
	    long duration = endTime - startTime;
	    System.out.println(duration + "����");
	}
	public static void traverseByFor(LinkedHashSet<Integer> hs)
	{
		long startTime = System.nanoTime();
		System.out.println("============forѭ������=============="); 
	    for(Integer item : hs)
	    {
	    	;
	    }
		long endTime = System.nanoTime();
	    long duration = endTime - startTime;
	    System.out.println(duration + "����");
	}
}
