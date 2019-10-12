package com.hdsf.base.designmodel;

/**
 * 单例模式：内存中只存在一个对象，不能new很多
 * static共享对象实例
 * private修饰构造函数，静止new 对象
 * 查看getInstance获取实例对象
 * <p>
 * 懒汉式单例模式，使用的时候创建对象
 */
public class SingleTonB {

    private static SingleTonB singleTonA = null;
    private String content;

    private SingleTonB() {
        this.content = "abd";
    }

    public static SingleTonB getInstance() {
        if(singleTonA == null){
            singleTonA = new SingleTonB();
            return singleTonA;
        }else{
            return singleTonA;
        }
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static void main(String[] args) {
        SingleTonB instance1 = SingleTonB.getInstance();
        System.err.println(instance1.content);
        SingleTonB instance2 = SingleTonB.getInstance();
        System.err.println(instance2.content);
        //修改1中content值
        //查看2中content值，若无改变，则认定只有一个对象
        instance1.setContent("444");
        System.err.println(instance2.content);
        System.err.println(instance1 == instance2);
    }
}
