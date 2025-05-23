package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository <Meal, Long> {
    Meal findMealById(Long id);
}
