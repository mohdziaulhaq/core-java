package com.codewithzia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo{
    public static void show(){
        // Set<String> set = new HashSet<>();
        // set.add("the");
        // set.add("sky");
        // set.add("is");
        // set.add("pink");
        // System.out.println(set); //[the, sky, pink, is]

        // Collection<String> collection = new ArrayList<>();
        // Collections.addAll(collection, "a","b","c","c");
        // Set<String> set = new HashSet<>(collection);
        // // set.addAll(collection);
        // System.out.println(set);

        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        
        Set<String> set2 = new HashSet<>(Arrays.asList("b","c","d"));
        
        //Union
        // set1.addAll(set2);
        // System.out.println(set1);//[a,b,c,d]

        //Intersection
        // set1.retainAll(set2);
        // System.out.println(set1);//[b,c]

        //Difference
        // set1.removeAll(set2);//removes all items from set2
        // System.out.println(set1);//[a]
    }
}