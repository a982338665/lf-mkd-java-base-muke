package com.hdsf.base.api;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.err.println(random.nextInt());//生成一个int范围内的随机数
        System.err.println(random.nextInt(100));//生成一个0到100内的随机数
        System.err.println(random.nextDouble());
        System.err.println(random.nextLong());

        //Math.random()生成0到1之间的小数，不包含1
        //Math.round()四舍五入
        //以下是生成0-10之间的随机数
        System.err.println(Math.round(Math.random()*10));

        //jdk8新增 返回int数组 随机数
        random.ints();//返回无限个int类型范围内的数据
        int [] arr = random.ints(10).toArray();
        System.err.println(arr.length);

        //返回5个 10 到 100 的整数随机数
        arr = random.ints(5,10,100).toArray();

        System.err.println(arr.length);
    }
}
