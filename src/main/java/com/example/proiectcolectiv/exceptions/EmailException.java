package com.example.proiectcolectiv.exceptions;

public class EmailException extends Exception{
    public EmailException(){
        super();
    }
    public EmailException(String message){
        super(message);
    }
    public EmailException(String message, Throwable t){
        super(message, t);
    }
}
