package com.hdsf.base.api.exception;

/**
 * 异常 ：自定义异常
 */

public class ExceptionTest extends RuntimeException{

    private String code = "400";
    private String msg = "not Find";

    public ExceptionTest(){
        super();
    }
    public ExceptionTest(String code ,String msg){
        super();
        this.code = code;
        this.msg = msg;
    }
    public ExceptionTest(String msg){
        super();
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
