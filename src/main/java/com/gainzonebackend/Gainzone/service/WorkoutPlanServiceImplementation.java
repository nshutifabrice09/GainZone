package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.Trainer;
import com.gainzonebackend.Gainzone.model.User;
import com.gainzonebackend.Gainzone.model.WorkoutPlan;
import com.gainzonebackend.Gainzone.repository.TrainerRepository;
import com.gainzonebackend.Gainzone.repository.UserRepository;
import com.gainzonebackend.Gainzone.repository.WorkoutPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkoutPlanServiceImplementation implements WorkoutPlanService{

    private final WorkoutPlanRepository workoutPlanRepository;
    private final TrainerRepository trainerRepository;
    private final UserRepository userRepository;

    @Autowired
    public WorkoutPlanServiceImplementation(WorkoutPlanRepository workoutPlanRepository, TrainerRepository trainerRepository, UserRepository userRepository) {
        this.workoutPlanRepository = workoutPlanRepository;
        this.trainerRepository = trainerRepository;
        this.userRepository = userRepository;
    }


    @Override
    public List<WorkoutPlan> getAllWorkoutPlans() {
        return workoutPlanRepository.findAll();
    }

    @Override
    public WorkoutPlan getWorkoutPlanById(Long id) {
        return workoutPlanRepository.findWorkoutPlanById(id);
    }

    @Override
    public WorkoutPlan saveWorkoutPlan(WorkoutPlan workoutPlan, Long trainerId, Long userId) {
        Trainer trainer = trainerRepository.findTrainerById(trainerId);
        User user = userRepository.findUserById(userId);
        workoutPlan.setTrainer(trainer);
        workoutPlan.setUser(user);
        return workoutPlanRepository.save(workoutPlan);
    }
    @Override
    public WorkoutPlan updateWorkoutPlan(Long id, WorkoutPlan workoutPlan) {
        WorkoutPlan existWorkoutPlan = workoutPlanRepository.findWorkoutPlanById(id);
        if(existWorkoutPlan !=null){
            existWorkoutPlan.setTitle(workoutPlan.getTitle());
            existWorkoutPlan.setDescription(workoutPlan.getDescription());
            existWorkoutPlan.setUpdatedAt(workoutPlan.getUpdatedAt());
            return workoutPlanRepository.save(workoutPlan);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {

    }
}
