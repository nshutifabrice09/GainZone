package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.WorkoutTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkoutTaskRepository extends JpaRepository <WorkoutTask, Long>{
}
