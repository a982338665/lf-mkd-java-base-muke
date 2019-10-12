package com.hdsf.base.api;

public class StringTest {

    public static void main(String[] args) {
        String a = "  asfdas:  12121;1211cdc;sds";
        System.err.println("返回第0个元素："+a.charAt(0));
        System.err.println("截取字符串："+a.substring(3,4));
        System.err.println("字符串替换："+a.replace("1","@"));
        System.err.println("字符串正则替换："+a.replaceAll("[s]","#"));
        System.err.println("返回第一个;的位置："+a.indexOf(";"));
        System.err.println("连接一个新字符并返回【a不变】："+a.concat("44"));
        System.err.println("是否包含："+a.contains("sds"));
        System.err.println("是否以什么结尾："+a.endsWith("ds"));
        System.err.println("是否等于："+a.equals("c"));
        System.err.println("忽略大小写是否等于"+a.equalsIgnoreCase("s"));
        System.err.println("长度："+a.length());
        a=a.trim();//去掉前后空格
        System.err.println("长度："+a.length());
        String[] split = a.split(";");

    }
}
