package com.gainzonebackend.Gainzone.exception;

public class AdminNotFoundException extends RuntimeException{
    public AdminNotFoundException(String username){
        super
                ("Couldn't find an Admin with username "+username);
    }
}
