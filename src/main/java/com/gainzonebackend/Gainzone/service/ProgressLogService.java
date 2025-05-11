package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.ProgressLog;

import java.util.List;

public interface ProgressLogService {
    List<ProgressLog> getAllProgressLogs();
    ProgressLog getProgressLogById(Long id);
    ProgressLog saveProgressLog(ProgressLog progressLog);
    ProgressLog updateProgressLog(Long id, ProgressLog progressLog);
    void removeById(Long id);
}
