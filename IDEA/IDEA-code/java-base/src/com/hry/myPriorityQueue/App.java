package com.hry.myPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class App {
    public static void main(String[] args) {
        //通过改造器指定排序规则
        PriorityQueue<Student> q = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照分数从低到高，分数相等按名字
                if (o1.getScore() == o2.getScore()) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o1.getScore() - o2.getScore();
                }
            }
        });
        //入列
        q.offer(new Student("dafei", 20));
        q.offer(new Student("will", 17));
        q.offer(new Student("setf", 30));
        q.offer(new Student("bunny", 20));

        //出列
        System.out.println(q.poll());  //Student{name='will', score=17}
        System.out.println(q.poll());  //Student{name='bunny', score=20}
        System.out.println(q.poll());  //Student{name='dafei', score=20}
        System.out.println(q.poll());  //Student{name='setf', score=30}
    }
}
