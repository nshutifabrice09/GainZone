package com.gainzonebackend.Gainzone.exception;

public class ProgressLogNotFoundException extends RuntimeException{
    public  ProgressLogNotFoundException (Long id){
        super
                ("Couldn't find a ProgressLog with id "+id);
    }
}
