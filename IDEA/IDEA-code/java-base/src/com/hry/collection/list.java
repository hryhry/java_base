package com.hry.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class list {
    public static void main(String[] args) {
        List arrayList = new ArrayList<String>();
        arrayList.add("tom");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("cat");
        linkedList.get(0);

        Vector<String> vector = new Vector<>();
        vector.add("dog");
    }
}
