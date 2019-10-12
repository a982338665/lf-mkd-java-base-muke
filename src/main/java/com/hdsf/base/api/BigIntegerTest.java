package com.hdsf.base.api;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("11222334444");
        BigInteger bigInteger2 = new BigInteger("1122233333333334444");

        System.err.println("加："+bigInteger1.add(bigInteger2));
        System.err.println("减："+bigInteger1.subtract(bigInteger2));
        System.err.println("乘："+bigInteger1.multiply(bigInteger2));
        System.err.println("除："+bigInteger1.divide(bigInteger2));
        System.err.println("最大："+bigInteger1.max(bigInteger2));
        System.err.println("最小："+bigInteger1.min(bigInteger2));
        System.err.println("等价："+bigInteger1.equals(bigInteger2));

        //求余数的除法操作
        BigInteger[] bigIntegers = bigInteger2.divideAndRemainder(bigInteger1);
        System.err.println("商是："+bigIntegers[0]);
        System.err.println("余数是："+bigIntegers[1]);

        //比较
        int i = bigInteger1.compareTo(bigInteger2);
        if(i == -1){
            System.err.println("b1<b2");
        }else if(i == 0){
            System.err.println("b1=b2");
        }else{
            System.err.println("b1>b2");
        }
    }
}
