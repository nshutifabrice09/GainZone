package com.gainzonebackend.Gainzone.repository;

import com.gainzonebackend.Gainzone.model.ProgressLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgressLogRepository extends JpaRepository <ProgressLog, Long> {
}
