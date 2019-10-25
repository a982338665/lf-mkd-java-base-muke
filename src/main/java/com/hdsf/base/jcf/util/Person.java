package com.hdsf.base.jcf.util;

import java.util.Arrays;

public class Person implements Comparable<Person> {

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        int i = 0;
        //先比较name，如果一致在比较年龄
        i = name.compareTo(o.name);
        if (i == 0) {
            return age - o.age;
        }else{
            return i;
        }
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
     * @param args
     */
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("TOm",20);
        people[1] = new Person("TOm",20);
        people[1] = new Person("TOm1",20);
        people[2] = new Person("TOm",21);
        //对象排序，比较compareTo接口
        Arrays.sort(people);
        for (Person p:people
             ) {
            System.err.println(p.toString());
        }
    }
}
