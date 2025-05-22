package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.model.Meal;
import com.gainzonebackend.Gainzone.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class MealController {

    private final MealService mealService;

    @Autowired
    public MealController(MealService mealService){
        this.mealService = mealService;
    }

    @PostMapping("/meal/{nutritionPlanId}")
    public Meal save(@RequestBody Meal meal, @PathVariable ("nutritionPlanId") Long nutritionPlanId){
        return mealService.saveMeal(meal, nutritionPlanId);
    }

    @GetMapping("/meals")
    public List<Meal> mealList(){
        return mealService.getAllMeals();
    }

    @GetMapping("/meal/{id}")
    public Meal getMealById(@PathVariable ("id") Long id){
        return mealService.getMealById(id);
    }


    @PutMapping("/meal/meal/{id}")
    public Meal updateMeal(@PathVariable ("id") Long id, @RequestBody Meal meal){
        return mealService.updateMeal(id, meal);
    }
    @DeleteMapping("/meals/meal/{id}")
    public void removeById(@PathVariable ("id") Long id){
        mealService.removeById(id);
    }
}
