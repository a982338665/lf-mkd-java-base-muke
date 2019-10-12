package com.hdsf.base.api.exception;

public class Test {

    public static void main(String[] args) {
        try{
            test();
        }catch(ExceptionTest e){
            System.err.println(e.getCode());
            System.err.println(e.getMsg());
        }
    }

    public static void test() throws  ExceptionTest{
        throw new ExceptionTest();
    }
}
