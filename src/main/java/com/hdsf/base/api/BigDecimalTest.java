package com.hdsf.base.api;

import java.math.BigDecimal;

public class BigDecimalTest {

    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("11222334444.1111111");
        BigDecimal bigDecimal2 = new BigDecimal("1122233333333334444.222222");

        System.err.println("加："+bigDecimal1.add(bigDecimal2));
        System.err.println("减："+bigDecimal1.subtract(bigDecimal2));
        System.err.println("乘："+bigDecimal1.multiply(bigDecimal2));

        /**
         * scale:表示保留三位小数
         * BigDecimal.ROUND_DOWN  舍
         * BigDecimal.ROUND_UP    进
         * BigDecimal.ROUND_HALF_UP    四舍五入
         */
        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_DOWN));
        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_CEILING));
        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_FLOOR));
        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_HALF_DOWN));
        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_HALF_EVEN));
        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_HALF_UP));
//        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_UNNECESSARY));
        System.err.println("除："+new BigDecimal("10").divide(new BigDecimal("3"),3,BigDecimal.ROUND_UP));

        System.err.println("最大："+bigDecimal1.max(bigDecimal2));
        System.err.println("最小："+bigDecimal1.min(bigDecimal2));
        System.err.println("等价："+bigDecimal1.equals(bigDecimal2));

        //求余数的除法操作
        BigDecimal[] BigDecimals = bigDecimal2.divideAndRemainder(bigDecimal1);
        System.err.println("商是："+BigDecimals[0]);
        System.err.println("余数是："+BigDecimals[1]);

        //比较
        int i = bigDecimal1.compareTo(bigDecimal2);
        compareResutl(i);

        //尽量采用字符串赋值，否则不准确
        System.err.println(new BigDecimal(3.2));
        System.err.println(new BigDecimal("3.2"));

    }


    @SuppressWarnings("ALL")
    private static void compareResutl(int i) {
        if(i == -1){
            System.err.println("b1<b2");
        }else if(i == 0){
            System.err.println("b1=b2");
        }else{
            System.err.println("b1>b2");
        }
    }
}
