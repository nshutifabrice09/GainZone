package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.WorkoutPlan;
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
        return workoutTaskRepository.findAll();
    }

    @Override
    public WorkoutTask getWorkoutTaskById(Long id) {
        return workoutTaskRepository.findWorkoutTaskById(id);
    }

    @Override
    public WorkoutTask saveWorkoutTask(WorkoutTask workoutTask, Long workoutPlanId) {
        WorkoutPlan workoutPlan = workoutPlanRepository.findWorkoutPlanById(workoutPlanId);
        workoutTask.setWorkoutPlan(workoutPlan);
        return workoutTaskRepository.save(workoutTask);
    }

    @Override
    public WorkoutTask updateWorkoutTask(Long id, WorkoutTask workoutTask) {
        WorkoutTask existWorkoutTask = workoutTaskRepository.findWorkoutTaskById(id);
        if(existWorkoutTask != null){
            existWorkoutTask.setExerciseName(workoutTask.getExerciseName());
            existWorkoutTask.setSets(workoutTask.getSets());
            existWorkoutTask.setReps(workoutTask.getReps());
            existWorkoutTask.setDuration(workoutTask.getDuration());
            existWorkoutTask.setCompleted(workoutTask.getCompleted());
            return workoutTaskRepository.save(existWorkoutTask);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {
        workoutTaskRepository.deleteById(id);
    }
}
