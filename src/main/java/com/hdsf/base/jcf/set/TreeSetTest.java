package com.hdsf.base.jcf.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		// ts.add(null);  ���󣬲�֧��null
		ts.add(1000);
		ts.add(20);
		ts.add(3);
		ts.add(40000);
		ts.add(5000000);
		ts.add(3);                      //3 �ظ�
		System.out.println(ts.size());  //5
		if(!ts.contains(6))
		{
			ts.add(6);
		}
		System.out.println(ts.size());  //6
		ts.remove(4);
		System.out.println(ts.size());  //5
		//lhs.clear();
		//System.out.println(lhs.size());  //0
		
		System.out.println("============forѭ������=============="); 
	    for(Integer item : ts)
	    {
	    	System.out.println(item);
	    }
	    
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		for(int i=0;i<100000;i++)
		{
			ts2.add(i);
		}
		traverseByIterator(ts2);
		traverseByFor(ts2);
		
	}
	
	public static void traverseByIterator(TreeSet<Integer> hs)
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
	public static void traverseByFor(TreeSet<Integer> hs)
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
