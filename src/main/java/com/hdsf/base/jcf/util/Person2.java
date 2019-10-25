package com.hdsf.base.jcf.util;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 假设 person2是一个jar包，则在比较的时候不能通过实现Comparable接口达到
 */
public class Person2 {

    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * Person{name='TOm', age=20}
     * Person{name='TOm', age=21}
     * Person{name='TOm1', age=20}
     *
     * @param args
     */
    public static void main(String[] args) {
        Person2[] people = new Person2[3];
        people[0] = new Person2("TOm", 20);
        people[1] = new Person2("TOm", 20);
        people[1] = new Person2("TOm1", 20);
        people[2] = new Person2("TOm", 21);
        //对象排序，比较compareTo接口
        //使用匿名类作比较，也可以申明一个类作比较
        Arrays.sort(people, new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {
                int i = 0;
                i = o1.getName().compareTo(o2.getName());
                if (i == 0) {
                    return o1.getAge()-o2.getAge();
                } else {
                    return i;
                }
            }
        });
        for (Person2 p : people
        ) {
            System.err.println(p.toString());
        }
    }
}
