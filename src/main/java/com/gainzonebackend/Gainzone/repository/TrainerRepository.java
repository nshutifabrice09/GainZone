package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository <Trainer, Long> {
    Trainer findTrainerById(Long id);
}
