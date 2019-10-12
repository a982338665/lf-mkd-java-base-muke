package com.hdsf.base.api;

/**
 * StringBuffer如何进行内存分配
 */
public class StringBufferTest {

    public static void main(String[] args) {
        //初始大小为 16+字符串长度
        //length 实际长度  capacity存储空间大小
        StringBuffer stringBuffer = new StringBuffer();
        System.err.println(stringBuffer.length());//0
        System.err.println(stringBuffer.capacity());//16字节
        stringBuffer.trimToSize();//压缩空间
        System.err.println(stringBuffer.capacity());//0字节
        System.err.println("+++++++++++++++++++++++++++++++++++");
    }
}
