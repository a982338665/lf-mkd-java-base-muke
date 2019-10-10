package com.hdsf.base;

/**
 * 交换数字
 */
public class ChangeNum {

    public static void main(String[] args) {

        int a = 1, b = 2;
        int temp = a;
        a=b;
        b=temp;
        System.err.println("a"+a);
        System.err.println("b"+b);
    }
}
