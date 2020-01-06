package com.hry.myObject;

public class demo01 {

    public static void main(String[] args) {
        p("a","b","c");
    }

    public static void p(String ... a){
        for (String s : a){
            System.out.print(s);
        }
    }
}
