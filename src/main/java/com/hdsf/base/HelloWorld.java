package com.hdsf.base;

/**
 *
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.err.println("hello world!");
        for (String i:args
             ) {
            System.err.println(i);
        }
    }
}
