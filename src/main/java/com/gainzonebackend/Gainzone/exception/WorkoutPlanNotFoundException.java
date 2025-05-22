package com.gainzonebackend.Gainzone.exception;

public class WorkoutPlanNotFoundException extends RuntimeException{
    public WorkoutPlanNotFoundException(Long id){
        super
                ("Couldn't find a WorkoutPlan with id "+id);
    }
}
