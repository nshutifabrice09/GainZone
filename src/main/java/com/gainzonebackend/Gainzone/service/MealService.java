package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Meal;

import java.util.List;

public interface MealService {
    List<Meal> getAllMeals();
    Meal getMealById(Long id);
    Meal saveMeal(Meal meal);
    Meal updateMeal(Long id, Meal meal);
    void removeById(Long id);
}
