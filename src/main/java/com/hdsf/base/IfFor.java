package com.hdsf.base;

/**
 * 选择循环结构
 */
public class IfFor {

    public static void main(String[] args) {
        switchExChar('1');
        switchExInt(1);
        switchExString("1");
        whileTest(10,20);
        doWhileTest(10,20);
        forrrCurr();
        System.err.println("================================");
        forrrZHI();
    }

    public static void switchExString(String value) {
        switch (value) {
            case "1":
                System.err.println(1);
                break;
            case "2":
                System.err.println(1);
                break;
            case "3":
                System.err.println(1);
                break;
            default:
                System.err.println("xxx");
        }

    }

    public static void switchExInt(int value) {
        switch (value) {
            case 1:
                System.err.println(1);
                break;
            case 2:
                System.err.println(1);
                break;
            case 3:
                System.err.println(1);
                break;
            default:
                System.err.println("xxx");
        }

    }

    public static void switchExChar(char value) {
        switch (value) {
            case '1':
                System.err.println(1);
                break;
            case '2':
                System.err.println(1);
                break;
            case '3':
                System.err.println(1);
                break;
            default:
                System.err.println("xxx");
        }

    }

    public static void whileTest(int start ,int end) {
        while (start<end){
            System.err.println("value ========= " + start);
            start ++;
        }
    }
    public static void doWhileTest(int start ,int end) {
       do{
           start++;
           if(start%2==0){
                continue;//跳到下次循环
           }
           System.err.println("do while +++++ "+start);
       }while (start<end);
    }

    /**
     * 跳出当前循环
     */
    public static void forrrCurr(){
        for (int i = 0; i < 10; i++) {
            System.err.println("一层循环 ："+i);
            for (int j = 0; j < 20 ; j++) {
                System.err.println(j);
                if(j%2 == 0){
                    break;
                }
            }
        }
    }

    /**
     * 跳出指定位置循环
     */
    public static void forrrZHI(){
        kkk:
        for (int i = 0; i < 10; i++) {
            System.err.println("一层循环 ："+i);
            for (int j = 0; j < 15 ; j++) {
                System.err.println(j);
                if(j%2 == 0){
                    break kkk;
                }
            }
        }
    }
}
