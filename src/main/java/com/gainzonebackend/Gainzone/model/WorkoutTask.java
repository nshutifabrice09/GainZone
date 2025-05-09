package com.gainzonebackend.Gainzone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private Integer duration;
    private String videoUrl;
    private LocalDateTime scheduledDate;
    private Boolean completed;
    @ManyToOne
    @JoinColumn(name = "workout_plan_id")
    @JsonIgnore
    private WorkoutPlan workoutPlan;


}
