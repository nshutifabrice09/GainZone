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
        return trainerRepository.findAll();
    }

    @Override
    public Trainer saveTrainer(Trainer trainer) {
        return trainerRepository.save(trainer);
    }

    @Override
    public Trainer updateTrainer(Long id, Trainer trainer) {
        Trainer existTrainer = trainerRepository.findTrainerById(id);
        if(existTrainer != null){
            existTrainer.setFirstName(trainer.getFirstName());
            existTrainer.setLastName(trainer.getLastName());
            existTrainer.setProfilePictureUrl(trainer.getProfilePictureUrl());
            existTrainer.setCertifications(trainer.getCertifications());
            existTrainer.setRating(trainer.getRating());
            existTrainer.setPhoneNumber(trainer.getPhoneNumber());
            existTrainer.setPassword(trainer.getPassword());
            existTrainer.setProfession(trainer.getProfession());
            return trainerRepository.save(existTrainer);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public Trainer getTrainerById(Long id) {
        return trainerRepository.findTrainerById(id);
    }
}
