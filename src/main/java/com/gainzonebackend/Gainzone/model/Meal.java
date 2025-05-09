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
@Table(name = "meals")
@NoArgsConstructor
@AllArgsConstructor
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String ingredients;
    private Integer calories;
    private LocalDateTime scheduledDate;
    private Boolean logged;

    @ManyToOne
    @JoinColumn(name = "nutrition_plan_id")
    @JsonIgnore
    private NutritionPlan nutritionPlan;

}
