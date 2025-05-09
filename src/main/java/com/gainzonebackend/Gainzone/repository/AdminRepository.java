package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository <Admin, Long> {
}
