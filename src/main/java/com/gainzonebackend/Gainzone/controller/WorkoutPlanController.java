package com.gainzonebackend.Gainzone.controller;


import com.gainzonebackend.Gainzone.model.WorkoutPlan;
import com.gainzonebackend.Gainzone.model.WorkoutTask;
import com.gainzonebackend.Gainzone.service.WorkoutPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/workoutPlans")
    public List<WorkoutPlan> workoutPlanList(){
        return workoutPlanService.getAllWorkoutPlans();
    }

    @GetMapping("/workoutPlan/{id}")
    public WorkoutPlan getWorkoutPlanById(@PathVariable ("id") Long id){
        return workoutPlanService.getWorkoutPlanById(id);
    }

    @PutMapping("/update/workoutPlan/{id}")
    public WorkoutPlan updateWorkoutPlan(@PathVariable ("id") Long id, @RequestBody WorkoutPlan workoutPlan){
        return workoutPlanService.updateWorkoutPlan(id, workoutPlan);
    }


    @DeleteMapping("/delete/workoutPlan/{id}")
    public void removeById(@PathVariable ("id") Long id){
        workoutPlanService.removeById(id);
    }


}
