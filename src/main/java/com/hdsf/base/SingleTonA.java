package com.hdsf.base;

/**
 * 单例模式：内存中只存在一个对象，不能new很多
 *  static共享对象实例
 *  private修饰构造函数，静止new 对象
 *  查看getInstance获取实例对象
 *
 *  饿汉式单例模式，类加载时候创建对象
 */
public class SingleTonA {

    private static SingleTonA singleTonA = new SingleTonA();
    private String content;

    private SingleTonA(){
        this.content = "abd";
    }

    public static SingleTonA getInstance(){
        return  singleTonA;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        SingleTonA instance1 = SingleTonA.getInstance();
        System.err.println(instance1.content);
        SingleTonA instance2 = SingleTonA.getInstance();
        System.err.println(instance2.content);
        //修改1中content值
        //查看2中content值，若无改变，则认定只有一个对象
        instance1.setContent("444");
        System.err.println(instance2.content);
        System.err.println(instance1 == instance2);
    }
}
