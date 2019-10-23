package com.hdsf.base.jcf.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 不能使用fori便利，会很低效
 */
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();  
	    ll.add(3);  
	    ll.add(2);  
	    ll.add(5);  
	    ll.add(6);  
	    ll.add(6);  
	    System.out.println(ll.size());
	    ll.addFirst(9);  //��ͷ������9
	    ll.add(3, 10);   //��10���뵽���ĸ�Ԫ�أ����Լ�������Ԫ������Ų��
	    ll.remove(3);    //�����ĸ�Ԫ��ɾ��
	    
	    LinkedList<Integer> list = new LinkedList<Integer>();
	    for (int i=0; i<100000; i++)
	    {
	    	list.add(i);
	    }
	    traverseByIterator(list);
	    traverseByIndex(list);
	    traverseByFor(list);    

	}
	
	public static void traverseByIterator(LinkedList<Integer> list)
	{
		long startTime = System.nanoTime();
		System.out.println("============����������=============="); 
	    Iterator<Integer> iter1 = list.iterator();  
	    while(iter1.hasNext()){  
	        iter1.next();  
	    }
		long endTime = System.nanoTime();
	    long duration = endTime - startTime;
	    System.out.println(duration + "����");
	}
	public static void traverseByIndex(LinkedList<Integer> list)
	{
		long startTime = System.nanoTime();
		System.out.println("============�������ֵ����==============");
	    for(int i=0;i<list.size();i++)
	    {
	    	list.get(i);
	    }
		long endTime = System.nanoTime();
	    long duration = endTime - startTime;
	    System.out.println(duration + "����");
	}
	public static void traverseByFor(LinkedList<Integer> list)
	{
		long startTime = System.nanoTime();
		System.out.println("============forѭ������=============="); 
	    for(Integer item : list)
	    {
	    	;
	    }
		long endTime = System.nanoTime();
	    long duration = endTime - startTime;
	    System.out.println(duration + "����");
	}
}
