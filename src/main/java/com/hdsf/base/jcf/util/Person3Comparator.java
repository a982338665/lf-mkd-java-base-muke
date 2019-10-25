package com.hdsf.base.jcf.util;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 假设 person2是一个jar包，则在比较的时候不能通过实现Comparable接口达到
 */
public class Person3Comparator implements Comparator<Person3>{

    /**
     * Person{name='TOm', age=20}
     * Person{name='TOm', age=21}
     * Person{name='TOm1', age=20}
     *
     * @param args
     */
    public static void main(String[] args) {
        Person3[] people = new Person3[3];
        people[0] = new Person3("TOm", 20);
        people[1] = new Person3("TOm", 20);
        people[1] = new Person3("TOm1", 20);
        people[2] = new Person3("TOm", 21);
        //对象排序，比较compareTo接口
        //使用匿名类作比较，也可以申明一个类作比较
        Arrays.sort(people, new Person3Comparator());
        for (Person3 p : people
        ) {
            System.err.println(p.toString());
        }
    }

    @Override
    public int compare(Person3 o1, Person3 o2) {
        int i = 0;
        i = o1.getName().compareTo(o2.getName());
        if (i == 0) {
            return o1.getAge()-o2.getAge();
        } else {
            return i;
        }
    }
}
