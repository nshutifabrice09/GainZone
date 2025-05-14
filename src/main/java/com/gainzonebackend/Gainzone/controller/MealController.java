package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.repository.MealRepository;
import com.gainzonebackend.Gainzone.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class MealController {

    private final MealService mealService;

    @Autowired
    public MealController(MealService mealService){
        this.mealService = mealService;
    }

    @PostMapping("/meal/{}")
}
