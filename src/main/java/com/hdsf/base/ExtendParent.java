package com.hdsf.base;

/**
 * 父类静态代码块...
 * 子类静态代码块...
 * 父类匿名代码块---
 * 22222
 * 子类匿名代码块---
 * 3333
 * '=====================
 * 父类匿名代码块---
 * 111111
 * 子类匿名代码块---
 * 4444
 */
public class ExtendParent {

    //静态代码块
    static {
        System.err.println("父类静态代码块...");
    }

    {
        System.err.println("父类匿名代码块---");
    }

    public ExtendParent(){
        System.err.println(22222);
    }
    public ExtendParent(int a ){
        System.err.println(111111);
    }
}
