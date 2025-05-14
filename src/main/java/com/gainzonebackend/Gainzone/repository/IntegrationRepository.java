package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.Integration;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegrationRepository extends JpaRepository <Integration, Long> {
}