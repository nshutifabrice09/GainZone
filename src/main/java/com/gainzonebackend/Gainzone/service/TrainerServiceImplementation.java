package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Trainer;
import com.gainzonebackend.Gainzone.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImplementation implements TrainerService{

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerServiceImplementation(TrainerRepository trainerRepository){
        this.trainerRepository = trainerRepository;
    }
    @Override
    public List<Trainer> getAllTrainers() {
        return null;
    }

    @Override
    public Trainer getTrainerByCid(String cid) {
        return null;
    }

    @Override
    public Trainer saveTrainer(Trainer trainer) {
        return null;
    }

    @Override
    public Trainer updateTrainer(String cid, Trainer trainer) {
        return null;
    }

    @Override
    public void removeByCid(String cid) {

    }

    @Override
    public Trainer getTrainerById(Long id) {
        return null;
    }
}
