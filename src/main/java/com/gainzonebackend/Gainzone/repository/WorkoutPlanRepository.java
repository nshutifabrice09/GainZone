package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.WorkoutPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkoutPlanRepository extends JpaRepository<WorkoutPlan, Long> {
}
