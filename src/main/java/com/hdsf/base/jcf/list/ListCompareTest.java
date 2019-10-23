package com.hdsf.base.jcf.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class  ListCompareTest {

	public static void main(String[] args) {
		int times = 10 * 1000;
	    // times = 100 * 1000;
	    // times = 1000 * 1000;
	    
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
	    LinkedList<Integer> linkedList = new LinkedList<Integer>();

	    System.out.println("Test times = " + times);
	    System.out.println("-------------------------");
	    
	    // ArrayList add
	    long startTime = System.nanoTime();

	    for (int i = 0; i < times; i++) {
	        arrayList.add(0,i);
	    }
	    long endTime = System.nanoTime();
	    long duration = endTime - startTime;
	    System.out.println(duration + " <--ArrayList add");

	    // LinkedList add
	    startTime = System.nanoTime();

	    for (int i = 0; i < times; i++) {
	        linkedList.add(0,i);
	    }
	    endTime = System.nanoTime();
	    duration = endTime - startTime;
	    System.out.println(duration + " <--LinkedList add");
	    System.out.println("-------------------------");
	    
	    // ArrayList get
	    startTime = System.nanoTime();

	    for (int i = 0; i < times; i++) {
	        arrayList.get(i);
	    }
	    endTime = System.nanoTime();
	    duration = endTime - startTime;
	    System.out.println(duration + " <--ArrayList get");

	    // LinkedList get
	    startTime = System.nanoTime();

	    for (int i = 0; i < times; i++) {
	        linkedList.get(i);
	    }
	    endTime = System.nanoTime();
	    duration = endTime - startTime;
	    System.out.println(duration + " <--LinkedList get");
	    System.out.println("-------------------------");

	    // ArrayList remove
	    startTime = System.nanoTime();

	    for (int i = 0; i < times; i++) {
	        arrayList.remove(0);
	    }
	    endTime = System.nanoTime();
	    duration = endTime - startTime;
	    System.out.println(duration + " <--ArrayList remove");

	    // LinkedList remove
	    startTime = System.nanoTime();

	    for (int i = 0; i < times; i++) {
	        linkedList.remove(0);
	    }
	    endTime = System.nanoTime();
	    duration = endTime - startTime;
	    System.out.println(duration + " <--LinkedList remove");
	}
}
