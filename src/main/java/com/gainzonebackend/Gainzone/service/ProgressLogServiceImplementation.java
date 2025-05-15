package com.gainzonebackend.Gainzone.service;

import com.gainzonebackend.Gainzone.model.ProgressLog;
import com.gainzonebackend.Gainzone.model.User;
import com.gainzonebackend.Gainzone.repository.ProgressLogRepository;
import com.gainzonebackend.Gainzone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressLogServiceImplementation implements ProgressLogService{


    private final ProgressLogRepository progressLogRepository;
    private final UserRepository userRepository;

    @Autowired
    public ProgressLogServiceImplementation(ProgressLogRepository progressLogRepository, UserRepository userRepository) {
        this.progressLogRepository = progressLogRepository;
        this.userRepository = userRepository;
    }

    @Override
    public List<ProgressLog> getAllProgressLogs() {
        return progressLogRepository.findAll();
    }

    @Override
    public ProgressLog getProgressLogById(Long id) {
        return progressLogRepository.findProgressLogById(id);
    }

    @Override
    public ProgressLog saveProgressLog(ProgressLog progressLog, Long userId) {
        User user = userRepository.findUserById(userId);
        progressLog.setUser(user);
        return progressLogRepository.save(progressLog);
    }

    @Override
    public ProgressLog updateProgressLog(Long id, ProgressLog progressLog) {
        ProgressLog existProgressLog = progressLogRepository.findProgressLogById(id);
        if(existProgressLog != null) {
            existProgressLog.setWeight(progressLog.getWeight());
            existProgressLog.setBodyFatPercentage(progressLog.getBodyFatPercentage());
            existProgressLog.setCaloriesBurned(progressLog.getCaloriesBurned());
            existProgressLog.setLoggedAt(progressLog.getLoggedAt());
            return progressLogRepository.save(progressLog);
        }
        return null;
    }

    @Override
    public void removeById(Long id) {
        progressLogRepository.deleteById(id);
    }
}
