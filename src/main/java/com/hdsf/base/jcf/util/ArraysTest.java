package com.hdsf.base.jcf.util;

import java.util.Arrays;
import java.util.Random;

/**
 * arrays 工具类
 */
public class ArraysTest {

    public static void main(String[] args) {
        testSort();
        testSearch();
        testCopy();
        testFill();
        testEquals();
    }

    /**
     * 升序排列
     */
    public static void testSort(){
        Random random = new Random();
        int[] ints = new int[10];
        for (int i = 0; i < ints.length ; i++) {
            ints[i] = random.nextInt(100);
        }
        System.err.println("排序前：--------------------------");
        for (int i = 0; i < ints.length ; i++) {
            System.err.print(ints[i]+" ,");
        }
        Arrays.sort(ints);
        System.err.println("排序后：--------------------------");
        for (int i = 0; i < ints.length ; i++) {
            System.err.print(ints[i]+" ,");
        }
    }

    /**
     * 测试查找：
     * binarySearch：二分法查找
     */
    public static void testSearch(){
        int[] ints = new int[]{1,2,3333,444};
        System.err.println("测试检索：有返回下标，没有返回-1============");
        System.err.println(Arrays.binarySearch(ints,444));
        System.err.println(Arrays.binarySearch(ints,4444));
    }
    /**
     * 测试copy：赋值数组前三个内容
     */
    public static void testCopy(){
        int[] ints = new int[]{1,2,3333,444,2};
        int[] ints1 = Arrays.copyOf(ints, 3);
        System.err.println();
        for (int i = 0; i < ints1.length ; i++) {
            System.err.print(ints1[i]+",");
        }
    }
    /**
     * 测试fill :批量赋值
     */
    public static void testFill(){
        int[] ints = new int[10];
        //赋值10个100
        Arrays.fill(ints,100);
        //下标为1和2的赋值20，以下区间为左闭右开
        Arrays.fill(ints,1,3,20);
        System.err.println();
        for (int i = 0; i < ints.length ; i++) {
            System.err.print(ints[i]+",");
        }
    }
    /**
     * 测试相等
     */
    public static void testEquals(){
        int[] ints = new int[10];
        //赋值10个100
        Arrays.fill(ints,100);
        int[] ints2 = new int[10];
        //赋值10个100
        Arrays.fill(ints2,100);
        System.err.println(Arrays.equals(ints,ints2));
    }

}
