package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.WorkoutPlan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutPlanServiceImplementation implements WorkoutPlanService{
    @Override
    public List<WorkoutPlan> getAllWorkoutPlans() {
        return null;
    }

    @Override
    public WorkoutPlan getWorkoutPlanById(Long id) {
        return null;
    }

    @Override
    public WorkoutPlan saveWorkoutPlan(WorkoutPlan workoutPlan) {
        return null;
    }

    @Override
    public WorkoutPlan updateWorkoutPlan(Long id, WorkoutPlan workoutPlan) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
