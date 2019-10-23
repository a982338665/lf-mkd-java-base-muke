package com.hdsf.base.jcf.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(null);
		hs.add(1000);
		hs.add(20);
		hs.add(3);
		hs.add(40000);
		hs.add(5000000);
		hs.add(3);                      //3 �ظ�
		hs.add(null);                   //null�ظ�
		System.out.println(hs.size());  //6
		if(!hs.contains(6))
		{
			hs.add(6);
		}
		System.out.println(hs.size());  //7
		hs.remove(4);
		System.out.println(hs.size());  //6
		//hs.clear();
		//System.out.println(hs.size());  //0
		
		System.out.println("============forѭ������=============="); 
	    for(Integer item : hs)
	    {
	    	System.out.println(item);
	    }
	    
	    System.out.println("============���Լ��Ͻ���==============");
	    
	    HashSet<String> set1 = new HashSet<String>();
	    HashSet<String> set2 = new HashSet<String>();

        set1.add("a");
        set1.add("b");
        set1.add("c");

        set2.add("c");
        set2.add("d");
        set2.add("e");

        //����
        set1.retainAll(set2);
        System.out.println("������ "+set1);
        
        System.out.println("============���Զ��ֱ��������ٶ�==============");
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		for(int i=0;i<100000;i++)	{
			hs2.add(i);
		}
		traverseByIterator(hs2);
		traverseByFor(hs2);		
	}
	
	public static void traverseByIterator(HashSet<Integer> hs)
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
	public static void traverseByFor(HashSet<Integer> hs)
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
