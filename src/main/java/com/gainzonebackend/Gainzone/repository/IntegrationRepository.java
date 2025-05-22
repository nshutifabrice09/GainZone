package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.Integration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntegrationRepository extends JpaRepository <Integration, Long> {
    Integration findIntegrationById(Long id);
}