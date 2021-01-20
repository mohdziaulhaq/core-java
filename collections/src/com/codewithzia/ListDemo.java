package com.codewithzia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        // list.add("a");
        // list.add("b");
        // list.add("c");
        // list.add(0,"!");
        Collections.addAll(list, "a","b","c");
        System.out.println(list.subList(0, 2));
    }
}
