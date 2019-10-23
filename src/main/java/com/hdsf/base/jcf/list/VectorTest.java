package com.hdsf.base.jcf.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.remove(2);
		v.add(1, 5);
		System.out.println(v.size());

		System.out.println("======��������=============");

		Vector<Integer> v2 = new Vector<Integer>(100000);
		for (int i = 0; i < 100000; i++) {
			v2.add(i);
		}
		traverseByIterator(v2);
		traverseByIndex(v2);
		traverseByFor(v2);
		traverseByEnumeration(v2);
	}

	public static void traverseByIterator(Vector<Integer> v) {
		long startTime = System.nanoTime();
		System.out.println("============����������==============");
		Iterator<Integer> iter1 = v.iterator();
		while (iter1.hasNext()) {
			iter1.next();
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(duration + "����");
	}

	public static void traverseByIndex(Vector<Integer> v) {
		long startTime = System.nanoTime();
		System.out.println("============�������ֵ����==============");
		for (int i = 0; i < v.size(); i++) {
			v.get(i);
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(duration + "����");
	}

	public static void traverseByFor(Vector<Integer> v) {
		long startTime = System.nanoTime();
		System.out.println("============forѭ������==============");
		for (Integer item : v) {
			;
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(duration + "����");
	}

	public static void traverseByEnumeration(Vector<Integer> v) {
		long startTime = System.nanoTime();
		System.out.println("============Enumeration����==============");
		for (Enumeration<Integer> enu = v.elements(); enu.hasMoreElements();) {
			enu.nextElement();
		}
		long endTime = System.nanoTime();
		long duration = endTime - startTime;
		System.out.println(duration + "����");
	}
}
