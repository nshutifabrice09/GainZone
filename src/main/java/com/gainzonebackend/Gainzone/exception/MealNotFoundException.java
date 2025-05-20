package com.gainzonebackend.Gainzone.exception;

public class MealNotFoundException extends RuntimeException{
    public MealNotFoundException(Long id){
        super
                ("Couldn't find a Meal with id "+id);
    }
}
