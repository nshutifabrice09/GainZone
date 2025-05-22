package com.gainzonebackend.Gainzone.exception;

public class WorkoutTaskNotFoundException extends RuntimeException{
    public WorkoutTaskNotFoundException(Long id){
        super
                ("Couldn't find a WorkoutTask with id "+id);
    }
}
