package com.hry.innerClass;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Outer {
    int outerField = 0;
    class Inner{
        void InnerMethod(){
            int i = outerField;
            ArrayDeque<String> strings = new ArrayDeque<>();
            PriorityQueue<Integer> integers = new PriorityQueue<>();


        }

    }


}
