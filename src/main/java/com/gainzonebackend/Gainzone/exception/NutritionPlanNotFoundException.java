package com.gainzonebackend.Gainzone.exception;

public class NutritionPlanNotFoundException extends RuntimeException{
    public NutritionPlanNotFoundException(Long id){
        super
                ("Couldn't find a NutritionPlan with id "+id);
    }
}
