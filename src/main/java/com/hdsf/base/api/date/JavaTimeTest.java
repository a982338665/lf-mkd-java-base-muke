package com.hdsf.base.api.date;

import java.time.LocalDate;

/**
 * jdk8 提供的线程安全的时间操作类
 */
public class JavaTimeTest {

    public static void main(String[] args) {
        //当前时间
        LocalDate now = LocalDate.now();
        System.err.println(now.getClass().getName());
        System.err.println(now);
        //根据指定时间创建localDate
        LocalDate of = LocalDate.of(2019, 9, 12);
        System.err.println(of);
        //错误的时间参数将报错 n thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 100
//        LocalDate of1 = LocalDate.of(2019, 9, 100);
        //返回2014年第一百天的日期
        LocalDate localDate = LocalDate.ofYearDay(2014, 100);
    }
}

