package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.model.WorkoutTask;
import com.gainzonebackend.Gainzone.service.WorkoutTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class WorkoutTaskController {

    private final WorkoutTaskService workoutTaskService;

    @Autowired
    public WorkoutTaskController(WorkoutTaskService workoutTaskService) {
        this.workoutTaskService = workoutTaskService;
    }

    @PostMapping("/workoutTask/{workoutPlanId}")
    public WorkoutTask save(@RequestBody WorkoutTask workoutTask, @PathVariable ("workoutPlanId") Long workoutPlanId){
        return workoutTaskService.saveWorkoutTask(workoutTask, workoutPlanId);
    }
}
