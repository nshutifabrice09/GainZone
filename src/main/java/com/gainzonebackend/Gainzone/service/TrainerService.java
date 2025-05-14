package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Trainer;

import java.util.List;

public interface TrainerService {

    List<Trainer> getAllTrainers();
    Trainer getTrainerById(Long id);
    Trainer saveTrainer(Trainer trainer);

    Trainer updateTrainer(Long id, Trainer trainer);

    void removeById(Long id);

}
