package com.hdsf.base.api.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

    public static void main(String[] args) {
        String sf1 = "yyyy-MM-dd HH:mm:ss.SSS";
        String sf2 = "yyyy年MM月dd日 HH时mm分ss秒SSS毫秒";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(sf1);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(sf2);
        String date1 = "2019-09-12 12:00:00.000";
        String date2 = "";
        Date d = null;
        try{
            d = simpleDateFormat1.parse(date1);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.err.println(simpleDateFormat2.format(d));


        //jdk8 提供的...


    }
}
