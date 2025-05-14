package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.NutritionPlan;

import java.util.List;

public interface NutritionPlanService {
    List<NutritionPlan> getAllNutritionPlans();
    NutritionPlan getNutritionPlanById(Long id);
    NutritionPlan saveNutritionPlan(NutritionPlan nutritionPlan, Long trainerId, Long userId);
    NutritionPlan updateNutritionPlan(Long id, NutritionPlan nutritionPlan);
    void removeById(Long id);
}
