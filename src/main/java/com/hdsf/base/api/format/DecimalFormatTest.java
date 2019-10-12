package com.hdsf.base.api.format;

import java.text.DecimalFormat;

/**
 * 数字格式化
 */
public class DecimalFormatTest {

    public static void main(String[] args) {
        DecimalFormat df1,df2;
        System.err.println("整数部分0/#的区别：");
        // # 认为整数为0时，可不写， 0 认为整数位无值，则0补充
        df1 = new DecimalFormat("#.00");
        df2 = new DecimalFormat("0.00");
        float xx = 0.01f;
        String format1 = df1.format(xx);
        String format2 = df2.format(xx);
        System.err.println(format1+"|"+format2);

        System.err.println("小数部分0/#的区别：");
        // # 最多能有几位小数 0表示必须有几位小数
        df1 = new DecimalFormat("0.##");
        df2 = new DecimalFormat("0.00");
        float xx2 = 0.0f;
        String format11 = df1.format(xx2);
        String format21 = df2.format(xx2);
        System.err.println(format11+"|"+format21);

    }

}
