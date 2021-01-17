package com.codewithzia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
         Collection<String> collection = new ArrayList<>();
         Collections.addAll(collection, "a","b","c");
        //  collection.remove("a");
        // collection.clear();
        // var containsA = collection.contains("a");
        // var objectArray = collection.toArray();
        var stringArray = collection.toArray(new String[0]);
         System.out.println(Arrays.toString(stringArray));
    }
}
