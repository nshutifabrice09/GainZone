package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
