package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.WorkoutPlan;

import java.util.List;

public interface WorkoutPlanService {
    List<WorkoutPlan> getAllWorkoutPlans();
    WorkoutPlan getWorkoutPlanById(Long id);
    WorkoutPlan saveWorkoutPlan(WorkoutPlan workoutPlan, Long trainerId, Long userId);
    WorkoutPlan updateWorkoutPlan(Long id, WorkoutPlan workoutPlan);
    void removeById(Long id);
}
