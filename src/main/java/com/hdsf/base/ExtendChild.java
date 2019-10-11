package com.hdsf.base;

public class ExtendChild extends ExtendParent {

    //静态代码块
    static {
        System.err.println("子类静态代码块...");
    }

    {
        System.err.println("子类匿名代码块---");
    }

    public ExtendChild() {
//        super(); 默认调用无参构造函数
        System.err.println(3333);
    }

    public ExtendChild(int b) {
        //        super(); 默认调用无参构造函数,
        super(1);
        System.err.println(4444);
    }

    public static void main(String[] args) {
        ExtendChild xx = new ExtendChild();
        System.err.println("'=====================");
        ExtendChild xx2 = new ExtendChild(1);

    }
}
