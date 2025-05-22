package com.gainzonebackend.Gainzone.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@Entity
@Table(name = "progress_logs")
@NoArgsConstructor
@AllArgsConstructor

public class ProgressLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double weight;
    private Double bodyFatPercentage;
    private Integer caloriesBurned;
    private LocalDate loggedAt;

    @ManyToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(Double bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public Integer getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(Integer caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }

    public LocalDate getLoggedAt() {
        return loggedAt;
    }

    public void setLoggedAt(LocalDate loggedAt) {
        this.loggedAt = loggedAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
