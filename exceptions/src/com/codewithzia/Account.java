package com.codewithzia;

public class Account {
       public void deposit(float value) throws {
           if(value <=0){
               throw new IllegalArgumentException();
           }
       }
}
