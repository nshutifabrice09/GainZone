package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.WorkoutTask;

import java.util.List;

public interface WorkoutTaskService {
    List<WorkoutTask> getAllWorkoutTasks();
    WorkoutTask getWorkoutTaskById(Long id);
    WorkoutTask saveWorkoutTask(WorkoutTask workoutTask, Long workoutPlanId);
    WorkoutTask updateWorkoutTask(Long id, WorkoutTask workoutTask);
    void removeById(Long id);
}
