package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.NutritionPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionPlanRepository extends JpaRepository <NutritionPlan, Long> {
}
