package com.hry.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("ccc");
        System.out.println("Before iterate : " + arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()){
            String s = it.next();
            if ("bbb".equals(s)) {
                it.remove();
            }
        }
        System.out.println("After iterate : " + arrayList);
    }
}
