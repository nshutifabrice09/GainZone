package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.WorkoutPlan;
import com.gainzonebackend.Gainzone.repository.WorkoutPlanRepository;
import com.gainzonebackend.Gainzone.repository.WorkoutTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutTaskServiceImplementation implements WorkoutPlanService{

    private final WorkoutTaskRepository workoutTaskRepository;
    private final WorkoutPlanRepository workoutPlanRepository;

    @Autowired
    public WorkoutTaskServiceImplementation(WorkoutTaskRepository workoutTaskRepository, WorkoutPlanRepository workoutPlanRepository) {
        this.workoutTaskRepository = workoutTaskRepository;
        this.workoutPlanRepository = workoutPlanRepository;
    }

    @Override
    public List<WorkoutPlan> getAllWorkoutPlans() {
        return null;
    }

    @Override
    public WorkoutPlan getWorkoutPlanById(Long id) {
        return null;
    }

    @Override
    public WorkoutPlan saveWorkoutPlan(WorkoutPlan workoutPlan, Long trainerId, Long userId) {
        return null;
    }


    @Override
    public WorkoutPlan updateWorkoutPlan(Long id, WorkoutPlan workoutPlan) {
        return null;
    }

    @Override
    public void removeById(Long id) {
        workoutTaskRepository.deleteById(id);
    }
}
