package com.hry.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist {
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();

        Iterator<Object> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object o = iterator.next();
        }

    }
}
