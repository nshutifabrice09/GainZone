package com.gainzonebackend.Gainzone.controller;

import com.gainzonebackend.Gainzone.model.ProgressLog;
import com.gainzonebackend.Gainzone.service.ProgressLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProgressLogController {

    private final ProgressLogService progressLogService;

    @Autowired
    public ProgressLogController(ProgressLogService progressLogService) {
        this.progressLogService = progressLogService;
    }

    @PostMapping("/progressLog/{userId}")
    public ProgressLog save(@RequestBody ProgressLog progressLog, @PathVariable ("userId") Long userId){
        return progressLogService.saveProgressLog(progressLog, userId);
    }

    @GetMapping("/progressLogs")
    public List<ProgressLog> progressLogList(){
        return progressLogService.getAllProgressLogs();
    }

    @GetMapping("/progressLogs/{id}")
    public ProgressLog getProgressLogById(@PathVariable ("id") Long id){
        return progressLogService.getProgressLogById(id);
    }

    @PutMapping("/update/progressLog/{id}")
    public ProgressLog updateProgressLog(@RequestBody ProgressLog progressLog, @PathVariable ("id") Long id){
        return progressLogService.updateProgressLog(id, progressLog);
    }

    @DeleteMapping("/delete/progressLog/{id}")
    public void removeById(@PathVariable ("id") Long id){
        progressLogService.removeById(id);
    }
}
