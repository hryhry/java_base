package com.hry.myCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Student> stuList = new ArrayList<>();
        Student stu1 = new Student("小涂",23);
        Student stu2 = new Student("小刘",21);
        Student stu3 = new Student("小王",25);
        stuList.add(stu1);
        stuList.add(stu2);
        stuList.add(stu3);

        System.out.println("排序前的stuList集合：");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }

        //实现Comparator进行排序
        Collections.sort(stuList,new Comparator<Object>(){
            /*
            * 然后看到了一句金句：当前对象与后一个对象进行比较，如果比较结果为1进行交换，
            * 其他不进行交换。this就是当前对象，另一个就是后一个对象。
            * */
            @Override
            public int compare(Object o1, Object o2) {
                return ((Student) o2).getAge() - ((Student) o1).getAge();
            }
        });

        System.out.println("按照年龄降序排序后的stuList集合：");
        for (Student student : stuList) {
            System.out.println(student.toString());
        }
    }

}
/*
*1.Hashmap允许key和value都为null
*   key只能有一个为null，多个key=null的会覆盖，value可以多个为null
*2.Hashtable中key，value都不能为null
*   直接调用key.hashcode方法，所以key不能为null，value为null，抛出空指针
*3.ConcurrentHashMap中key，value都不能为null
*   key或value为null，抛出空指针，key调用hashcode方法后，用spread方法二次hash
*4.TreeMap中key不能为null，value可以为null
*   key为null，抛出空指针
*
* */