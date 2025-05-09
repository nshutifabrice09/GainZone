package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainerRepository extends JpaRepository <Trainer, Long> {
}
