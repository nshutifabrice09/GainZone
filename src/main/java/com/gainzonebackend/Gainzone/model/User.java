package com.gainzonebackend.Gainzone.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name="users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String membershipId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String address;
    private int age;
    private int weight;

}
