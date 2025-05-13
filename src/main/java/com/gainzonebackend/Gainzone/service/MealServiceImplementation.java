package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Meal;
import com.gainzonebackend.Gainzone.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealServiceImplementation implements MealService{

    private final MealRepository mealRepository;

    @Autowired
    public MealServiceImplementation(MealRepository mealRepository) {
        this.mealRepository = mealRepository;

    }


    @Override
    public List<Meal> getAllMeals() {
        return null;
    }

    @Override
    public Meal getMealById(Long id) {
        return null;
    }

    @Override
    public Meal saveMeal(Meal meal, Long nutritionPlanId) {
        return null;
    }


    @Override
    public void removeById(Long id) {

    }
}
