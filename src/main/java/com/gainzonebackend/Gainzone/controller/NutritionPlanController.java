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

    @GetMapping("/nutritionPlan/{id}")
    public NutritionPlan getNutritionPlanById(@PathVariable ("id") Long id){
        return nutritionPlanService.getNutritionPlanById(id);
    }

    @PutMapping("/update/nutritionPlan/{id}")
    public NutritionPlan updateNutritionPlan(@PathVariable ("id") Long id, @RequestBody NutritionPlan nutritionPlan){
        return nutritionPlanService.updateNutritionPlan(id, nutritionPlan);
    }

    @DeleteMapping("/delete/nutritionPlan/{id}")
    public void removeById(@PathVariable ("id") Long id){
        nutritionPlanService.removeById(id);
    }
}
