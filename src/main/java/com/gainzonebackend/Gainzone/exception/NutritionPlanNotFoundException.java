package com.gainzonebackend.Gainzone.exception;

public class NutritionNotFoundException extends RuntimeException{
    public NutritionNotFoundException(Long id){
        super
                ("Couldn't find a NutritionPlan with id "+id);
    }
}
