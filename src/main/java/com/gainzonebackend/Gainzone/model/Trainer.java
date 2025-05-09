package com.gainzonebackend.Gainzone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@Table(name = "trainers")
@NoArgsConstructor
@AllArgsConstructor
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cid;
    private String firstName;
    private String lastName;
    private String profilePictureUrl;
    private String certifications;
    private Double rating;
    private String phoneNumber;
    private String password;
    private String profession;

    @OneToMany(mappedBy = "trainer")
    private List<WorkoutPlan> workoutPlan;

    @OneToMany(mappedBy = "trainer")
    private List<User> users;

    @OneToMany(mappedBy = "trainer")
    private List<NutritionPlan> nutritionPlans;
}
