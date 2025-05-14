package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.NutritionPlan;
import com.gainzonebackend.Gainzone.repository.NutritionPlanRepository;
import com.gainzonebackend.Gainzone.repository.TrainerRepository;
import com.gainzonebackend.Gainzone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionPlanServiceImplementation implements NutritionPlanService{

    private final NutritionPlanRepository nutritionPlanRepository;
    private final TrainerRepository trainerRepository;
    private final UserRepository userRepository;

    @Autowired
    public NutritionPlanServiceImplementation(NutritionPlanRepository nutritionPlanRepository, TrainerRepository trainerRepository, UserRepository userRepository) {
        this.nutritionPlanRepository = nutritionPlanRepository;
        this.trainerRepository = trainerRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<NutritionPlan> getAllNutritionPlans() {
        return null;
    }

    @Override
    public NutritionPlan getNutritionPlanById(Long id) {
        return null;
    }

    @Override
    public NutritionPlan saveNutritionPlan(NutritionPlan nutritionPlan, Long trainerId, Long userId) {
        return null;
    }


    @Override
    public NutritionPlan updateNutritionPlan(Long id, NutritionPlan nutritionPlan) {
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
