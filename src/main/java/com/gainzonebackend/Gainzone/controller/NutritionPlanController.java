package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.model.NutritionPlan;
import com.gainzonebackend.Gainzone.service.NutritionPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class NutritionPlanController {

    private final NutritionPlanService nutritionPlanService;

    @Autowired
    public NutritionPlanController(NutritionPlanService nutritionPlanService){
        this.nutritionPlanService= nutritionPlanService;
    }

    @PostMapping("/nutritionPlan/{trainerId}/{userId}")
    public NutritionPlan saveNutritionPlan(@RequestBody NutritionPlan nutritionPlan,
                                           @PathVariable Long trainerId,
                                           @PathVariable Long userId){
        return nutritionPlanService.saveNutritionPlan(nutritionPlan, trainerId, userId);
    }

    @GetMapping("/nutritionPlans")
    public List<NutritionPlan> nutritionPlanList(){
        return nutritionPlanService.getAllNutritionPlans();
    }
}
