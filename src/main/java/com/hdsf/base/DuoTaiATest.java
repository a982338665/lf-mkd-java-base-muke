package com.hdsf.base;

public class DuoTaiATest {
    public static void main(String[] args) {
        DuoTaiInterface[] duoTaiInterfaces = new DuoTaiInterface[3];
        duoTaiInterfaces[0] = new DuoTaiA();
        duoTaiInterfaces[1] = new DuoTaiB();
        duoTaiInterfaces[2] = new DuoTaiC();

        //  一个类来操作不同对象的动态行为
        for (int i = 0; i < duoTaiInterfaces.length; i++) {
            duoTaiInterfaces[i].eat();
        }

        // 对象解耦 实现该接口的所有对象
        sleep(new DuoTaiA());
        sleep(new DuoTaiB());
        sleep(new DuoTaiC());

        //匿名类
        sleep(new DuoTaiInterface() {
            @Override
            public void eat() {
                System.err.println("匿名...eat");
            }

            @Override
            public void sleep() {
                System.err.println("匿名...sleep");
            }
        });


    }

    public static void sleep(DuoTaiInterface duoTaiInterface){
        duoTaiInterface.sleep();
    }
}
