package com.codewithzia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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

//FileNotFoundException
// public class ExceptionsDemo {
//     public static void show(){
//         var reader = new FileReader("file.txt");

//     }
// }

//try and catch
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


// public class ExceptionsDemo{
//     public static void show(){
//         try{
//             var reader = new FileReader("file.txt");
//             var value = reader.read();
//             new SimpleDateFormat().parse("");
//         }catch (FileNotFoundException e) {
//             System.out.println("File does not exist");
//             e.printStackTrace();
//         }catch (IOException e | ParseException e) {
//             System.out.println("Could not read data");
//         }
//     }
// }

//try-catch-finally
// public class ExceptionsDemo{
//     public static void show(){
//         FileReader reader = null;
//         try{
//             reader = new FileReader("file.txt");
//             var value = reader.read();
//         }
//         catch (IOException e) {
//             System.out.println("Could not read data");
        
//         }finally{
//             if(reader != null){
//                 try {
//                     reader.close();
//                 } catch (IOException e) {
//                     //TODO: handle exception
//                     e.printStackTrace();
//                 }
//             }
//         }
//     }
// }


//try with resources
// public class ExceptionsDemo{
//     public static void show(){
//         try(
//             var reader = new FileReader(".txt");
//             var writer = new FileWriter("...");
//         ){
//             var value = reader.read();
//         }
//         catch (IOException e) {
//             System.out.println("Could not read data");
//         }
//     }
// }


//throw an exception
public class ExceptionsDemo{
    public static void show() {
        var account = new Account();
        account.deposit(-1);
    }
}