package com.hry.myComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCom {
    public static void main(String[] args) {
        Student s1=new Student(101, "小强", 89.5);
        Student s2=new Student(102, "大强", 56.5);
        Student s3=new Student(103, "小飞", 90);

        List<Student> slist=new ArrayList<Student>();
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);

        System.out.println("排序前-------------------");
        for (Student s : slist) {
            System.out.println(s.getScore());
        }

        Collections.sort(slist);

        System.out.println("排序前-------------------");
        for (Student s : slist) {
            System.out.println(s.getScore());
        }
    }
}