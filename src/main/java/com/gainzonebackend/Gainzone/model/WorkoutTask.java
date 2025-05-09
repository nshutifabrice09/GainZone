package com.gainzonebackend.Gainzone.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "workout_taks")
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String exerciseName;
    private Integer sets;
    private Integer reps;
    
}
