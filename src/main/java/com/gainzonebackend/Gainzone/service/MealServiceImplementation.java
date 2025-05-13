package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Meal;
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
        return mealRepository.findById(id);
    }

    @Override
    public Meal saveMeal(Meal meal, Long nutritionPlanId) {

    }


    @Override
    public void removeById(Long id) {

    }
}
