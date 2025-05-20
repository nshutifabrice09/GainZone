package com.gainzonebackend.Gainzone.exception;

public class IntegrationNotFoundException extends RuntimeException{
    public IntegrationNotFoundException(Long id){
        super
                ("Couldn't find an Integration with id "+id);
    }
}
