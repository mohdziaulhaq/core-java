package com.codewithzia;

import java.io.IOException;

public class Account {
       public void deposit(float value) throws IOException{//warning that this method may throw an exception
           if(value <=0){
               throw new IOException();
           }
       }
}
