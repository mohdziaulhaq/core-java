package com.codewithzia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

// public class ExceptionsDemo {
//     public static void show(){
//         sayHello(null);
//     }
//     public static void sayHello(String name){
//         System.out.println(name.toUpperCase());
//     }
// }


// public class ExceptionsDemo {
//     public static void show(){
//         var reader = new FileReader("file.txt");//FileNotFoundException

//     }
// }


// public class ExceptionsDemo {
//     public static void show(){
//         try {
//             var reader = new FileReader("file.txt");
//             System.out.println("File opened");
//         } catch (FileNotFoundException ex) {
//             //TODO: handle exception
//             ex.printStackTrace();
//         }
//     }
// }


public class ExceptionsDemo{
    public static void show(){
        try{
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
        }catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            e.printStackTrace();
        }catch (IOException e | ParseException e) {
            System.out.println("Could not read data");
        }
    }
}