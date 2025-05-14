package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.service.NutritionPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class NutritionPlanController {

    private final NutritionPlanService nutritionPlanService;

    @Autowired
    public NutritionPlanController(NutritionPlanService nutritionPlanService){
        this.nutritionPlanService= nutritionPlanService;
    }
    
}
