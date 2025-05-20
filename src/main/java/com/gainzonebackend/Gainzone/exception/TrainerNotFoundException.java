package com.gainzonebackend.Gainzone.exception;

public class TrainerNotFoundException extends RuntimeException{
    public TrainerNotFoundException(Long id){
        super
                ("Couldn't find a Trainer with id "+id);
    }
}
