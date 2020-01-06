package com.hry.collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
       ArrayList<String> a = new ArrayList<String>();
       a.add("aaa");
       a.add("bbb");
       a.add("ccc");
       System.out.println("Before iterate : " + a);
       ListIterator<String> it = a.listIterator();
       while (it.hasNext()) {
               System.out.println(it.next() + ", " + it.previousIndex() + ", " + it.nextIndex());
       }
       while (it.hasPrevious()) {
                System.out.print(it.previous() + " ");
       }
       System.out.println();
       it = a.listIterator(1);//调用listIterator(n)方法创建一个一开始就指向列表索引为n的元素处的ListIterator。
       while (it.hasNext()) {
           String t = it.next();
           System.out.println(t);
           if ("ccc".equals(t)) {
               it.set("nnn");
           } else {
               it.add("kkk");
           }
       }
       System.out.println("After iterate : " + a);
    }
}
