package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.model.Meal;
import com.gainzonebackend.Gainzone.repository.MealRepository;
import com.gainzonebackend.Gainzone.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class MealController {

    private final MealService mealService;

    @Autowired
    public MealController(MealService mealService){
        this.mealService = mealService;
    }

    @PostMapping("/meal/{nutritionPlanId}")
    public Meal save(@RequestBody Meal meal, @PathVariable Long nutritionPlanId){
        return mealService.saveMeal(meal, nutritionPlanId);
    }
}
