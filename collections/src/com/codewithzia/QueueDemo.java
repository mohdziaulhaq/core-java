package com.codewithzia;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("a");
        queue.add("b");
        // b -> a -> c
        // var front = queue.peek();
        // var front = queue.remove();
        var front = queue.poll();
        System.out.println(front);
        System.out.println(queue);
    }
}
