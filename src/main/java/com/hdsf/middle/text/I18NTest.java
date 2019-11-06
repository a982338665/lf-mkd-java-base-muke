package com.hdsf.middle.text;


import java.util.Locale;
import java.util.ResourceBundle;

public class I18NTest {

    public static void main(String[] args) {
        //取得系统默认的国家语言环境
        Locale aDefault = Locale.getDefault();
        System.err.println(aDefault);

        //根据指定语言-国家环境价值资源文件
        ResourceBundle message = ResourceBundle.getBundle("message", aDefault);
        System.err.println(message.getString("hello"));

        //强制转换为en_US
        aDefault=new Locale("en","US");
        message = ResourceBundle.getBundle("message",aDefault);
        System.err.println(message.getString("hello"));

    }
}
