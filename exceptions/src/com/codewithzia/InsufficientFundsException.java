package com.codewithzia;

public class InsufficientFundsException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 9065238571395060131L;

    public InsufficientFundsException() {
        super("Insufficient funds in your account.");
    }
    public InsufficientFundsException(String message){
        super(message);
    }
}
