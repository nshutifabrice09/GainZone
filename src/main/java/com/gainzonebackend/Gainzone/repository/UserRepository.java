package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
