package com.hdsf.middle.text;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 高级字符串处理知识
 */
public class SeniorStringTest {

    public static void main(String[] args) {
        test("\\bdog\\b","dog dog dog dog dgo");//\b表示边界,匹配dog
        test2("a*b","aabffoaaaaboogabooaaad");//*限定前面一个a可以是0个或多个
        test3();//字符串转数组，数组转字符串
        escapeString();//字符转义
    }


    public static void test(String regex,String input){
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(input);
        int count = 0;
        while (matcher.find()){
            count++;
            System.err.printf("匹配到【%s】个，在下标【%s】-【%s】",count,matcher.start(),matcher.end());
            System.err.println();
        };
        System.err.println();
        System.err.println("部分匹配："+matcher.lookingAt());
        System.err.println("完全匹配："+matcher.matches());
    }

    public static void test2(String regex,String input){
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(input);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()){//全部替换
            matcher.appendReplacement(stringBuffer,"-");
        }
        matcher.appendTail(stringBuffer);//加尾巴
        System.err.println(stringBuffer.toString());

    }

    //采用Apache Commons Lang来完成字符串和集合转换
    public static void test3(){
        LinkedList<String> strings = new LinkedList<>();
        strings.add("XIAOHONG");
        strings.add("xiaohong");
        strings.add("Daming");
        strings.add("DaMing");
        //list变字符串
        String join = String.join(",", strings);//jdk1.8引入,仅支持string，不支持数字
        System.err.println("String.join:"+join);
        String join1 = StringUtils.join(strings, ",");//支持数字和字符串
        System.err.println("StringUtils.join:"+join1);
        //字符串变成List
        List<String> strings1 = Arrays.asList(join1.split(","));
        for (String s:strings
             ) {
            System.err.println("遍历："+s);
        }
        //
    }

    //转义
    public static void escapeString(){
        String str = "hello ,world! \"haha\"";
        String s = StringEscapeUtils.escapeJava(str);
        System.err.println(s);
        String s1 = StringEscapeUtils.unescapeJava(s);
        System.err.println(s1);
    }

    //驼峰转换
    public static void caseFormat(){
        String s = "CONSTRST_NAME";
//        CaseFormat.UPP

    }
}
