package com.gainzonebackend.Gainzone.controller;


import com.gainzonebackend.Gainzone.model.WorkoutPlan;
import com.gainzonebackend.Gainzone.service.WorkoutPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class WorkoutPlanController {

    private final WorkoutPlanService workoutPlanService;

    @Autowired
    public WorkoutPlanController(WorkoutPlanService workoutPlanService) {
        this.workoutPlanService = workoutPlanService;
    }

    @PostMapping("/workoutPlan/{trainerId}/{userId}")
    public WorkoutPlan save(@RequestBody WorkoutPlan workoutPlan,
                            @PathVariable ("trainerId") Long trainerId,
                            @PathVariable ("userId") Long userId){
        return workoutPlanService.saveWorkoutPlan(workoutPlan, trainerId, userId);
    }
}
