package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Meal;
import com.gainzonebackend.Gainzone.model.NutritionPlan;
import com.gainzonebackend.Gainzone.repository.MealRepository;
import com.gainzonebackend.Gainzone.repository.NutritionPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImplementation implements MealService{

    private final MealRepository mealRepository;
    private final NutritionPlanRepository nutritionPlanRepository;
    @Autowired
    public MealServiceImplementation(MealRepository mealRepository, NutritionPlanRepository nutritionPlanRepository) {
        this.mealRepository = mealRepository;
        this.nutritionPlanRepository = nutritionPlanRepository;
    }


    @Override
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    @Override
    public Meal getMealById(Long id) {
        return mealRepository.findMealById(id);
    }


    @Override
    public Meal saveMeal(Meal meal, Long nutritionPlanId) {
        NutritionPlan nutritionPlan = nutritionPlanRepository.findNutritionById(nutritionPlanId);
        meal.setNutritionPlan(nutritionPlan);
        return mealRepository.save(meal);
    }

    @Override
    public Meal updateMeal(Long id, Meal meal) {
        return null;
    }


    @Override
    public void removeById(Long id) {
        mealRepository.deleteById(id);
    }
}
