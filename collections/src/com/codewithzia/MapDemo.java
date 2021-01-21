package com.codewithzia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
        //Hashtables
        //Java : Maps
        //C# : Dictionary
        //Python : Dictionary
        //Javascript : Objects
        // var Objects = { name: "a"}
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // var unknown = new Customer("Unknown", "");
        // var customer = map.getOrDefault("e10",unknown);
        // System.out.println(customer);

        // var exists = map.containsKey("e10");
        // System.out.println(exists);

        // map.replace("e1", new Customer("a++", "e1"));
        // System.out.println(map);

        // for(var key : map.keySet())
        // System.out.println(key);

        // for(var entry : map.entrySet())
        // System.out.println("Key = "+ entry.getKey()+ " Value = "+entry.getValue());

        for(var entry : map.values())
        System.out.println(entry);


    }
}
