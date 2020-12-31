package com.codewithzia;

public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            ExceptionsDemo.show();    
        } catch (Throwable e) {
            //TODO: handle exception
            System.out.println("An unexpected error occurred");
        }
    }
}
