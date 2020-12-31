package com.codewithzia;

import java.io.IOException;
//throws Exception
public class Account {
       public void deposit(float value) throws IOException{//warning that this method may throw an exception
           if(value <=0){
               System.out.println("Account.java");
               throw new IOException();
           }
       }
}
