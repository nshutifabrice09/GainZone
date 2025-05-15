package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.model.Trainer;
import com.gainzonebackend.Gainzone.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class TrainerController {
    private final TrainerService trainerService;

    @Autowired
    public TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @PostMapping("/trainer")
    public Trainer save(@RequestBody Trainer trainer){
        return trainerService.saveTrainer(trainer);
    }

    @GetMapping("/trainers")
    public List<Trainer> trainerList(){
        return trainerService.getAllTrainers();
    }

    @GetMapping("/trainers/{id}")
    public Trainer getTrainerById(@PathVariable("id") Long id){
        return trainerService.getTrainerById(id);
    }


    @DeleteMapping("/trainers/trainer/{id}")
    public void removeById(@PathVariable("id") Long id){
        trainerService.removeById(id);
    }

    @PutMapping("/trainer/trainer/{id}")
    public Trainer updateTrainer(@PathVariable("id") Long id, @RequestBody Trainer trainer){
        return trainerService.updateTrainer(id, trainer);
    }
}
