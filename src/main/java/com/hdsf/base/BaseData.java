package com.hdsf.base;

/**
 * 基本数据类型:
 * byte的取值范围在  -128 到 127 之间，超过则重复
 *          126 127 -128 -127 ... 126 127 -128
 */
public class BaseData {

    public static void main(String[] args) {
        byte a = (byte) -128;
        byte b = (byte) 127;
        byte c = (byte) -129;
        byte d = (byte) 128;
        System.err.println("a:"+a);
        System.err.println("b:"+b);
        System.err.println("c:"+c);
        System.err.println("d:"+d);


        short e = 32767;
        short f = (short) 32768;//不强转会报错
        long g = 10000000000000000L;
        System.err.println("short:"+e);
        System.err.println("short-error:"+f);
        System.err.println("long:"+g);

        char aa = 'a';
        char bb = 97;//根据ascii码转换为 a
        char cc = '我';
        char dd = '\u4e00';//"一"字 可写\u4e00 -- \u9fa5 两万多汉字
        System.err.println(aa);
        System.err.println(bb);
        System.err.println(cc);
        System.err.println(dd);


        System.err.println("---------------------------");
        int qw =10;
        int qwe =3;
        System.err.println(qw>>4);//右移除以2,除以4个2， 取值不取余数
        System.err.println(qw<<3);//左移乘以2，乘以3个2    10*2*2*2 = 80


    }
}
