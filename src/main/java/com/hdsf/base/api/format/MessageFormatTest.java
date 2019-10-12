package com.hdsf.base.api.format;

import java.text.MessageFormat;

/**
 *字符串格式化: 字符串模板定义
 */
public class MessageFormatTest {

    public static void main(String[] args) {
        String msg ="{0}{1}{2}{3}";
        Object[] objects = {"a", "b", "c", "d"};
        String format = MessageFormat.format(msg, objects);
        System.err.println(format);

        String msg2 = "oh ,{0,number,#.##} is very good!";
        objects = new Object[]{new Double(3.1415)};
        format  = MessageFormat.format(msg2,objects);
        System.err.println(format);

    }
}
