package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.WorkoutTask;
import com.gainzonebackend.Gainzone.repository.WorkoutPlanRepository;
import com.gainzonebackend.Gainzone.repository.WorkoutTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutTaskServiceImplementation implements WorkoutTaskService{

    private final WorkoutTaskRepository workoutTaskRepository;
    private final WorkoutPlanRepository workoutPlanRepository;

    @Autowired
    public WorkoutTaskServiceImplementation(WorkoutTaskRepository workoutTaskRepository, WorkoutPlanRepository workoutPlanRepository) {
        this.workoutTaskRepository = workoutTaskRepository;
        this.workoutPlanRepository = workoutPlanRepository;
    }


    @Override
    public List<WorkoutTask> getAllWorkoutTasks() {
        return null;
    }

    @Override
    public WorkoutTask getWorkoutTaskById(Long id) {
        return null;
    }

    @Override
    public WorkoutTask saveWorkoutTask(WorkoutTask workoutTask, Long workoutPlanId) {
        return null;
    }

    @Override
    public WorkoutTask updateWorkoutTask(Long id, WorkoutTask workoutTask) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
